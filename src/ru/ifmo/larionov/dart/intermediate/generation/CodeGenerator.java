package ru.ifmo.larionov.dart.intermediate.generation;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import ru.ifmo.larionov.dart.intermediate.SymbolTable;
import ru.ifmo.larionov.dart.intermediate.ValueType;
import ru.ifmo.larionov.dart.intermediate.Variable;
import ru.ifmo.larionov.dart.intermediate.exception.TypeCheckException;

import static org.objectweb.asm.Opcodes.*;
import static ru.ifmo.larionov.dart.grammar.SimpleDartWithArraysParser.*;

/**
 * @author Oleg Larionov
 */
public class CodeGenerator {
    public static final String CLASS_NAME = "Main";
    private ClassWriter writer;
    private MethodVisitor method;
    private SymbolTable symbolTable;

    public CodeGenerator(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    public byte[] visit(CompilationUnitContext ctx) {
        writer = new ClassWriter(ClassWriter.COMPUTE_FRAMES | ClassWriter.COMPUTE_MAXS);
        visitCompilationUnit(ctx);
        return writer.toByteArray();
    }

    private void visitCompilationUnit(CompilationUnitContext ctx) {
        writer.visit(V1_7, ACC_PUBLIC, "Main", null, "java/lang/Object", null);

        if (!ctx.globalVariableDeclaration().isEmpty()) {
            method = writer.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);

            for (GlobalVariableDeclarationContext globalVariable : ctx.globalVariableDeclaration()) {
                new GlobalVariableVisitor(symbolTable, writer).visitGlobalVariable(globalVariable);
            }

            method.visitInsn(Opcodes.RETURN);
            method.visitMaxs(0, 0);
            method.visitEnd();
        }

        for (FunctionDeclarationContext function : ctx.functionDeclaration()) {
            new FunctionVisitor(symbolTable, writer).visitFunctionDeclaration(function);
        }

        writer.visitEnd();
    }

    private ValueType visitExpression(ExpressionContext expression) {
        if (expression.ariphExpression() != null) {
            return visitAriphExpression(expression.ariphExpression());
        } else {
            return null;
        }
    }

    private ValueType visitSimpleExpression(SimpleExpressionContext simple) {
        if (simple.ident != null) {
            String name = simple.IDENT().getText();
            Variable var = symbolTable.findVariable(name);
            if (simple.arrayIdent() != null) {
                return null;
            } else {
                if (symbolTable.isGlobalVariable(name)) {
                    method.visitFieldInsn(GETSTATIC, CLASS_NAME, name, var.getValueType().getDescriptor());
                } else {
                    method.visitVarInsn(ILOAD, var.getId());
                }
                return var.getValueType();
            }
        } else {
            return visitExpression(simple.expression());
        }
    }

    private ValueType visitAriphExpression(AriphExpressionContext ariphExpression) {
        if (ariphExpression.ariphExpression() != null) {
            ValueType lValueType = visitAriphExpression(ariphExpression.ariphExpression());
            ValueType rValueType = visitAriphTerm(ariphExpression.ariphTerm());
            if (rValueType != lValueType) {
                throw new TypeCheckException(lValueType, rValueType, ariphExpression.toString());
            }
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
            if (rValueType != lValueType) {
                throw new TypeCheckException(lValueType, rValueType, ariphTerm.toString());
            }
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
            if (valueType != ValueType.INT) {
                throw new TypeCheckException(ValueType.INT, valueType, ariphFactor.getText());
            }
            method.visitInsn(INEG);
            return valueType;
        }
        return visitSimpleExpression(ariphFactor.simpleExpression());
    }


}
