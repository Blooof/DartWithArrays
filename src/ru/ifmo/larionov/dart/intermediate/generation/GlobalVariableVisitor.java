package ru.ifmo.larionov.dart.intermediate.generation;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
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
public class GlobalVariableVisitor {
    private SymbolTable symbolTable;
    private ClassWriter writer;

    public GlobalVariableVisitor(SymbolTable symbolTable, ClassWriter writer) {
        this.symbolTable = symbolTable;
        this.writer = writer;
    }

    public void visitGlobalVariable(GlobalVariableDeclarationContext globalVariableContext, MethodVisitor method) {
        VariableDeclarationContext variableDeclaration = globalVariableContext.variableDeclarationStatement().variableDeclaration();
        ValueType valueType = ValueType.fromString(variableDeclaration.variableType().getText());
        for (VariableDeclaratorContext declarator : variableDeclaration.variableDeclarators().variableDeclarator()) {
            String name = declarator.IDENT().getText();
            Variable variable = new VariableImpl(name, valueType);
            symbolTable.defineVariable(variable);
            writer.visitField(ACC_PUBLIC | ACC_STATIC, variable.getName(), valueType.getDescriptor(), null, valueType.getDefaultValue()).visitEnd();
            if (declarator.variableInitializer() != null) {
                VariableInitializerContext initializer = declarator.variableInitializer();
                if (initializer.arrayInitializer() != null) {
                    typeCheck(valueType, ValueType.LIST, globalVariableContext.getText());
                    ExpressionListContext expressionList = initializer.arrayInitializer().expressionList();
                    int arraySize = expressionList != null ? expressionList.expression().size() : 0;
                    method.visitLdcInsn(arraySize);
                    method.visitIntInsn(NEWARRAY, Opcodes.T_INT);
                    method.visitFieldInsn(PUTSTATIC, CodeGenerator.CLASS_NAME, name, valueType.getDescriptor());
                    visitArrayInitializer(variable, method, initializer.arrayInitializer());
                } else {
                    ValueType exprType = new ExpressionVisitor(symbolTable, method).visitExpression(initializer.expression());
                    typeCheck(valueType, exprType, globalVariableContext.getText());
                    method.visitFieldInsn(PUTSTATIC, CodeGenerator.CLASS_NAME, name, valueType.getDescriptor());
                }
            }

        }
    }

    private List<ValueType> visitArrayInitializer(Variable variable, MethodVisitor method, ArrayInitializerContext arrayInitializer) {
        List<ValueType> valueTypes = new ArrayList<>();
        ExpressionListContext expressionList = arrayInitializer.expressionList();
        if (expressionList != null) {
            int i = 0;
            for (ExpressionContext expression : expressionList.expression()) {
                method.visitFieldInsn(GETSTATIC, CodeGenerator.CLASS_NAME, variable.getName(), variable.getValueType().getDescriptor());
                method.visitLdcInsn(i++);
                ValueType type = new ExpressionVisitor(symbolTable, method).visitExpression(expression);
                valueTypes.add(type);
                method.visitInsn(IASTORE);
            }
        }
        return valueTypes;
    }
}
