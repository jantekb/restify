package com.danisola.urlrestify.types;

public class FloatVar extends AbstractVarType<Float> {

    public static FloatVar floatVar(String id) {
        return new FloatVar(id);
    }

    private FloatVar(String id) {
        super(id);
    }

    @Override
    public Float convert(String value) {
        return Float.parseFloat(value);
    }
}
