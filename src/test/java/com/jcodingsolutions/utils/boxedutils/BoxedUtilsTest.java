package com.jcodingsolutions.utils.boxedutils;

import org.junit.Test;

import static com.jcodingsolutions.utils.boxedutils.BoxedUtils.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class BoxedUtilsTest {

    boolean javaDefaultBoolean;
    long javaDefaultLong;
    int javaDefaultInteger;
    float javaDefaultFloat;
    double javaDefaultDouble;

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
        assertThat(result, is(equalTo(javaDefaultBoolean)));
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
        assertThat(result, is(equalTo(javaDefaultLong)));
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
        assertThat(result, is(equalTo(javaDefaultInteger)));
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
        assertThat(result, is(equalTo(javaDefaultFloat)));
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
        assertThat(result, is(equalTo(javaDefaultDouble)));
    }
}
