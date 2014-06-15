package ru.ifmo.larionov.dart.intermediate.generation;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Type;
import ru.ifmo.larionov.dart.intermediate.Function;
import ru.ifmo.larionov.dart.intermediate.SymbolTable;
import ru.ifmo.larionov.dart.intermediate.ValueType;

import java.io.Console;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.objectweb.asm.Opcodes.*;
import static org.objectweb.asm.Type.*;
import static ru.ifmo.larionov.dart.grammar.SimpleDartWithArraysParser.*;
import static ru.ifmo.larionov.dart.intermediate.generation.TypeChecker.typeCheck;

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
        Function function = symbolTable.findFunction(funcName);

        switch (funcName) {
            case "print":
                method.visitFieldInsn(GETSTATIC, getInternalName(System.class), "out",
                        getDescriptor(PrintStream.class));

                ExpressionListContext expressionList = functionCall.expressionList();
                List<ValueType> args = visitArgs(expressionList);
                typeCheck(function, args, functionCall.getText());

                method.visitMethodInsn(INVOKEVIRTUAL, getInternalName(PrintStream.class), "println",
                        getMethodDescriptor(VOID_TYPE, INT_TYPE), false);

                return ValueType.VOID;
            case "readInt":
                expressionList = functionCall.expressionList();
                args = visitArgs(expressionList);
                typeCheck(function, args, functionCall.getText());

                method.visitMethodInsn(INVOKESTATIC, getInternalName(System.class), "console",
                        getMethodDescriptor(getType(Console.class)), false);
                method.visitMethodInsn(INVOKEVIRTUAL, getInternalName(Console.class), "readLine",
                        getMethodDescriptor(getType(String.class)), false);
                method.visitMethodInsn(INVOKESTATIC, getInternalName(Integer.class), "parseInt",
                        getMethodDescriptor(INT_TYPE, getType(String.class)), false);
                return ValueType.INT;
            default:
                expressionList = functionCall.expressionList();
                args = visitArgs(expressionList);
                typeCheck(function, args, functionCall.getText());

                Type[] types = args
                        .stream()
                        .flatMap(valueType -> Stream.of(valueType.toAsmType()))
                        .toArray(Type[]::new);
                method.visitMethodInsn(INVOKESTATIC, CodeGenerator.CLASS_NAME, function.getName(),
                        getMethodDescriptor(function.getReturnValueType().toAsmType(), types), false);
                return function.getReturnValueType();
        }
    }

    private List<ValueType> visitArgs(ExpressionListContext expressionList) {
        List<ValueType> valueTypes = new ArrayList<>();
        if (expressionList != null) {
            for (ExpressionContext expression : expressionList.expression()) {
                ValueType type = new ExpressionVisitor(symbolTable, method).visitExpression(expression);
                valueTypes.add(type);
            }
        }
        return valueTypes;
    }
}
