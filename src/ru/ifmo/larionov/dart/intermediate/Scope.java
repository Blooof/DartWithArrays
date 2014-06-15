package ru.ifmo.larionov.dart.intermediate;

/**
 * @author Oleg Larionov
 */
public interface Scope {
    void defineVariable(Variable v);

    void defineFunction(Function f);

    Variable findVariable(String name);

    Function findFunction(String name, ValueType... argumentValueTypes);
}
