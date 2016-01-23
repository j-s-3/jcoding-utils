package com.jcodingsolutions.utils.emptyutils;

import org.junit.Test;

import static com.jcodingsolutions.utils.emptyutils.EmptyUtils.isEmpty;
import static com.jcodingsolutions.utils.emptyutils.EmptyUtils.isNotEmpty;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;

public class EmptyUtilsForArrayTest {

    @Test
    public void shouldReturnTrueWhenIsEmptyForArrayCalledWithNull() {
        assertThat(isEmpty((Object[]) null), is(true));
    }

    @Test
    public void shouldReturnTrueWhenIsEmptyCalledWithEmptyArray() {
        assertThat(isEmpty(new Object[]{}), is(true));
    }

    @Test
    public void shouldNotReturnTrueWhenIsEmptyCalledWithPopulatedArray() {
        assertThat(isEmpty(new Object[]{"a"}), is(not(true)));
    }

    @Test
    public void shouldReturnTrueWhenIsNotEmptyCalledWithPopulatedMap() {
        assertThat(isNotEmpty(new Object[]{"a"}), is(true));
    }

}
