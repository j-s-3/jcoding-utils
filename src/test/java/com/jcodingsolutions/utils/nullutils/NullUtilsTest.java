package com.jcodingsolutions.utils.nullutils;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static com.jcodingsolutions.utils.nullutils.NullUtils.*;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsEmptyCollection.empty;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

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

    @Test
    public void shouldReturnListWhenNotNull() throws Exception {
        String value = "A";
        List<String> input = new ArrayList<>();
        input.add(value);
        assertThat(nonNullList(input).get(0), is(equalTo(value)));
    }

    @Test
    public void shouldReturnEmptyListWhenNull() throws Exception {
        assertThat(nonNullList(null), is(empty()));
    }


}
