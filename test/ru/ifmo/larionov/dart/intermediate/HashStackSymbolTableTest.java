package ru.ifmo.larionov.dart.intermediate;

import org.junit.Before;
import org.junit.Test;
import ru.ifmo.larionov.dart.intermediate.exception.FunctionNotDefinedException;
import ru.ifmo.larionov.dart.intermediate.exception.VariableAlreadyDefinedException;
import ru.ifmo.larionov.dart.intermediate.exception.VariableNotDefinedException;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author Oleg Larionov
 */
public class HashStackSymbolTableTest extends SymbolTableTest {
    private HashStackSymbolTable symbolTable;

    @Before
    public void setUp() throws Exception {
        symbolTable = new HashStackSymbolTable();
    }

    @Test
    public void testShouldFindVariableInScope() throws Exception {
        Variable v = buildVariable("default", ValueType.INT);

        symbolTable.defineVariable(v);
        Variable actual = symbolTable.findVariable("default");

        assertThat(actual, is(v));
    }

    @Test
    public void testShouldFindVariableInParentScope() throws Exception {
        Variable v = buildVariable("default", ValueType.INT);
        symbolTable.defineVariable(v);
        symbolTable.newScope();

        Variable actual = symbolTable.findVariable("default");

        assertThat(actual, is(v));
    }

    @Test
    public void testShouldOverrideVariableInNewScope() throws Exception {
        Variable v = buildVariable("default", ValueType.INT);
        symbolTable.defineVariable(v);
        symbolTable.newScope();

        Variable defined = buildVariable("default", ValueType.INT);
        symbolTable.defineVariable(defined);
        Variable actual = symbolTable.findVariable("default");

        assertThat(actual, is(defined));
    }

    @Test
    public void testShouldForgetVariableInDroppedScope() throws Exception {
        Variable v = buildVariable("default", ValueType.INT);
        symbolTable.defineVariable(v);
        symbolTable.newScope();
        Variable override = buildVariable("default", ValueType.INT);
        symbolTable.defineVariable(override);
        symbolTable.dropScope();

        Variable actual = symbolTable.findVariable("default");

        assertThat(actual, is(v));
    }

    @Test(expected = VariableNotDefinedException.class)
    public void testShouldThrowExceptionIfVariableIsNotDefined() throws Exception {
        symbolTable.findVariable("notDefined");
    }

    @Test(expected = VariableAlreadyDefinedException.class)
    public void testShouldThrowExceptionIfVariableDefinedInScope() throws Exception {
        Variable v = buildVariable("default", ValueType.INT);
        symbolTable.defineVariable(v);

        Variable defined = buildVariable("default", ValueType.INT);
        symbolTable.defineVariable(defined);
    }

    @Test(expected = IllegalStateException.class)
    public void testShouldThrowExceptionIfDropGlobalScope() throws Exception {
        symbolTable.dropScope();
    }

    @Test
    public void testShouldFindFunctionInScope() throws Exception {
        Function f = buildFunction("default", ValueType.INT);

        symbolTable.defineFunction(f);
        Function actual = symbolTable.findFunction("default");

        assertThat(actual, is(f));
    }

    @Test
    public void testShouldFindFunctionInParentScope() throws Exception {
        Function f = buildFunction("default", ValueType.INT);
        symbolTable.defineFunction(f);
        symbolTable.newScope();

        Function actual = symbolTable.findFunction("default");

        assertThat(actual, is(f));
    }

    @Test(expected = FunctionNotDefinedException.class)
    public void testShouldThrowExceptionIfFunctionIsNotDefined() throws Exception {
        symbolTable.findFunction("notDefined");
    }
}
