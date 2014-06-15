package ru.ifmo.larionov.dart.intermediate;

import org.objectweb.asm.Type;

import java.util.HashMap;
import java.util.Map;

import static org.objectweb.asm.Type.INT_TYPE;
import static org.objectweb.asm.Type.VOID_TYPE;

/**
 * @author Oleg Larionov
 */
public class ValueType {
    public static final ValueType VOID = new ValueType("void", VOID_TYPE, null);
    public static final ValueType INT = new ValueType("int", INT_TYPE, 0);
    public static final ValueType LIST = new ValueType("List", Type.getType(int[].class), null);
    private static Map<String, ValueType> helper = new HashMap<String, ValueType>() {{
        put("void", VOID);
        put("int", INT);
        put("List", LIST);
    }};
    private String typeName;
    private Type asmType;
    private Object defaultValue;

    private ValueType(String typeName, Type asmType, Object defaultValue) {
        this.typeName = typeName;
        this.asmType = asmType;
        this.defaultValue = defaultValue;
    }

    public static ValueType fromString(String typeName) {
        if (!helper.containsKey(typeName)) {
            throw new IllegalArgumentException("Type not found: " + typeName);
        }
        return helper.get(typeName);
    }

    public String getDescriptor() {
        return toAsmType().getDescriptor();
    }

    public Type toAsmType() {
        return asmType;
    }

    public String getTypeName() {
        return typeName;
    }

    public Object getDefaultValue() {
        return defaultValue;
    }
}
