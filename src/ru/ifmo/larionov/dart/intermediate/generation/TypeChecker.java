package ru.ifmo.larionov.dart.intermediate.generation;

import com.google.common.base.Preconditions;
import ru.ifmo.larionov.dart.intermediate.Function;
import ru.ifmo.larionov.dart.intermediate.ValueType;
import ru.ifmo.larionov.dart.intermediate.Variable;
import ru.ifmo.larionov.dart.intermediate.exception.TypeCheckException;

import java.util.List;

/**
 * @author Oleg Larionov
 */
public class TypeChecker {
    public static void typeCheck(ValueType left, ValueType right, String line) {
        if (left != right) {
            throw new TypeCheckException(left, right, line);
        }
    }

    public static void typeCheck(Function f, List<ValueType> actualArgs, String line) {
        List<Variable> expectedArgs = f.getArguments();
        Preconditions.checkNotNull(expectedArgs, "Expected arguments of function must not be null. String: " + line);
        Preconditions.checkNotNull(actualArgs, "Actual arguments of function must not be null. String: " + line);
        Preconditions.checkArgument(expectedArgs.size() == actualArgs.size(),
                "Actual arguments count must be equal to function arguments count. String: " + line);

        for (int i = 0; i < expectedArgs.size(); i++) {
            typeCheck(expectedArgs.get(i).getValueType(), actualArgs.get(i), line);
        }
    }
}
