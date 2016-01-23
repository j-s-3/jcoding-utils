package com.jcodingsolutions.utils.nullutils;

import org.junit.Test;

import static com.jcodingsolutions.utils.nullutils.NullUtils.isNotNull;
import static com.jcodingsolutions.utils.nullutils.NullUtils.isNull;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class NullUtilsTest {

    @Test
    public void shouldReturnTrueWhenIsNullCalledWithNull() {
        assertThat(isNull(null), is(true));
    }

    @Test
    public void shouldNotReturnTrueWhenIsNullCallWithNonNull() {
        assertThat(isNull(new Object()), is(not(true)));
    }

    @Test
    public void shouldReturnTrueWhenIsNotNullCalledWithNonNull() {
        assertThat(isNotNull(new Object()), is(true));
    }

    @Test
    public void shouldReturnFalseWhenIsNotNullCalledWithNull() {
        assertThat(isNotNull(null), is(not(true)));
    }


}
