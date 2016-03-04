package com.jcodingsolutions.utils.autoboxing;

import org.junit.Test;

import static com.jcodingsolutions.utils.autoboxing.BoxedEquals.areEqual;
import static com.jcodingsolutions.utils.autoboxing.PrimitiveDefaults.JAVA_DEFAULT_BOOLEAN;
import static com.jcodingsolutions.utils.autoboxing.PrimitiveDefaults.JAVA_DEFAULT_BYTE;
import static com.jcodingsolutions.utils.autoboxing.PrimitiveDefaults.JAVA_DEFAULT_CHAR;
import static com.jcodingsolutions.utils.autoboxing.PrimitiveDefaults.JAVA_DEFAULT_DOUBLE;
import static com.jcodingsolutions.utils.autoboxing.PrimitiveDefaults.JAVA_DEFAULT_FLOAT;
import static com.jcodingsolutions.utils.autoboxing.PrimitiveDefaults.JAVA_DEFAULT_INT;
import static com.jcodingsolutions.utils.autoboxing.PrimitiveDefaults.JAVA_DEFAULT_LONG;
import static com.jcodingsolutions.utils.autoboxing.PrimitiveDefaults.JAVA_DEFAULT_SHORT;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class BoxedEqualsTest {

    @Test
    public void shouldReturnTrueIfTwoCharactersAreEqual() {
        Character c1 = 'a';
        Character c2 = 'a';
        assertThat(areEqual(c1, c2), is(equalTo(true)));
    }

    @Test
    public void shouldReturnFalseIfTwoCharactersAreNotEqual() {
        Character c1 = 'a';
        Character c2 = 'b';
        assertThat(areEqual(c1, c2), is(equalTo(false)));
    }

    @Test
    public void shouldReturnFalseIfFirstOperandIsNull() {
        Character c1 = null;
        Character c2 = 'b';
        assertThat(areEqual(c1, c2), is(equalTo(false)));
    }

    @Test
    public void shouldReturnFalseIfSecondOperandIsNull() {
        Character c1 = 'a';
        Character c2 = null;
        assertThat(areEqual(c1, c2), is(equalTo(false)));
    }

    @Test
    public void shouldReturnTrueWhenDefaultCharacterAndNullPassed() {
        Character c1 = JAVA_DEFAULT_CHAR;
        Character c2 = null;
        assertThat(areEqual(c1, c2), is(equalTo(true)));
    }

    @Test
    public void shouldOverrideDefaultCharacter() {
        Character c1 = JAVA_DEFAULT_CHAR;
        Character c2 = null;
        assertThat(areEqual(c1, c2, 'o'), is(equalTo(false)));
    }

    @Test
    public void shouldReturnTrueIfTwoLongsAreEqual() {
        Long l1 = 1L;
        Long l2 = 1L;
        assertThat(areEqual(l1, l2), is(equalTo(true)));
    }

    @Test
    public void shouldReturnFalseIfTwoLongsAreNotEqual() {
        Long l1 = 1L;
        Long l2 = 2L;
        assertThat(areEqual(l1, l2), is(equalTo(false)));
    }

    @Test
    public void shouldReturnFalseIfFirstLongIsNull() {
        Long l2 = 2L;
        assertThat(areEqual(null, l2), is(equalTo(false)));
    }

    @Test
    public void shouldReturnFalseIfSecondLongIsNull() {
        Long l1 = 1L;
        assertThat(areEqual(l1, null), is(equalTo(false)));
    }

    @Test
    public void shouldReturnTrueWhenDefaultLongAndNullPassed() {
        Long l1 = JAVA_DEFAULT_LONG;
        Long l2 = null;
        assertThat(areEqual(l1, l2), is(equalTo(true)));
    }

    @Test
    public void shouldOverrideDefaultLong() {
        Long l1 = JAVA_DEFAULT_LONG;
        Long l2 = null;
        assertThat(areEqual(l1, l2, 1L), is(equalTo(false)));
    }

    @Test
    public void shouldReturnTrueIfTwoIntegersAreEqual() {
        Integer i1 = 1;
        Integer i2 = 1;
        assertThat(areEqual(i1, i2), is(equalTo(true)));
    }

    @Test
    public void shouldReturnFalseIfTwoIntegersAreNotEqual() {
        Integer i1 = 1;
        Integer i2 = 2;
        assertThat(areEqual(i1, i2), is(equalTo(false)));
    }

    @Test
    public void shouldReturnFalseIfFirstIntegerIsNull() {
        Integer i2 = 2;
        assertThat(areEqual(null, i2), is(equalTo(false)));
    }

    @Test
    public void shouldReturnFalseIfSecondIntegerIsNull() {
        Integer i1 = 1;
        assertThat(areEqual(i1, null), is(equalTo(false)));
    }

    @Test
    public void shouldReturnTrueWhenDefaultIntegerAndNullPassed() {
        Integer i1 = JAVA_DEFAULT_INT;
        Integer i2 = null;
        assertThat(areEqual(i1, i2), is(equalTo(true)));
    }

    @Test
    public void shouldOverrideDefaultInteger() {
        Integer i1 = JAVA_DEFAULT_INT;
        Integer i2 = null;
        assertThat(areEqual(i1, i2, 1), is(equalTo(false)));
    }

    @Test
    public void shouldReturnTrueIfTwoDoublesAreEqual() {
        Double d1 = 1.0;
        Double d2 = 1.0;
        assertThat(areEqual(d1, d2), is(equalTo(true)));
    }

    @Test
    public void shouldReturnFalseIfTwoDoublesAreNotEqual() {
        Double d1 = 1.0;
        Double d2 = 2.0;
        assertThat(areEqual(d1, d2), is(equalTo(false)));
    }

    @Test
    public void shouldReturnFalseIfFirstDoubleIsNull() {
        Double d2 = 2.0;
        assertThat(areEqual(null, d2), is(equalTo(false)));
    }

    @Test
    public void shouldReturnFalseIfSecondDoubleIsNull() {
        Double d1 = 1.0;
        assertThat(areEqual(d1, null), is(equalTo(false)));
    }

    @Test
    public void shouldReturnTrueWhenDefaultDoubleAndNullPassed() {
        Double d1 = JAVA_DEFAULT_DOUBLE;
        Double d2 = null;
        assertThat(areEqual(d1, d2), is(equalTo(true)));
    }

    @Test
    public void shouldOverrideDefaultDouble() {
        Double d1 = JAVA_DEFAULT_DOUBLE;
        Double d2 = null;
        assertThat(areEqual(d1, d2, 1.0), is(equalTo(false)));
    }

    @Test
    public void shouldReturnTrueIfTwoBytesAreEqual() {
        Byte b1 = 1;
        Byte b2 = 1;
        assertThat(areEqual(b1, b2), is(equalTo(true)));
    }

    @Test
    public void shouldReturnFalseIfTwoBytesAreNotEqual() {
        Byte b1 = 1;
        Byte b2 = 2;
        assertThat(areEqual(b1, b2), is(equalTo(false)));
    }

    @Test
    public void shouldReturnFalseIfFirstByteIsNull() {
        Byte b2 = 2;
        assertThat(areEqual(null, b2), is(equalTo(false)));
    }

    @Test
    public void shouldReturnFalseIfSecondByteIsNull() {
        Byte b1 = 1;
        assertThat(areEqual(b1, null), is(equalTo(false)));
    }

    @Test
    public void shouldReturnTrueWhenDefaultByteAndNullPassed() {
        Byte b1 = JAVA_DEFAULT_BYTE;
        Byte b2 = null;
        assertThat(areEqual(b1, b2), is(equalTo(true)));
    }

    @Test
    public void shouldOverrideDefaultByte() {
        Byte b1 = JAVA_DEFAULT_BYTE;
        Byte b2 = null;
        assertThat(areEqual(b1, b2, (byte) 1), is(equalTo(false)));
    }

    @Test
    public void shouldReturnTrueIfTwoBooleansAreEqual() {
        Boolean b1 = true;
        Boolean b2 = true;
        assertThat(areEqual(b1, b2), is(equalTo(true)));
    }

    @Test
    public void shouldReturnFalseIfTwoBooleansAreNotEqual() {
        Boolean b1 = true;
        Boolean b2 = false;
        assertThat(areEqual(b1, b2), is(equalTo(false)));
    }

    @Test
    public void shouldReturnFalseIfFirstBooleanIsNullAndValueIsTrue() {
        Boolean b2 = true;
        assertThat(areEqual(null, b2), is(equalTo(false)));
    }

    @Test
    public void shouldReturnFalseIfSecondBooleanIsNullAndValueIsTrue() {
        Boolean b1 = true;
        assertThat(areEqual(b1, null), is(equalTo(false)));
    }

    @Test
    public void shouldReturnTrueWhenDefaultBooleanAndNullPassed() {
        Boolean b1 = JAVA_DEFAULT_BOOLEAN;
        Boolean b2 = null;
        assertThat(areEqual(b1, b2), is(equalTo(true)));
    }

    @Test
    public void shouldOverrideDefaultBoolean() {
        Boolean b1 = JAVA_DEFAULT_BOOLEAN;
        Boolean b2 = null;
        assertThat(areEqual(b1, b2, true), is(equalTo(false)));
    }

    @Test
    public void shouldReturnTrueIfTwoFloatsAreEqual() {
        Float f1 = 1.0f;
        Float f2 = 1.0f;
        assertThat(areEqual(f1, f2), is(equalTo(true)));
    }

    @Test
    public void shouldReturnFalseIfTwoFloatsAreNotEqual() {
        Float f1 = 1.0f;
        Float f2 = 2.0f;
        assertThat(areEqual(f1, f2), is(equalTo(false)));
    }

    @Test
    public void shouldReturnFalseIfFirstFloatIsNull() {
        Float f2 = 2.0f;
        assertThat(areEqual(null, f2), is(equalTo(false)));
    }

    @Test
    public void shouldReturnFalseIfSecondFloatIsNull() {
        Float f1 = 1.0f;
        assertThat(areEqual(f1, null), is(equalTo(false)));
    }

    @Test
    public void shouldReturnTrueWhenDefaultFloatAndNullPassed() {
        Float f1 = JAVA_DEFAULT_FLOAT;
        Float f2 = null;
        assertThat(areEqual(f1, f2), is(equalTo(true)));
    }

    @Test
    public void shouldOverrideDefaultFloat() {
        Float f1 = JAVA_DEFAULT_FLOAT;
        Float f2 = null;
        assertThat(areEqual(f1, f2, 1.0f), is(equalTo(false)));
    }

    @Test
    public void shouldReturnTrueIfTwoShortsAreEqual() {
        Short s1 = 1;
        Short s2 = 1;
        assertThat(areEqual(s1, s2), is(equalTo(true)));
    }

    @Test
    public void shouldReturnFalseIfTwoShortsAreNotEqual() {
        Short s1 = 1;
        Short s2 = 2;
        assertThat(areEqual(s1, s2), is(equalTo(false)));
    }

    @Test
    public void shouldReturnFalseIfFirstShortIsNull() {
        Short s2 = 2;
        assertThat(areEqual(null, s2), is(equalTo(false)));
    }

    @Test
    public void shouldReturnFalseIfSecondShortIsNull() {
        Short s1 = 1;
        assertThat(areEqual(s1, null), is(equalTo(false)));
    }

    @Test
    public void shouldReturnTrueWhenDefaultShortAndNullPassed() {
        Short s1 = JAVA_DEFAULT_SHORT;
        Short s2 = null;
        assertThat(areEqual(s1, s2), is(equalTo(true)));
    }

    @Test
    public void shouldOverrideDefaultShort() {
        Short s1 = JAVA_DEFAULT_SHORT;
        Short s2 = null;
        assertThat(areEqual(s1, s2, (short) 1), is(equalTo(false)));
    }
}
