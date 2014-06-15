package ru.ifmo.larionov.dart.intermediate.exception;

import ru.ifmo.larionov.dart.intermediate.Function;

/**
 * @author Oleg Larionov
 */
public class FunctionAlreadyDefinedException extends AlreadyDefinedException {
    public FunctionAlreadyDefinedException(Function f) {
        super("Function " + f + " already defined in this scope.");
    }
}
