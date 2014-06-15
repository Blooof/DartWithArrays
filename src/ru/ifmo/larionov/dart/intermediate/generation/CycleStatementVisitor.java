package ru.ifmo.larionov.dart.intermediate.generation;

import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import ru.ifmo.larionov.dart.intermediate.SymbolTable;

import static org.objectweb.asm.Opcodes.GOTO;
import static org.objectweb.asm.Opcodes.IFEQ;
import static ru.ifmo.larionov.dart.grammar.SimpleDartWithArraysParser.*;

/**
 * @author Oleg Larionov
 */
public class CycleStatementVisitor {
    private FunctionDeclarationVisitor functionDeclarationVisitor;
    private SymbolTable symbolTable;
    private MethodVisitor method;

    public CycleStatementVisitor(FunctionDeclarationVisitor functionDeclarationVisitor, SymbolTable symbolTable, MethodVisitor method) {
        this.functionDeclarationVisitor = functionDeclarationVisitor;
        this.symbolTable = symbolTable;
        this.method = method;
    }

    public void visitForStatement(ForStatementContext forStatement) {
        Label a = new Label();
        Label b = new Label();
        Label c = new Label();
        functionDeclarationVisitor.getCycleControl().save(b, c);
        ForControlContext forControl = forStatement.forControl();
        if (forControl.forInit() != null) {
            ForInitContext forInit = forControl.forInit();
            if (forInit.variableDeclaration() != null) {
                new VariableDeclarationVisitor(symbolTable, method).visitVariableDeclaration(forInit.variableDeclaration());
            }
        }
        method.visitLabel(a);
        if (forControl.logicalOr() != null) {
            new LogicalExpressionVisitor(symbolTable, method).visitOrExpression(forControl.logicalOr());
            method.visitJumpInsn(IFEQ, b);
        }
        functionDeclarationVisitor.visitStatement(forStatement.statement());
        method.visitLabel(c);
        if (forControl.forUpdate() != null) {
            new AssignmentVisitor(symbolTable, method).visitAssignment(forControl.forUpdate().assignment());
        }
        method.visitJumpInsn(GOTO, a);
        method.visitLabel(b);
        functionDeclarationVisitor.getCycleControl().drop();
    }
}
