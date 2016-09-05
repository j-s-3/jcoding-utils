package com.jcodingsolutions.utils.reflection;

import java.lang.reflect.Field;

public class ReflectionField<T> {
    private Class<T> type;
    private String fieldName;

    public ReflectionField(Class<T> type, String fieldName) {
        this.setType(type);
        this.setFieldName(fieldName);
    }

    public Class<T> getType() {
        return type;
    }

    public void setType(Class<T> type) {
        this.type = type;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    protected Field getDeclaredField() throws NoSuchFieldException {
        return getType().getDeclaredField(this.getFieldName());
    }
}
