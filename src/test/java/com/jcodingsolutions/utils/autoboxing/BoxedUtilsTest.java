package com.jcodingsolutions.utils.autoboxing;

import org.junit.Test;

import static com.jcodingsolutions.utils.autoboxing.BoxedUtils.booleanValueOf;
import static com.jcodingsolutions.utils.autoboxing.BoxedUtils.byteValueOf;
import static com.jcodingsolutions.utils.autoboxing.BoxedUtils.characterValueOf;
import static com.jcodingsolutions.utils.autoboxing.BoxedUtils.doubleValueOf;
import static com.jcodingsolutions.utils.autoboxing.BoxedUtils.floatValueOf;
import static com.jcodingsolutions.utils.autoboxing.BoxedUtils.integerValueOf;
import static com.jcodingsolutions.utils.autoboxing.BoxedUtils.longValueOf;
import static com.jcodingsolutions.utils.autoboxing.BoxedUtils.shortValueOf;
import static com.jcodingsolutions.utils.autoboxing.PrimitiveDefaults.JAVA_DEFAULT_BOOLEAN;
import static com.jcodingsolutions.utils.autoboxing.PrimitiveDefaults.JAVA_DEFAULT_BYTE;
import static com.jcodingsolutions.utils.autoboxing.PrimitiveDefaults.JAVA_DEFAULT_CHAR;
import static com.jcodingsolutions.utils.autoboxing.PrimitiveDefaults.JAVA_DEFAULT_DOUBLE;
import static com.jcodingsolutions.utils.autoboxing.PrimitiveDefaults.JAVA_DEFAULT_FLOAT;
import static com.jcodingsolutions.utils.autoboxing.PrimitiveDefaults.JAVA_DEFAULT_INT;
import static com.jcodingsolutions.utils.autoboxing.PrimitiveDefaults.JAVA_DEFAULT_LONG;
import static com.jcodingsolutions.utils.autoboxing.PrimitiveDefaults.JAVA_DEFAULT_SHORT;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class BoxedUtilsTest {

    @Test
    public void shouldReturnBooleanValueWhenNotNull() {
        Boolean bool = true;
        boolean result = booleanValueOf(bool, false);
        assertThat(result, is(equalTo(bool)));
    }

    @Test
    public void shouldReturnDefaultBooleanWhenNull() {
        boolean defaultValue = false;
        boolean result = booleanValueOf(null, defaultValue);
        assertThat(result, is(equalTo(defaultValue)));
    }

    @Test
    public void shouldReturnJavaDefaultBooleanWhenNullPassedAndNoDefaultSpecified() {
        boolean result = booleanValueOf(null);
        assertThat(result, is(equalTo(JAVA_DEFAULT_BOOLEAN)));
    }

    @Test
    public void shouldReturnLongValueWhenNotNull() {
        Long longValue = 1L;
        long result = longValueOf(longValue, 0L);
        assertThat(result, is(equalTo(longValue)));
    }

    @Test
    public void shouldReturnDefaultLongWhenNull() {
        long defaultValue = 1L;
        long result = longValueOf(null, defaultValue);
        assertThat(result, is(equalTo(defaultValue)));
    }

    @Test
    public void shouldReturnJavaDefaultLongWhenNullPassedAndNoDefaultSpecified() {
        long result = longValueOf(null);
        assertThat(result, is(equalTo(JAVA_DEFAULT_LONG)));
    }

    @Test
    public void shouldReturnIntegerValueWhenNotNull() {
        Integer integer = 1;
        int result = integerValueOf(integer, 1);
        assertThat(result, is(equalTo(integer)));
    }

    @Test
    public void shouldReturnDefaultIntegerWhenNull() {
        int defaultValue = 12;
        int result = integerValueOf(null, defaultValue);
        assertThat(result, is(equalTo(defaultValue)));
    }

    @Test
    public void shouldReturnJavaDefaultIntegerWhenNullPassedAndNoDefaultSpecified() {
        int result = integerValueOf(null);
        assertThat(result, is(equalTo(JAVA_DEFAULT_INT)));
    }

    @Test
    public void shouldReturnFloatValueWhenNotNull() {
        Float floatValue = 1.0f;
        float result = floatValueOf(floatValue, 1.0f);
        assertThat(result, is(equalTo(floatValue)));
    }

    @Test
    public void shouldReturnDefaultFloatWhenNull() {
        float defaultValue = 13.4f;
        float result = floatValueOf(null, defaultValue);
        assertThat(result, is(equalTo(defaultValue)));
    }

    @Test
    public void shouldReturnJavaDefaultFloatWhenNullPassedAndNoDefaultSpecified() {
        float result = floatValueOf(null);
        assertThat(result, is(equalTo(JAVA_DEFAULT_FLOAT)));
    }

    @Test
    public void shouldReturnDoubleValueWhenNotNull() {
        Double doubleValue = 1.0;
        double result = doubleValueOf(doubleValue, 1.0);
        assertThat(result, is(equalTo(doubleValue)));
    }

    @Test
    public void shouldReturnDefaultDoubleWhenNull() {
        double defaultValue = 1.337;
        double result = doubleValueOf(null, defaultValue);
        assertThat(result, is(equalTo(defaultValue)));
    }

    @Test
    public void shouldReturnJavaDefaultDoubleWhenNullPassedAndNoDefaultSpecified() {
        double result = doubleValueOf(null);
        assertThat(result, is(equalTo(JAVA_DEFAULT_DOUBLE)));
    }

    @Test
    public void shouldReturnCharValueWhenNotNull() {
        char characterValue = 'c';
        char result = characterValueOf(characterValue, '0');
        assertThat(result, is(equalTo(characterValue)));
    }

    @Test
    public void shouldReturnDefaultCharWhenNull() {
        char defaultValue = '0';
        char result = characterValueOf(null, defaultValue);
        assertThat(result, is(equalTo(defaultValue)));
    }

    @Test
    public void shouldReturnJavaDefaultCharWhenNullPassedAndNoDefaultSpecified() {
        char result = characterValueOf(null);
        assertThat(result, is(equalTo(JAVA_DEFAULT_CHAR)));
    }

    @Test
    public void shouldReturnByteValueWhenNotNull() {
        byte byteValue = 0;
        byte result = byteValueOf(byteValue, (byte) 0);
        assertThat(result, is(equalTo(byteValue)));
    }

    @Test
    public void shouldReturnDefaultByteWhenNull() {
        byte defaultValue = 0;
        byte result = byteValueOf(null, defaultValue);
        assertThat(result, is(equalTo(defaultValue)));
    }

    @Test
    public void shouldReturnJavaDefaultByteWhenNullPassedAndNoDefaultSpecified() {
        byte result = byteValueOf(null);
        assertThat(result, is(equalTo(JAVA_DEFAULT_BYTE)));
    }

    @Test
    public void shouldReturnShortValueWhenNotNull() {
        short shortValue = 0;
        short result = shortValueOf(shortValue, (short) 0);
        assertThat(result, is(equalTo(shortValue)));
    }

    @Test
    public void shouldReturnDefaultShortWhenNull() {
        short defaultValue = 0;
        short result = shortValueOf(null, defaultValue);
        assertThat(result, is(equalTo(defaultValue)));
    }

    @Test
    public void shouldReturnJavaDefaultShortWhenNullPassedAndNoDefaultSpecified() {
        short result = shortValueOf(null);
        assertThat(result, is(equalTo(JAVA_DEFAULT_SHORT)));
    }
}
