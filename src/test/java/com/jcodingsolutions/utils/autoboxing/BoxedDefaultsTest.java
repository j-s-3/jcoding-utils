package com.jcodingsolutions.utils.autoboxing;

import org.junit.Test;

import static com.jcodingsolutions.utils.autoboxing.BoxedDefaults.BOOLEAN;
import static com.jcodingsolutions.utils.autoboxing.BoxedDefaults.BYTE;
import static com.jcodingsolutions.utils.autoboxing.BoxedDefaults.CHARACTER;
import static com.jcodingsolutions.utils.autoboxing.BoxedDefaults.DOUBLE;
import static com.jcodingsolutions.utils.autoboxing.BoxedDefaults.FLOAT;
import static com.jcodingsolutions.utils.autoboxing.BoxedDefaults.INTEGER;
import static com.jcodingsolutions.utils.autoboxing.BoxedDefaults.LONG;
import static com.jcodingsolutions.utils.autoboxing.BoxedDefaults.SHORT;
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

public class BoxedDefaultsTest {

    @Test
    public void shouldReturnJavaDefaultBoolean() {
        assertThat(BOOLEAN, is(equalTo(JAVA_DEFAULT_BOOLEAN)));
    }

    @Test
    public void shouldReturnJavaDefaultByte() {
        assertThat(BYTE, is(equalTo(JAVA_DEFAULT_BYTE)));
    }

    @Test
    public void shouldReturnJavaDefaultCharacter() {
        assertThat(CHARACTER, is(equalTo(JAVA_DEFAULT_CHAR)));
    }

    @Test
    public void shouldReturnJavaDefaultDouble() {
        assertThat(DOUBLE, is(equalTo(JAVA_DEFAULT_DOUBLE)));
    }

    @Test
    public void shouldReturnJavaDefaultFloat() {
        assertThat(FLOAT, is(equalTo(JAVA_DEFAULT_FLOAT)));
    }

    @Test
    public void shouldReturnJavaDefaultInteger() {
        assertThat(INTEGER, is(equalTo(JAVA_DEFAULT_INT)));
    }

    @Test
    public void shouldReturnJavaDefaultLong() {
        assertThat(LONG, is(equalTo(JAVA_DEFAULT_LONG)));
    }

    @Test
    public void shouldReturnJavaDefaultShort() {
        assertThat(SHORT, is(equalTo(JAVA_DEFAULT_SHORT)));
    }
}
