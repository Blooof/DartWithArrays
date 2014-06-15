package ru.ifmo.larionov.dart.intermediate;

import static java.util.Arrays.asList;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * @author Oleg Larionov
 */
public abstract class SymbolTableTest {
    protected Variable buildVariable(String name, ValueType valueType) {
        Variable v = mock(Variable.class);
        when(v.getName()).thenReturn(name);
        when(v.getValueType()).thenReturn(valueType);
        return v;
    }

    protected Function buildFunction(String name, ValueType returnValueType, Variable... arguments) {
        Function f = mock(Function.class);
        when(f.getName()).thenReturn(name);
        when(f.getReturnValueType()).thenReturn(returnValueType);
        when(f.getArguments()).thenReturn(asList(arguments));
        return f;
    }
}
