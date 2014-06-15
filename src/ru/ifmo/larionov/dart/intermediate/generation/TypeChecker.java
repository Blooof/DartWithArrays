package ru.ifmo.larionov.dart.intermediate.generation;

import ru.ifmo.larionov.dart.intermediate.ValueType;
import ru.ifmo.larionov.dart.intermediate.exception.TypeCheckException;

/**
 * @author Oleg Larionov
 */
public class TypeChecker {
    public static void typeCheck(ValueType left, ValueType right, String line) {
        if (left != right) {
            throw new TypeCheckException(left, right, line);
        }
    }
}
