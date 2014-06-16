package ru.ifmo.larionov.dart.intermediate;

import java.util.List;

/**
 * @author Oleg Larionov
 */
public interface Function {
    String getName();

    ValueType getReturnValueType();

    List<Variable> getArguments();
}
