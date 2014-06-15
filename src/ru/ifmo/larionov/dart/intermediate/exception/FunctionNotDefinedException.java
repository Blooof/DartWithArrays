package ru.ifmo.larionov.dart.intermediate.exception;

import ru.ifmo.larionov.dart.intermediate.ValueType;

import static java.util.Arrays.deepToString;

/**
 * @author Oleg Larionov
 */
public class FunctionNotDefinedException extends NotDefinedException {
    public FunctionNotDefinedException(String name, ValueType... argumentValueTypes) {
        super("Function " + name + " with arguments" + deepToString(argumentValueTypes) + " not defined in this scope.");
    }
}
