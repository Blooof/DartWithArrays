package ru.ifmo.larionov.dart.intermediate.generation;

import org.objectweb.asm.MethodVisitor;
import ru.ifmo.larionov.dart.intermediate.SymbolTable;
import ru.ifmo.larionov.dart.intermediate.ValueType;
import ru.ifmo.larionov.dart.intermediate.Variable;
import ru.ifmo.larionov.dart.intermediate.VariableImpl;

import static org.objectweb.asm.Opcodes.ASTORE;
import static org.objectweb.asm.Opcodes.ISTORE;
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
                    method.visitVarInsn(type == ValueType.LIST ? ASTORE : ISTORE, variable.getId());
                } else {
                    typeCheck(type, ValueType.LIST, variableDeclaration.getText());
                    new ArrayInitializerVisitor(symbolTable, method).visitArrayInitializer(variable, variableInitializer.arrayInitializer());
                }
            }
        }
    }
}
