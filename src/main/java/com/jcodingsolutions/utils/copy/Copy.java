package com.jcodingsolutions.utils.copy;

import static java.util.Arrays.copyOf;

public class Copy {
    public static <T> T[] copy(T[] t) {
        if (t == null) {
            return t;
        }
        return copyOf(t, t.length);
    }
}
