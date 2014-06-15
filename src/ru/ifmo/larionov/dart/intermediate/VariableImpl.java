package ru.ifmo.larionov.dart.intermediate;

import java.util.Objects;

/**
 * @author Oleg Larionov
 */
public class VariableImpl implements Variable {
    private String name;
    private ValueType valueType;
    private int id;

    public VariableImpl(String name, ValueType valueType) {
        this.name = name;
        this.valueType = valueType;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public ValueType getValueType() {
        return valueType;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, valueType);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final VariableImpl other = (VariableImpl) obj;
        return Objects.equals(this.name, other.name) && Objects.equals(this.valueType, other.valueType);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("VariableImpl{");
        sb.append("name='").append(name).append('\'');
        sb.append(", valueType=").append(valueType);
        sb.append('}');
        return sb.toString();
    }
}
