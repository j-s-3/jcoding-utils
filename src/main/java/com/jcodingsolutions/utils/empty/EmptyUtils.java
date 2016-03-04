package com.jcodingsolutions.utils.empty;

import java.util.Collection;
import java.util.Map;

import static com.jcodingsolutions.utils.nullutils.NullUtils.isNull;

public class EmptyUtils {

    public static boolean isEmpty(String text) {
        return isNull(text) || text.isEmpty();
    }

    public static boolean isEmpty(Collection collection) {
        return isNull(collection) || collection.isEmpty();
    }

    public static boolean isEmpty(Map map) {
        return isNull(map) || map.isEmpty();
    }

    public static <T> boolean isEmpty(T[] array) {
        return isNull(array) || array.length == 0;
    }

    public static boolean isNotEmpty(String text) {
        return !isEmpty(text);
    }

    public static boolean isNotEmpty(Collection collection) {
        return !isEmpty(collection);
    }

    public static boolean isNotEmpty(Map map) {
        return !isEmpty(map);
    }

    public static <T> boolean isNotEmpty(T[] array) {
        return !isEmpty(array);
    }
}
