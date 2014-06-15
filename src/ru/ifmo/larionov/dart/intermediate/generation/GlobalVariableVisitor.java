package ru.ifmo.larionov.dart.intermediate.generation;

import org.objectweb.asm.ClassWriter;
import ru.ifmo.larionov.dart.grammar.SimpleDartWithArraysParser;
import ru.ifmo.larionov.dart.intermediate.SymbolTable;
import ru.ifmo.larionov.dart.intermediate.ValueType;
import ru.ifmo.larionov.dart.intermediate.Variable;
import ru.ifmo.larionov.dart.intermediate.VariableImpl;

import static org.objectweb.asm.Opcodes.ACC_PUBLIC;
import static org.objectweb.asm.Opcodes.ACC_STATIC;

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

    public void visitGlobalVariable(SimpleDartWithArraysParser.GlobalVariableDeclarationContext globalVariableContext) {
        SimpleDartWithArraysParser.VariableDeclarationContext variableDeclaration = globalVariableContext.variableDeclarationStatement().variableDeclaration();
        ValueType valueType = ValueType.fromString(variableDeclaration.variableType().getText());
        for (SimpleDartWithArraysParser.VariableDeclaratorContext declarator : variableDeclaration.variableDeclarators().variableDeclarator()) {
            String name = declarator.IDENT().getText();
            Variable variable = new VariableImpl(name, valueType);
            if (declarator.variableInitializer() != null) {
                SimpleDartWithArraysParser.VariableInitializerContext initializer = declarator.variableInitializer();
//                if (initializer.arrayInitializer() != null) {
//
//                } else {
//                    visitExpression(initializer.expression());
//                }
            }
            symbolTable.defineVariable(variable);
            writer.visitField(ACC_PUBLIC | ACC_STATIC, variable.getName(), valueType.getDescriptor(), null, valueType.getDefaultValue()).visitEnd();
        }
    }
}
