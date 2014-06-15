package ru.ifmo.larionov.dart.intermediate.exception;

/**
 * @author Oleg Larionov
 */
public class AlreadyDefinedException extends RuntimeException {
    public AlreadyDefinedException(String message) {
        super(message);
    }
}
