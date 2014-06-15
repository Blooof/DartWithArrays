package ru.ifmo.larionov.dart.intermediate.exception;

/**
 * @author Oleg Larionov
 */
public class VariableNotDefinedException extends NotDefinedException {
    public VariableNotDefinedException(String name) {
        super("Variable " + name + " not defined in this scope.");
    }
}
