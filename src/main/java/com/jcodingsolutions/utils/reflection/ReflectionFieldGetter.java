package com.jcodingsolutions.utils.reflection;

import java.lang.reflect.Field;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReflectionFieldGetter<T> extends ReflectionField<T> {

    private static final Logger LOG = Logger.getLogger(ReflectionFieldGetter.class.getName());

    public ReflectionFieldGetter(Class<T> type, String fieldName) {
        super(type, fieldName);
    }

    public Object tryToGet(T object) {
        try {
            Field declaredField = getDeclaredField();
            declaredField.setAccessible(true);
            return declaredField.get(object);
        } catch (Exception e) {
            LOG.log(Level.SEVERE, "", e);
        }
        return null;
    }
}
