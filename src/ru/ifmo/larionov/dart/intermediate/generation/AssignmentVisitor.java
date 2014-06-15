package ru.ifmo.larionov.dart.intermediate.generation;

import org.objectweb.asm.MethodVisitor;
import ru.ifmo.larionov.dart.grammar.SimpleDartWithArraysParser;
import ru.ifmo.larionov.dart.intermediate.SymbolTable;
import ru.ifmo.larionov.dart.intermediate.ValueType;
import ru.ifmo.larionov.dart.intermediate.Variable;

import static org.objectweb.asm.Opcodes.ISTORE;
import static org.objectweb.asm.Opcodes.PUTSTATIC;
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
        if (assignment.arrayIdent() == null) {
            ValueType valueType = new ExpressionVisitor(symbolTable, method).visitExpression(assignment.expression());
            typeCheck(variable.getValueType(), valueType, assignment.getText());
            if (symbolTable.isGlobalVariable(name)) {
                method.visitFieldInsn(PUTSTATIC, CodeGenerator.CLASS_NAME, name, valueType.getDescriptor());
            } else {
                method.visitVarInsn(ISTORE, variable.getId());
            }
        } else {
            // TODO array assignment
        }
    }
}
