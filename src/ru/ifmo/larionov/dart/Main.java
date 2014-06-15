package ru.ifmo.larionov.dart;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.misc.Nullable;
import ru.ifmo.larionov.dart.grammar.SimpleDartWithArraysLexer;
import ru.ifmo.larionov.dart.grammar.SimpleDartWithArraysParser;
import ru.ifmo.larionov.dart.grammar.exception.ParseException;
import ru.ifmo.larionov.dart.intermediate.HashStackSymbolTable;
import ru.ifmo.larionov.dart.intermediate.generation.CodeGenerator;

import javax.print.PrintException;
import java.io.FileOutputStream;
import java.io.IOException;

import static java.lang.String.format;

public class Main {
    public static void main(String[] args) throws PrintException {
        try {
            CharStream input = new ANTLRFileStream("test.txt");
            Lexer lexer = new SimpleDartWithArraysLexer(input);
            SimpleDartWithArraysParser parser = new SimpleDartWithArraysParser(new CommonTokenStream(lexer));
            parser.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(@NotNull Recognizer<?, ?> recognizer, @Nullable Object offendingSymbol, int line, int charPositionInLine, @NotNull String msg, @Nullable RecognitionException e) {
                    throw new ParseException(format("Cannot parse input file: error at [%d:%d]: %s)", line, charPositionInLine, msg));
                }
            });
            SimpleDartWithArraysParser.CompilationUnitContext context = parser.compilationUnit();
            byte[] code = new CodeGenerator(new HashStackSymbolTable()).visit(context);
            try (FileOutputStream fos = new FileOutputStream("Main.class")) {
                fos.write(code);
            }
        } catch (IOException e) {
            System.err.println("Cannot read from input file");
        }
    }
}
