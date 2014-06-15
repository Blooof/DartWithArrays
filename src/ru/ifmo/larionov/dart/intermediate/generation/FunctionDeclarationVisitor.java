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

import static org.objectweb.asm.Opcodes.*;
import static ru.ifmo.larionov.dart.grammar.SimpleDartWithArraysParser.*;
import static ru.ifmo.larionov.dart.intermediate.generation.TypeChecker.typeCheck;

/**
 * @author Oleg Larionov
 */
public class FunctionDeclarationVisitor {
    private SymbolTable symbolTable;
    private ClassWriter writer;
    private MethodVisitor method;
    private ValueType returnType;

    public FunctionDeclarationVisitor(SymbolTable symbolTable, ClassWriter writer) {
        this.symbolTable = symbolTable;
        this.writer = writer;
    }

    public void visitFunctionDeclaration(SimpleDartWithArraysParser.FunctionDeclarationContext function) {
        symbolTable.newScope();

        Function f = buildFunction(function);
        symbolTable.defineFunction(f);
        returnType = f.getReturnValueType();

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
        method = writer.visitMethod(ACC_PUBLIC | ACC_STATIC, f.getName(), descriptor, null, null);

        visitBlock(function.functionBody().block());

        method.visitInsn(Opcodes.RETURN);
        method.visitMaxs(0, 0);
        method.visitEnd();

        symbolTable.dropScope();
    }

    private void visitBlock(BlockContext block) {
        symbolTable.newScope();
        for (BlockStatementContext blockStatement : block.blockStatement()) {
            visitBlockStatement(blockStatement);
        }
        symbolTable.dropScope();
    }

    private void visitBlockStatement(BlockStatementContext blockStatement) {
        if (blockStatement.variableDeclarationStatement() != null) {
            visitVariableDeclaration(blockStatement.variableDeclarationStatement().variableDeclaration(), method);
        } else {
            visitStatement(blockStatement.statement());
        }
    }

    public void visitStatement(StatementContext statement) {
        if (statement.expression() != null) {
            new ExpressionVisitor(symbolTable, method).visitExpression(statement.expression());
        } else if (statement.assignment() != null) {
            visitAssignment(statement.assignment(), method);
        } else if (statement.block() != null) {
            visitBlock(statement.block());
        } else if (statement.jumpStatement() != null) {
            visitJumpStatement(statement.jumpStatement());
        } else if (statement.IF() != null) {
            new IfStatementVisitor(this, symbolTable, method).visitIfStatement(statement);
        }
    }

    private void visitJumpStatement(JumpStatementContext jumpStatement) {
        if (jumpStatement.returnSt != null) {
            if (jumpStatement.expression() == null) {
                typeCheck(returnType, ValueType.VOID, jumpStatement.getText());
                method.visitInsn(Opcodes.RETURN);
            } else {
                ValueType valueType = new ExpressionVisitor(symbolTable, method).visitExpression(jumpStatement.expression());
                typeCheck(returnType, valueType, jumpStatement.getText());
                method.visitInsn(IRETURN);
            }
            return;
        }
        throw new GenerationException("Illegal operation " + jumpStatement.getText());
    }

    private void visitAssignment(AssignmentContext assignment, MethodVisitor method) {
        String name = assignment.IDENT().getText();
        Variable variable = symbolTable.findVariable(name);
        if (assignment.arrayIdent() == null) {
            ValueType valueType = new ExpressionVisitor(symbolTable, method).visitExpression(assignment.expression());
            typeCheck(variable.getValueType(), valueType, assignment.getText());
            method.visitVarInsn(ISTORE, variable.getId());
        } else {
            // TODO array assignment
        }
    }

    private void visitVariableDeclaration(SimpleDartWithArraysParser.VariableDeclarationContext variableDeclaration, MethodVisitor method) {
        ValueType type = ValueType.fromString(variableDeclaration.variableType().getText());
        for (SimpleDartWithArraysParser.VariableDeclaratorContext declarator : variableDeclaration.variableDeclarators().variableDeclarator()) {
            String name = declarator.IDENT().getText();
            Variable variable = new VariableImpl(name, type);
            symbolTable.defineVariable(variable);
            if (declarator.variableInitializer() != null) {
                VariableInitializerContext variableInitializer = declarator.variableInitializer();
                if (variableInitializer.expression() != null) {
                    ValueType initType = new ExpressionVisitor(symbolTable, method).visitExpression(variableInitializer.expression());
                    typeCheck(type, initType, variableDeclaration.getText());
                    method.visitVarInsn(ISTORE, variable.getId());
                } else {
                    // TODO array init
                }
            }
        }
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
