package ru.ifmo.larionov.dart.intermediate.generation;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import ru.ifmo.larionov.dart.intermediate.*;

import java.util.Arrays;
import java.util.Collections;

import static org.objectweb.asm.Opcodes.*;
import static ru.ifmo.larionov.dart.grammar.SimpleDartWithArraysParser.*;
import static ru.ifmo.larionov.dart.intermediate.ValueType.INT;

/**
 * @author Oleg Larionov
 */
public class CodeGenerator {
    public static final String CLASS_NAME = "Main";
    private ClassWriter writer;
    private SymbolTable symbolTable;

    public CodeGenerator(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    public byte[] visit(CompilationUnitContext ctx) {
        writer = new ClassWriter(ClassWriter.COMPUTE_FRAMES | ClassWriter.COMPUTE_MAXS);
        visitCompilationUnit(ctx);
        return writer.toByteArray();
    }

    private void visitCompilationUnit(CompilationUnitContext ctx) {
        writer.visit(V1_7, ACC_PUBLIC, "Main", null, "java/lang/Object", null);

        if (!ctx.globalVariableDeclaration().isEmpty()) {
            MethodVisitor method = writer.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);

            for (GlobalVariableDeclarationContext globalVariable : ctx.globalVariableDeclaration()) {
                new GlobalVariableVisitor(symbolTable, writer).visitGlobalVariable(globalVariable, method);
            }

            method.visitInsn(Opcodes.RETURN);
            method.visitMaxs(0, 0);
            method.visitEnd();
        }

        addImportedFunctions();
        for (FunctionDeclarationContext function : ctx.functionDeclaration()) {
            new FunctionDeclarationVisitor(symbolTable, writer).defineFunction(function);
        }
        for (FunctionDeclarationContext function : ctx.functionDeclaration()) {
            new FunctionDeclarationVisitor(symbolTable, writer).visitFunctionDeclaration(function);
        }

        writer.visitEnd();
    }

    private void addImportedFunctions() {
        Function print = new FunctionImpl("print", ValueType.VOID, Arrays.<Variable>asList(new VariableImpl("arg", INT)));
        symbolTable.defineFunction(print);

        Function readInt = new FunctionImpl("readInt", ValueType.INT, Collections.<Variable>emptyList());
        symbolTable.defineFunction(readInt);
    }
}
