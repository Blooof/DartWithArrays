package ru.ifmo.larionov.dart.intermediate;

import com.google.common.base.Preconditions;
import ru.ifmo.larionov.dart.intermediate.exception.FunctionAlreadyDefinedException;
import ru.ifmo.larionov.dart.intermediate.exception.VariableAlreadyDefinedException;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Oleg Larionov
 */
public class HashScope implements Scope {
    private Map<String, Variable> variables;
    private Map<String, Function> functions;

    public HashScope() {
        variables = new HashMap<>();
        functions = new HashMap<>();
    }

    @Override
    public void defineVariable(Variable v) {
        Preconditions.checkNotNull(v.getName(), "Name must not be null.");
        Preconditions.checkNotNull(v.getValueType(), "Type must not be null.");

        if (variables.containsKey(v.getName())) {
            throw new VariableAlreadyDefinedException(v);
        }
        v.setId(variables.size());
        variables.put(v.getName(), v);
    }

    @Override
    public void defineFunction(Function f) {
        Preconditions.checkNotNull(f.getName(), "Name must not be null.");
        Preconditions.checkNotNull(f.getReturnValueType(), "Type must not be null.");
        Preconditions.checkNotNull(f.getArguments(), "Arguments must not be null.");

        if (functions.containsKey(f.getName())) {
            throw new FunctionAlreadyDefinedException(f);
        } else {
            functions.put(f.getName(), f);
        }
    }

    @Override
    public Variable findVariable(String name) {
        Preconditions.checkNotNull(name, "Name must not be null.");

        return variables.get(name);
    }

    @Override
    public Function findFunction(String name, ValueType... argumentValueTypes) {
        Preconditions.checkNotNull(name, "Name must not be null.");
        Preconditions.checkNotNull(argumentValueTypes, "Arguments must not be null.");

        if (!functions.containsKey(name)) {
            return null;
        }
        return functions.get(name);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("HashScope{");
        sb.append("variables=").append(variables);
        sb.append(", functions=").append(functions);
        sb.append('}');
        return sb.toString();
    }
}
