package ru.ifmo.larionov.dart.intermediate.generation;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import ru.ifmo.larionov.dart.intermediate.SymbolTable;
import ru.ifmo.larionov.dart.intermediate.ValueType;
import ru.ifmo.larionov.dart.intermediate.Variable;
import ru.ifmo.larionov.dart.intermediate.VariableImpl;

import static org.objectweb.asm.Opcodes.ACC_PUBLIC;
import static org.objectweb.asm.Opcodes.ACC_STATIC;
import static ru.ifmo.larionov.dart.grammar.SimpleDartWithArraysParser.*;

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
            if (declarator.variableInitializer() != null) {
                VariableInitializerContext initializer = declarator.variableInitializer();
                if (initializer.arrayInitializer() != null) {
                } else {
                    new ExpressionVisitor(symbolTable, method).visitExpression(initializer.expression());
                }
            }
            symbolTable.defineVariable(variable);
            writer.visitField(ACC_PUBLIC | ACC_STATIC, variable.getName(), valueType.getDescriptor(), null, valueType.getDefaultValue()).visitEnd();
        }
    }
}
