package com.jcodingsolutions.utils.nullutils;

import java.util.ArrayList;
import java.util.List;

public class NullUtils {
    public static boolean isNull(Object o) {
        return o == null;
    }

    public static boolean isNotNull(Object o) {
        return !isNull(o);
    }

    public static <T> List<T> nonNullList(List<T> list) {
        return list == null ? new ArrayList<>() : list;
    }
}
