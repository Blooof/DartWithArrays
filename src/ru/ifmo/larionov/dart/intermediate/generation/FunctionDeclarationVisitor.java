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
    private CycleControl cycleControl;

    public FunctionDeclarationVisitor(SymbolTable symbolTable, ClassWriter writer) {
        this.symbolTable = symbolTable;
        this.writer = writer;
        cycleControl = new CycleControl();
    }

    public void defineFunction(FunctionDeclarationContext function) {
        Function f = buildFunction(function);
        symbolTable.defineFunction(f);
    }

    public void visitFunctionDeclaration(FunctionDeclarationContext function) {
        symbolTable.newScope();

        Function f = buildFunction(function);
        returnType = f.getReturnValueType();

        f.getArguments()
                .stream()
                .forEach(symbolTable::defineVariable);
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

        BlockContext block = function.functionBody().block();
        visitBlock(block);
        checkReturn(block);

        method.visitMaxs(0, 0);
        method.visitEnd();

        symbolTable.dropScope();
    }

    private void checkReturn(BlockContext block) {
        if (returnType == ValueType.VOID) {
            method.visitInsn(Opcodes.RETURN);
            return;
        }
        if (block.blockStatement() != null) {
            int lastStatement = block.blockStatement().size() - 1;
            BlockStatementContext blockStatement = block.blockStatement(lastStatement);
            if (blockStatement.statement() != null) {
                StatementContext statement = blockStatement.statement();
                if (statement.jumpStatement() != null) {
                    JumpStatementContext jumpStatement = statement.jumpStatement();
                    if (jumpStatement.returnSt != null) {
                        return;
                    }
                }
            }
        }
        throw new GenerationException("Last statement of function with non-null return type must be return. String: "
                + block.getText());
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
            new VariableDeclarationVisitor(symbolTable, method)
                    .visitVariableDeclaration(blockStatement.variableDeclarationStatement().variableDeclaration());
        } else {
            visitStatement(blockStatement.statement());
        }
    }

    public void visitStatement(StatementContext statement) {
        if (statement.expression() != null) {
            new ExpressionVisitor(symbolTable, method).visitExpression(statement.expression());
        } else if (statement.assignment() != null) {
            new AssignmentVisitor(symbolTable, method).visitAssignment(statement.assignment());
        } else if (statement.block() != null) {
            visitBlock(statement.block());
        } else if (statement.jumpStatement() != null) {
            visitJumpStatement(statement.jumpStatement());
        } else if (statement.IF() != null) {
            new IfStatementVisitor(this, symbolTable, method).visitIfStatement(statement);
        } else if (statement.forStatement() != null) {
            new CycleStatementVisitor(this, symbolTable, method).visitForStatement(statement.forStatement());
        } else if (statement.WHILE() != null) {
            new CycleStatementVisitor(this, symbolTable, method).visitWhileStatement(statement);
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
                method.visitInsn(valueType == ValueType.LIST ? ARETURN : IRETURN);
            }
            return;
        } else if (jumpStatement.breakSt != null) {
            method.visitJumpInsn(GOTO, cycleControl.getBreak());
        } else {
            method.visitJumpInsn(GOTO, cycleControl.getContinue());
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

    public CycleControl getCycleControl() {
        return cycleControl;
    }
}
