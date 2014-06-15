package ru.ifmo.larionov.dart.intermediate.generation;

import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import ru.ifmo.larionov.dart.grammar.SimpleDartWithArraysParser;
import ru.ifmo.larionov.dart.intermediate.SymbolTable;
import ru.ifmo.larionov.dart.intermediate.ValueType;
import ru.ifmo.larionov.dart.intermediate.exception.GenerationException;

import java.util.List;

import static org.objectweb.asm.Opcodes.*;
import static ru.ifmo.larionov.dart.grammar.SimpleDartWithArraysParser.*;
import static ru.ifmo.larionov.dart.intermediate.generation.TypeChecker.typeCheck;

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
        visitOrExpression(statement.parExpression().logicalOr());
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

    private void visitOrExpression(SimpleDartWithArraysParser.LogicalOrContext orExpression) {
        List<LogicalAndContext> andExpressions = orExpression.logicalAnd();
        if (andExpressions.size() == 1) {
            visitAndExpression(andExpressions.get(0));
        } else {
            Label a = new Label();
            Label end = new Label();
            for (LogicalAndContext andExpression : andExpressions) {
                visitAndExpression(andExpression);
                method.visitJumpInsn(IFNE, a);
            }
            method.visitInsn(ICONST_0);
            method.visitJumpInsn(GOTO, end);
            method.visitLabel(a);
            method.visitInsn(ICONST_1);
            method.visitLabel(end);
        }
    }

    private void visitAndExpression(LogicalAndContext andExpression) {
        List<RelationalExprContext> relationalExpressions = andExpression.relationalExpr();
        if (relationalExpressions.size() == 1) {
            visitRelationalExpression(relationalExpressions.get(0));
        } else {
            Label a = new Label();
            Label end = new Label();
            for (RelationalExprContext relationalExpression : relationalExpressions) {
                visitRelationalExpression(relationalExpression);
                method.visitJumpInsn(IFEQ, a);
            }
            method.visitInsn(ICONST_1);
            method.visitJumpInsn(GOTO, end);
            method.visitLabel(a);
            method.visitInsn(ICONST_0);
            method.visitLabel(end);
        }
    }

    private void visitRelationalExpression(RelationalExprContext relationalExpression) {
        if (relationalExpression.id != null) {
            switch (relationalExpression.id.getText()) {
                case "true":
                    method.visitLdcInsn(1);
                    break;
                case "false":
                    method.visitLdcInsn(0);
                    break;
            }
        } else if (relationalExpression.NOT() != null) {
            method.visitLdcInsn(1);
            visitRelationalExpression(relationalExpression.relationalExpr());
            method.visitInsn(ISUB);
        } else if (relationalExpression.LPAREN() != null) {
            visitOrExpression(relationalExpression.logicalOr());
        } else {
            ValueType lValueType = new ExpressionVisitor(symbolTable, method)
                    .visitAriphExpression(relationalExpression.ariphExpression(0));
            ValueType rValueType = new ExpressionVisitor(symbolTable, method)
                    .visitAriphExpression(relationalExpression.ariphExpression(1));
            typeCheck(lValueType, rValueType, relationalExpression.getText());
            Label a = new Label();
            Label end = new Label();
            switch (relationalExpression.relOp.getText()) {
                case "<=":
                    method.visitJumpInsn(IF_ICMPGT, a);
                    break;
                case ">=":
                    method.visitJumpInsn(IF_ICMPLT, a);
                    break;
                case "==":
                    method.visitJumpInsn(IF_ICMPNE, a);
                    break;
                case "!=":
                    method.visitJumpInsn(IF_ICMPEQ, a);
                    break;
                case "<":
                    method.visitJumpInsn(IF_ICMPGE, a);
                    break;
                case ">":
                    method.visitJumpInsn(IF_ICMPLE, a);
                    break;
                default:
                    throw new GenerationException("Unknown operation " + relationalExpression.getText());
            }
            method.visitInsn(ICONST_1);
            method.visitJumpInsn(GOTO, end);
            method.visitLabel(a);
            method.visitInsn(ICONST_0);
            method.visitLabel(end);
        }
    }
}
