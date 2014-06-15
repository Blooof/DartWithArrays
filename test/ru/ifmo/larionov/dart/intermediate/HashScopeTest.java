package ru.ifmo.larionov.dart.intermediate;

import org.junit.Before;
import org.junit.Test;
import ru.ifmo.larionov.dart.intermediate.exception.VariableAlreadyDefinedException;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

/**
 * @author Oleg Larionov
 */
public class HashScopeTest extends SymbolTableTest {
    private HashScope scope;

    @Before
    public void setUp() throws Exception {
        scope = new HashScope();
    }

    @Test
    public void testShouldAddAndFindVariable() throws Exception {
        Variable v = buildVariable("default", ValueType.INT);

        scope.defineVariable(v);
        Variable actual = scope.findVariable("default");

        assertThat(actual, is(v));
    }

    @Test(expected = VariableAlreadyDefinedException.class)
    public void testShouldThrowExceptionIfAddDuplicateVariable() throws Exception {
        Variable existingVariable = buildVariable("default", ValueType.INT);
        scope.defineVariable(existingVariable);

        Variable alreadyDefinedVariable = buildVariable("default", ValueType.VOID);
        scope.defineVariable(alreadyDefinedVariable);
    }

    @Test
    public void testShouldThrowExceptionIfVariableIsNotDefined() throws Exception {
        Variable actual = scope.findVariable("notDefined");

        assertThat(actual, nullValue());
    }

    @Test
    public void testShouldAddAndFindFunction() throws Exception {
        Function f = buildFunction("default", ValueType.VOID);

        scope.defineFunction(f);
        Function actual = scope.findFunction("default");

        assertThat(actual, is(f));
    }

    @Test
    public void testShouldThrowExceptionIfFindNotDefinedFunction() throws Exception {
        Function actual = scope.findFunction("notDefined");

        assertThat(actual, nullValue());
    }
}
