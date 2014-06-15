package ru.ifmo.larionov.dart.intermediate.exception;

import static java.lang.String.format;

/**
 * @author Oleg Larionov
 */
public class FunctionNotDefinedException extends NotDefinedException {
    public FunctionNotDefinedException(String name) {
        super(format("Function %s not defined in this scope.", name));
    }
}
