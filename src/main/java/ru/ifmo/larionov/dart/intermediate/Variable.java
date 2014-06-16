package ru.ifmo.larionov.dart.intermediate;

/**
 * @author Oleg Larionov
 */
public interface Variable {
    String getName();

    ValueType getValueType();

    int getId();

    void setId(int id);
}
