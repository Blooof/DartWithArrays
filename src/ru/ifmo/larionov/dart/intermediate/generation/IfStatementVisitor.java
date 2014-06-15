package ru.ifmo.larionov.dart.intermediate.generation;

import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import ru.ifmo.larionov.dart.intermediate.SymbolTable;

import java.util.List;

import static org.objectweb.asm.Opcodes.GOTO;
import static org.objectweb.asm.Opcodes.IFEQ;
import static ru.ifmo.larionov.dart.grammar.SimpleDartWithArraysParser.StatementContext;

/**
 * @author Oleg Larionov
 */
public class IfStatementVisitor {
    private FunctionDeclarationVisitor functionDeclarationVisitor;
    private SymbolTable symbolTable;
    private MethodVisitor method;

    public IfStatementVisitor(FunctionDeclarationVisitor functionDeclarationVisitor, SymbolTable symbolTable, MethodVisitor method) {
        this.functionDeclarationVisitor = functionDeclarationVisitor;
        this.symbolTable = symbolTable;
        this.method = method;
    }

    public void visitIfStatement(StatementContext statement) {
        new LogicalExpressionVisitor(symbolTable, method).visitOrExpression(statement.parExpression().logicalOr());
        List<StatementContext> ifStatements = statement.statement();
        Label a = new Label();
        Label end = new Label();
        method.visitJumpInsn(IFEQ, a);
        functionDeclarationVisitor.visitStatement(ifStatements.get(0));
        method.visitJumpInsn(GOTO, end);
        method.visitLabel(a);
        if (ifStatements.size() > 1) {
            functionDeclarationVisitor.visitStatement(ifStatements.get(1));
        }
        method.visitLabel(end);
    }
}
