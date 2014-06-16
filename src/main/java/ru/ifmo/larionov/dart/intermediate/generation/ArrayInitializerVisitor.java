package ru.ifmo.larionov.dart.intermediate.generation;

import org.objectweb.asm.MethodVisitor;
import ru.ifmo.larionov.dart.grammar.SimpleDartWithArraysParser;
import ru.ifmo.larionov.dart.intermediate.SymbolTable;
import ru.ifmo.larionov.dart.intermediate.ValueType;
import ru.ifmo.larionov.dart.intermediate.Variable;

import java.util.ArrayList;
import java.util.List;

import static org.objectweb.asm.Opcodes.*;

/**
 * @author Oleg Larionov
 */
public class ArrayInitializerVisitor {
    private SymbolTable symbolTable;
    private MethodVisitor method;

    public ArrayInitializerVisitor(SymbolTable symbolTable, MethodVisitor method) {
        this.symbolTable = symbolTable;
        this.method = method;
    }

    public List<ValueType> visitArrayInitializer(Variable variable, SimpleDartWithArraysParser.ArrayInitializerContext arrayInitializer) {
        int arraySize = arrayInitializer.expressionList() != null ? arrayInitializer.expressionList().expression().size() : 0;
        method.visitLdcInsn(arraySize);
        method.visitIntInsn(NEWARRAY, T_INT);
        if (symbolTable.isGlobalVariable(variable.getName())) {
            method.visitFieldInsn(PUTSTATIC, CodeGenerator.CLASS_NAME, variable.getName(), variable.getValueType().getDescriptor());
        } else {
            method.visitVarInsn(ASTORE, variable.getId());
        }
        List<ValueType> valueTypes = new ArrayList<>();
        SimpleDartWithArraysParser.ExpressionListContext expressionList = arrayInitializer.expressionList();
        if (expressionList != null) {
            int i = 0;
            for (SimpleDartWithArraysParser.ExpressionContext expression : expressionList.expression()) {
                if (symbolTable.isGlobalVariable(variable.getName())) {
                    method.visitFieldInsn(GETSTATIC, CodeGenerator.CLASS_NAME, variable.getName(), variable.getValueType().getDescriptor());
                } else {
                    method.visitVarInsn(ALOAD, variable.getId());
                }
                method.visitLdcInsn(i++);
                ValueType type = new ExpressionVisitor(symbolTable, method).visitExpression(expression);
                valueTypes.add(type);
                method.visitInsn(IASTORE);
            }
        }
        return valueTypes;
    }
}
