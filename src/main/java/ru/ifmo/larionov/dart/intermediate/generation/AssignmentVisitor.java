package ru.ifmo.larionov.dart.intermediate.generation;

import org.objectweb.asm.MethodVisitor;
import ru.ifmo.larionov.dart.grammar.SimpleDartWithArraysParser;
import ru.ifmo.larionov.dart.intermediate.SymbolTable;
import ru.ifmo.larionov.dart.intermediate.ValueType;
import ru.ifmo.larionov.dart.intermediate.Variable;

import static org.objectweb.asm.Opcodes.*;
import static ru.ifmo.larionov.dart.intermediate.generation.TypeChecker.typeCheck;

/**
 * @author Oleg Larionov
 */
public class AssignmentVisitor {
    private SymbolTable symbolTable;
    private MethodVisitor method;

    public AssignmentVisitor(SymbolTable symbolTable, MethodVisitor method) {
        this.symbolTable = symbolTable;
        this.method = method;
    }

    public void visitAssignment(SimpleDartWithArraysParser.AssignmentContext assignment) {
        String name = assignment.IDENT().getText();
        Variable variable = symbolTable.findVariable(name);
        if (assignment.arrayInitializer() != null) {
            typeCheck(variable.getValueType(), ValueType.LIST, assignment.getText());
            new ArrayInitializerVisitor(symbolTable, method).visitArrayInitializer(variable, assignment.arrayInitializer());
        } else {
            if (assignment.arrayIdent() != null) {
                typeCheck(variable.getValueType(), ValueType.LIST, assignment.getText());
                if (symbolTable.isGlobalVariable(name)) {
                    method.visitFieldInsn(GETSTATIC, CodeGenerator.CLASS_NAME, name, variable.getValueType().getDescriptor());
                } else {
                    method.visitVarInsn(ALOAD, variable.getId());
                }
                ValueType index = new ExpressionVisitor(symbolTable, method).visitExpression(assignment.arrayIdent().expression());
                typeCheck(index, ValueType.INT, assignment.getText());
            }
            ValueType valueType = new ExpressionVisitor(symbolTable, method).visitExpression(assignment.expression());
            if (variable.getValueType() == ValueType.LIST) {
                method.visitInsn(IASTORE);
            } else {
                typeCheck(variable.getValueType(), valueType, assignment.getText());
                if (symbolTable.isGlobalVariable(name)) {
                    method.visitFieldInsn(PUTSTATIC, CodeGenerator.CLASS_NAME, name, valueType.getDescriptor());
                } else {
                    method.visitVarInsn(ISTORE, variable.getId());
                }
            }
        }
    }
}
