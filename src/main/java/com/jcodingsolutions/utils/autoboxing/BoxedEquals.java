package com.jcodingsolutions.utils.autoboxing;

import static com.jcodingsolutions.utils.autoboxing.BoxedDefaults.BOOLEAN;
import static com.jcodingsolutions.utils.autoboxing.BoxedDefaults.BYTE;
import static com.jcodingsolutions.utils.autoboxing.BoxedDefaults.CHARACTER;
import static com.jcodingsolutions.utils.autoboxing.BoxedDefaults.DOUBLE;
import static com.jcodingsolutions.utils.autoboxing.BoxedDefaults.FLOAT;
import static com.jcodingsolutions.utils.autoboxing.BoxedDefaults.INTEGER;
import static com.jcodingsolutions.utils.autoboxing.BoxedDefaults.LONG;
import static com.jcodingsolutions.utils.autoboxing.BoxedDefaults.SHORT;
import static com.jcodingsolutions.utils.autoboxing.BoxedUtils.booleanValueOf;
import static com.jcodingsolutions.utils.autoboxing.BoxedUtils.byteValueOf;
import static com.jcodingsolutions.utils.autoboxing.BoxedUtils.characterValueOf;
import static com.jcodingsolutions.utils.autoboxing.BoxedUtils.doubleValueOf;
import static com.jcodingsolutions.utils.autoboxing.BoxedUtils.floatValueOf;
import static com.jcodingsolutions.utils.autoboxing.BoxedUtils.integerValueOf;
import static com.jcodingsolutions.utils.autoboxing.BoxedUtils.longValueOf;
import static com.jcodingsolutions.utils.autoboxing.BoxedUtils.shortValueOf;

public interface BoxedEquals {

    static boolean areEqual(Character c1, Character c2, char defaultValue) {
        return characterValueOf(c1, defaultValue) == characterValueOf(c2, defaultValue);
    }

    static boolean areEqual(Character c1, Character c2) {
        return areEqual(c1, c2, CHARACTER);
    }

    static boolean areEqual(Long l1, Long l2, long defaultValue) {
        return longValueOf(l1, defaultValue) == longValueOf(l2, defaultValue);
    }

    static boolean areEqual(Long l1, Long l2) {
        return areEqual(l1, l2, LONG);
    }

    static boolean areEqual(Integer i1, Integer i2, int defaultValue) {
        return integerValueOf(i1, defaultValue) == integerValueOf(i2, defaultValue);
    }

    static boolean areEqual(Integer i1, Integer i2) {
        return areEqual(i1, i2, INTEGER);
    }

    static boolean areEqual(Double d1, Double d2, double defaultValue) {
        return doubleValueOf(d1, defaultValue) == doubleValueOf(d2, defaultValue);
    }

    static boolean areEqual(Double d1, Double d2) {
        return areEqual(d1, d2, DOUBLE);
    }

    static boolean areEqual(Byte b1, Byte b2, byte defaultValue) {
        return byteValueOf(b1, defaultValue) == byteValueOf(b2, defaultValue);
    }

    static boolean areEqual(Byte b1, Byte b2) {
        return areEqual(b1, b2, BYTE);
    }

    static boolean areEqual(Boolean b1, Boolean b2, boolean defaultValue) {
        return booleanValueOf(b1, defaultValue) == booleanValueOf(b2, defaultValue);
    }

    static boolean areEqual(Boolean b1, Boolean b2) {
        return areEqual(b1, b2, BOOLEAN);
    }

    static boolean areEqual(Float f1, Float f2, float defaultValue) {
        return floatValueOf(f1, defaultValue) == floatValueOf(f2, defaultValue);
    }

    static boolean areEqual(Float f1, Float f2) {
        return areEqual(f1, f2, FLOAT);
    }

    static boolean areEqual(Short s1, Short s2, short defaultValue) {
        return shortValueOf(s1, defaultValue) == shortValueOf(s2, defaultValue);
    }

    static boolean areEqual(Short s1, Short s2) {
        return areEqual(s1, s2, SHORT);
    }
}
