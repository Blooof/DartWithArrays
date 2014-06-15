package ru.ifmo.larionov.dart.intermediate.generation;

import com.google.common.base.Preconditions;
import org.objectweb.asm.MethodVisitor;
import ru.ifmo.larionov.dart.intermediate.SymbolTable;
import ru.ifmo.larionov.dart.intermediate.ValueType;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.objectweb.asm.Opcodes.GETSTATIC;
import static org.objectweb.asm.Opcodes.INVOKEVIRTUAL;
import static org.objectweb.asm.Type.*;
import static ru.ifmo.larionov.dart.grammar.SimpleDartWithArraysParser.*;

/**
 * @author Oleg Larionov
 */
public class FunctionCallVisitor {
    private SymbolTable symbolTable;
    private MethodVisitor method;

    public FunctionCallVisitor(SymbolTable symbolTable, MethodVisitor method) {
        this.symbolTable = symbolTable;
        this.method = method;
    }

    public ValueType visitFunctionCall(FuncCallContext functionCall) {
        String funcName = functionCall.IDENT().getText();
        switch (funcName) {
            case "print":
                method.visitFieldInsn(GETSTATIC, getInternalName(System.class), "out",
                        getDescriptor(PrintStream.class));
                ExpressionListContext expressionList = functionCall.expressionList();
                Preconditions.checkNotNull(expressionList, "\'print\' accepts exactly one argument");
                Preconditions.checkArgument(expressionList.expression().size() == 1, "\'print\' accepts exactly one argument");
                visitArgs(expressionList);
                method.visitMethodInsn(INVOKEVIRTUAL, getInternalName(PrintStream.class), "println",
                        getMethodDescriptor(VOID_TYPE, INT_TYPE), false);
                return ValueType.VOID;
        }
        return null;
    }

    private List<ValueType> visitArgs(ExpressionListContext expressionList) {
        List<ValueType> valueTypes = new ArrayList<>();
        for (ExpressionContext expression : expressionList.expression()) {
            ValueType type = new ExpressionVisitor(symbolTable, method).visitExpression(expression);
            valueTypes.add(type);
        }
        return valueTypes;
    }
}
