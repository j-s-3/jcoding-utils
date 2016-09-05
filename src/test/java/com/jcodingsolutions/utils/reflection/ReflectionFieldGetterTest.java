package com.jcodingsolutions.utils.reflection;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNull.nullValue;

public class ReflectionFieldGetterTest {

    private ReflectionFieldGetter reflectionFieldGetter;

    @Before
    public void setUp() {
        reflectionFieldGetter = new ReflectionFieldGetter(TestClass.class, "field");
    }

    @Test
    public void shouldGetField() throws Exception {
        String value = "value";
        TestClass testClass = new TestClass(value);
        assertThat(reflectionFieldGetter.tryToGet(testClass), is(equalTo(value)));
    }

    @Test
    public void shouldGetNull_WhenInvalidObjectPassed() throws Exception {
        assertThat(reflectionFieldGetter.tryToGet(new String()), is(nullValue()));
    }

}
