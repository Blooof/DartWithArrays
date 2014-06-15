package ru.ifmo.larionov.dart.intermediate.generation;

import org.objectweb.asm.MethodVisitor;
import ru.ifmo.larionov.dart.intermediate.SymbolTable;
import ru.ifmo.larionov.dart.intermediate.ValueType;
import ru.ifmo.larionov.dart.intermediate.Variable;

import static org.objectweb.asm.Opcodes.*;
import static ru.ifmo.larionov.dart.grammar.SimpleDartWithArraysParser.*;
import static ru.ifmo.larionov.dart.intermediate.generation.TypeChecker.typeCheck;

/**
 * @author Oleg Larionov
 */
public class ExpressionVisitor {
    private SymbolTable symbolTable;
    private MethodVisitor method;

    public ExpressionVisitor(SymbolTable symbolTable, MethodVisitor method) {
        this.symbolTable = symbolTable;
        this.method = method;
    }

    public ValueType visitExpression(ExpressionContext expression) {
        return visitAriphExpression(expression.ariphExpression());
    }

    private ValueType visitSimpleExpression(SimpleExpressionContext simple) {
        if (simple.ident != null) {
            String name = simple.IDENT().getText();
            Variable var = symbolTable.findVariable(name);
            if (simple.arrayIdent() != null) {
                return null;
            } else {
                if (symbolTable.isGlobalVariable(name)) {
                    method.visitFieldInsn(GETSTATIC, CodeGenerator.CLASS_NAME, name, var.getValueType().getDescriptor());
                } else {
                    method.visitVarInsn(ILOAD, var.getId());
                }
                return var.getValueType();
            }
        } else if (simple.funcCall() != null) {
            return new FunctionCallVisitor(symbolTable, method).visitFunctionCall(simple.funcCall());
        } else {
            return visitExpression(simple.expression());
        }
    }

    public ValueType visitAriphExpression(AriphExpressionContext ariphExpression) {
        if (ariphExpression.ariphExpression() != null) {
            ValueType lValueType = visitAriphExpression(ariphExpression.ariphExpression());
            ValueType rValueType = visitAriphTerm(ariphExpression.ariphTerm());
            typeCheck(lValueType, rValueType, ariphExpression.getText());
            switch (ariphExpression.sign.getText()) {
                case "+":
                    method.visitInsn(IADD);
                    break;
                case "-":
                    method.visitInsn(ISUB);
                    break;
            }
            return lValueType;
        } else {
            return visitAriphTerm(ariphExpression.ariphTerm());
        }
    }

    private ValueType visitAriphTerm(AriphTermContext ariphTerm) {
        if (ariphTerm.ariphTerm() != null) {
            ValueType lValueType = visitAriphTerm(ariphTerm.ariphTerm());
            ValueType rValueType = visitAriphFactor(ariphTerm.ariphFactor());
            typeCheck(lValueType, rValueType, ariphTerm.getText());
            switch (ariphTerm.sign.getText()) {
                case "*":
                    method.visitInsn(IMUL);
                    break;
                case "/":
                    method.visitInsn(IDIV);
                    break;
            }
            return lValueType;
        } else {
            return visitAriphFactor(ariphTerm.ariphFactor());
        }
    }

    private ValueType visitAriphFactor(AriphFactorContext ariphFactor) {
        if (ariphFactor.num != null) {
            int n = Integer.parseInt(ariphFactor.getText());
            method.visitLdcInsn(n);
            return ValueType.INT;
        }
        if (ariphFactor.unary != null) {
            ValueType valueType = visitAriphFactor(ariphFactor.ariphFactor());
            typeCheck(ValueType.INT, valueType, ariphFactor.getText());
            method.visitInsn(INEG);
            return valueType;
        }
        return visitSimpleExpression(ariphFactor.simpleExpression());
    }
}
