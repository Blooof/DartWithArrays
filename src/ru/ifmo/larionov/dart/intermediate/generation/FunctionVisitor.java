package ru.ifmo.larionov.dart.intermediate.generation;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import ru.ifmo.larionov.dart.grammar.SimpleDartWithArraysParser;
import ru.ifmo.larionov.dart.intermediate.*;
import ru.ifmo.larionov.dart.intermediate.exception.GenerationException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.objectweb.asm.Opcodes.ACC_PUBLIC;
import static org.objectweb.asm.Opcodes.ACC_STATIC;
import static ru.ifmo.larionov.dart.grammar.SimpleDartWithArraysParser.BlockStatementContext;
import static ru.ifmo.larionov.dart.grammar.SimpleDartWithArraysParser.VariableDeclarationStatementContext;

/**
 * @author Oleg Larionov
 */
public class FunctionVisitor {
    private SymbolTable symbolTable;
    private ClassWriter writer;

    public FunctionVisitor(SymbolTable symbolTable, ClassWriter writer) {
        this.symbolTable = symbolTable;
        this.writer = writer;
    }

    public void visitFunctionDeclaration(SimpleDartWithArraysParser.FunctionDeclarationContext function) {
        symbolTable.newScope();

        Function f = buildFunction(function);
        symbolTable.defineFunction(f);

        Type[] argTypes = f.getArguments()
                .stream()
                .flatMap(variable -> Stream.of(variable.getValueType().toAsmType()))
                .toArray(Type[]::new);
        String descriptor = Type.getMethodDescriptor(f.getReturnValueType().toAsmType(), argTypes);
        if ("main".equals(f.getName())) {
            if (!f.getArguments().isEmpty()) {
                throw new GenerationException("Main function must have zero arguments");
            }
            descriptor = Type.getMethodDescriptor(Type.VOID_TYPE, Type.getType(String[].class));
        }
        MethodVisitor method = writer.visitMethod(ACC_PUBLIC | ACC_STATIC, f.getName(), descriptor, null, null);

        for (BlockStatementContext blockStatement : function.functionBody().block().blockStatement()) {
            visitBlockStatement(blockStatement);
        }

        method.visitInsn(Opcodes.RETURN);
        method.visitMaxs(0, 0);
        method.visitEnd();

        symbolTable.dropScope();
    }

    private void visitBlockStatement(BlockStatementContext blockStatement) {
        if (blockStatement.variableDeclarationStatement() != null) {
            visitVariableDeclaration(blockStatement.variableDeclarationStatement());
        }
    }

    private void visitVariableDeclaration(VariableDeclarationStatementContext variableDeclaration) {
        ValueType type = ValueType.fromString(variableDeclaration.getText());

    }

    private List<Variable> parseArguments(SimpleDartWithArraysParser.FunctionDeclarationContext function) {
        List<Variable> args = new ArrayList<>();
        SimpleDartWithArraysParser.VariableListContext variableListContext = function.functionParameters().variableList();
        if (variableListContext != null) {
            for (SimpleDartWithArraysParser.VariableContext argContext : variableListContext.variable()) {
                String argName = argContext.IDENT().getText();
                ValueType argValueType = ValueType.fromString(argContext.variableType().getText());
                Variable arg = new VariableImpl(argName, argValueType);
                args.add(arg);
            }
        }
        return args;
    }

    private Function buildFunction(SimpleDartWithArraysParser.FunctionDeclarationContext function) {
        String name = function.IDENT().getText();
        ValueType returnValueType = ValueType.fromString(function.typeIdentifier().getText());
        List<Variable> args = parseArguments(function);
        return new FunctionImpl(name, returnValueType, args);
    }
}
