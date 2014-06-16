package ru.ifmo.larionov.dart.intermediate.exception;

import ru.ifmo.larionov.dart.intermediate.ValueType;

/**
 * @author Oleg Larionov
 */
public class TypeCheckException extends GenerationException {
    public TypeCheckException(ValueType left, ValueType right, String line) {
        super(String.format("Type check error. Incompatible types %s and %s. String \"%s\"", left, right, line));
    }
}
