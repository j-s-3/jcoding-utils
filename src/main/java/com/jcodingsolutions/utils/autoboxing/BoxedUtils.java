package com.jcodingsolutions.utils.autoboxing;

import static com.jcodingsolutions.utils.nullutils.NullUtils.isNotNull;

public interface BoxedUtils {

    static boolean booleanValueOf(Boolean b) {
        return booleanValueOf(b, false);
    }

    static boolean booleanValueOf(Boolean b1, boolean b2) {
        return isNotNull(b1) ? b1 : b2;
    }

    static int integerValueOf(Integer i) {
        return integerValueOf(i, 0);
    }

    static int integerValueOf(Integer i1, int i2) {
        return isNotNull(i1) ? i1 : i2;
    }

    static long longValueOf(Long l) {
        return longValueOf(l, 0L);
    }

    static long longValueOf(Long l1, long l2) {
        return isNotNull(l1) ? l1 : l2;
    }

    static float floatValueOf(Float f) {
        return floatValueOf(f, 0.0f);
    }

    static float floatValueOf(Float f1, float f2) {
        return isNotNull(f1) ? f1 : f2;
    }

    static double doubleValueOf(Double d) {
        return doubleValueOf(d, 0.0d);
    }

    static double doubleValueOf(Double d1, double d2) {
        return isNotNull(d1) ? d1 : d2;
    }

    static char characterValueOf(Character c1, char c2) {
        return isNotNull(c1) ? c1 : c2;
    }

    static char characterValueOf(Character c) {
        return characterValueOf(c, '\u0000');
    }

    static byte byteValueOf(Byte b1, byte b2) {
        return isNotNull(b1) ? b1 : b2;
    }

    static byte byteValueOf(Byte b) {
        return byteValueOf(b, (byte) 0);
    }

    static short shortValueOf(Short s1, short s2) {
        return isNotNull(s1) ? s1 : s2;
    }

    static short shortValueOf(Short s) {
        return shortValueOf(s, (short) 0);
    }
}
