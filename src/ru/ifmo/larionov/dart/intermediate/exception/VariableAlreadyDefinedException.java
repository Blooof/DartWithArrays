package ru.ifmo.larionov.dart.intermediate.exception;

import ru.ifmo.larionov.dart.intermediate.Variable;

/**
 * @author Oleg Larionov
 */
public class VariableAlreadyDefinedException extends AlreadyDefinedException {
    public VariableAlreadyDefinedException(Variable v) {
        super("Variable " + v + " already defined in this scope.");
    }
}
