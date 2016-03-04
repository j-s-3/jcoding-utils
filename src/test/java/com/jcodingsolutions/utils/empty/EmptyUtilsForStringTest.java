package com.jcodingsolutions.utils.empty;

import org.junit.Test;

import static com.jcodingsolutions.utils.empty.EmptyUtils.isEmpty;
import static com.jcodingsolutions.utils.empty.EmptyUtils.isNotEmpty;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;

public class EmptyUtilsForStringTest {

    @Test
    public void shouldReturnTrueWhenIsEmptyForStringCalledWithNull() {
        assertThat(isEmpty((String) null), is(true));
    }

    @Test
    public void shouldReturnTrueWhenIsEmptyCalledWithEmptyString() {
        assertThat(isEmpty(""), is(true));
    }

    @Test
    public void shouldNotReturnTrueWhenIsEmptyCalledWithPopulatedString() {
        assertThat(isEmpty("test"), is(not(true)));
    }

    @Test
    public void shouldReturnTrueWhenIsNotEmptyCalledWithPopulatedString() {
        assertThat(isNotEmpty("test"), is(true));
    }
}
