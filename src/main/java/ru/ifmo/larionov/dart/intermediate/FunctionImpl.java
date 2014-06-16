package ru.ifmo.larionov.dart.intermediate;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * @author Oleg Larionov
 */
public class FunctionImpl implements Function {
    private String name;
    private ValueType returnValueType;
    private List<Variable> args;

    public FunctionImpl(String name, ValueType returnValueType, List<Variable> args) {
        checkNotNull(name);
        checkNotNull(returnValueType);

        this.name = name;
        this.returnValueType = returnValueType;
        this.args = args != null ? args : Collections.<Variable>emptyList();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public ValueType getReturnValueType() {
        return returnValueType;
    }

    @Override
    public List<Variable> getArguments() {
        return args;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, returnValueType, args);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final FunctionImpl other = (FunctionImpl) obj;
        return Objects.equals(this.name, other.name) && Objects.equals(this.returnValueType, other.returnValueType) && Objects.equals(this.args, other.args);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("FunctionImpl{");
        sb.append("name='").append(name).append('\'');
        sb.append(", returnValueType=").append(returnValueType);
        sb.append(", args=").append(args);
        sb.append('}');
        return sb.toString();
    }
}
