package ru.ifmo.larionov.dart.intermediate;

/**
 * @author Oleg Larionov
 */
public interface SymbolTable {
    void newScope();

    void dropScope();

    void defineVariable(Variable v);

    void defineFunction(Function f);

    /**
     * Find variable with provided name in all scopes.
     *
     * @param name variable name
     * @return variable from nearest scope
     * @throws {@link ru.ifmo.larionov.dart.intermediate.exception.VariableNotDefinedException} if variable is not defined
     */
    Variable findVariable(String name);

    boolean isGlobalVariable(String name);

    Function findFunction(String name);

    Function getMain();
}
