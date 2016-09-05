package com.jcodingsolutions.utils.reflection;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class ReflectionFieldSetterTest {

    ReflectionFieldSetter reflectionFieldSetter;

    @Before
    public void setUp() {
        reflectionFieldSetter = new ReflectionFieldSetter(TestClass.class, "field");
    }

    @Test
    public void shouldDoNothing() throws Exception {

    }

    @Test
    public void shouldSetField_OnTrySetField() throws Exception {
        String value = "contents";
        TestClass testClass = new TestClass("");
        reflectionFieldSetter.trySetField(testClass, value);
        assertThat(testClass.getField(), is(equalTo(value)));
    }

    @Test
    public void shouldHandleException_WhenInvalidField() throws Exception {
        reflectionFieldSetter.trySetField(new String(), "Value");
    }

}
