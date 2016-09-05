package com.jcodingsolutions.utils.reflection;

import java.lang.reflect.Field;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReflectionFieldSetter<T> extends ReflectionField<T> {

    private static final Logger LOG = Logger.getLogger(ReflectionFieldSetter.class.getName());

    public ReflectionFieldSetter(Class<T> type, String fieldName) {
        super(type, fieldName);
    }

    public void trySetField(T object, String value) {
        try {
            Field needCellsRebuilt = getDeclaredField();
            needCellsRebuilt.setAccessible(true);
            needCellsRebuilt.set(object, value);
        } catch (Exception e) {
            LOG.log(Level.SEVERE, "", e);
        }
    }

}
