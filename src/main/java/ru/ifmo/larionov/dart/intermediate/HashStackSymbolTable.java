package ru.ifmo.larionov.dart.intermediate;

import ru.ifmo.larionov.dart.intermediate.exception.FunctionNotDefinedException;
import ru.ifmo.larionov.dart.intermediate.exception.VariableNotDefinedException;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Oleg Larionov
 */
public class HashStackSymbolTable implements SymbolTable {
    private List<Scope> scopes;
    private int varCounter;

    public HashStackSymbolTable() {
        scopes = new ArrayList<>();
        scopes.add(new HashScope());
    }

    @Override
    public void newScope() {
        scopes.add(new HashScope());
    }

    @Override
    public void dropScope() {
        if (scopes.size() == 1) {
            throw new IllegalStateException("Cannot drop global scope.");
        }
        scopes.remove(scopes.size() - 1);
        if (scopes.size() == 1) {
            varCounter = 0;
        }
    }

    @Override
    public void defineVariable(Variable v) {
        if (scopes.size() > 1) {
            v.setId(varCounter++);
        }
        scopes.get(scopes.size() - 1).defineVariable(v);
    }

    @Override
    public void defineFunction(Function f) {
        scopes.get(0).defineFunction(f);
    }

    @Override
    public Variable findVariable(String name) {
        for (int i = scopes.size() - 1; i >= 0; i--) {
            Variable v = scopes.get(i).findVariable(name);
            if (v != null) {
                return v;
            }
        }
        throw new VariableNotDefinedException(name);
    }

    @Override
    public boolean isGlobalVariable(String name) {
        for (int i = scopes.size() - 1; i >= 1; i--) {
            Variable v = scopes.get(i).findVariable(name);
            if (v != null) {
                return false;
            }
        }
        if (scopes.get(0).findVariable(name) != null) {
            return true;
        }
        throw new VariableNotDefinedException(name);
    }

    @Override
    public Function findFunction(String name) {
        Function f = scopes.get(0).findFunction(name);
        if (f != null) {
            return f;
        }
        throw new FunctionNotDefinedException(name);
    }

    @Override
    public Function getMain() {
        return findFunction("main");
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("HashStackSymbolTable{");
        sb.append("scopes=").append(scopes);
        sb.append('}');
        return sb.toString();
    }
}
