package ru.ifmo.larionov.dart.intermediate.generation;

import org.objectweb.asm.MethodVisitor;
import ru.ifmo.larionov.dart.intermediate.SymbolTable;
import ru.ifmo.larionov.dart.intermediate.ValueType;
import ru.ifmo.larionov.dart.intermediate.Variable;
import ru.ifmo.larionov.dart.intermediate.VariableImpl;

import java.util.ArrayList;
import java.util.List;

import static org.objectweb.asm.Opcodes.*;
import static ru.ifmo.larionov.dart.grammar.SimpleDartWithArraysParser.*;
import static ru.ifmo.larionov.dart.intermediate.generation.TypeChecker.typeCheck;

/**
 * @author Oleg Larionov
 */
public class VariableDeclarationVisitor {
    private SymbolTable symbolTable;
    private MethodVisitor method;

    public VariableDeclarationVisitor(SymbolTable symbolTable, MethodVisitor method) {
        this.symbolTable = symbolTable;
        this.method = method;
    }

    public void visitVariableDeclaration(VariableDeclarationContext variableDeclaration) {
        ValueType type = ValueType.fromString(variableDeclaration.variableType().getText());
        for (VariableDeclaratorContext declarator : variableDeclaration.variableDeclarators().variableDeclarator()) {
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
                    typeCheck(type, ValueType.LIST, variableDeclaration.getText());
                    ArrayInitializerContext arrayInitializer = variableInitializer.arrayInitializer();
                    int arraySize = arrayInitializer.expressionList() != null ? arrayInitializer.expressionList().expression().size() : 0;
                    method.visitLdcInsn(arraySize);
                    method.visitIntInsn(NEWARRAY, T_INT);
                    method.visitVarInsn(ASTORE, variable.getId());
                    visitArrayInitializer(variable, variableInitializer.arrayInitializer());
                }
            }
        }
    }

    private List<ValueType> visitArrayInitializer(Variable variable, ArrayInitializerContext arrayInitializer) {
        List<ValueType> valueTypes = new ArrayList<>();
        ExpressionListContext expressionList = arrayInitializer.expressionList();
        if (expressionList != null) {
            int i = 0;
            for (ExpressionContext expression : expressionList.expression()) {
                method.visitVarInsn(ALOAD, variable.getId());
                method.visitLdcInsn(i++);
                ValueType type = new ExpressionVisitor(symbolTable, method).visitExpression(expression);
                valueTypes.add(type);
                method.visitInsn(IASTORE);
            }
        }
        return valueTypes;
    }
}
