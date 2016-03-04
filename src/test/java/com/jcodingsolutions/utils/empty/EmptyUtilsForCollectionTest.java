package com.jcodingsolutions.utils.empty;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static com.jcodingsolutions.utils.empty.EmptyUtils.isEmpty;
import static com.jcodingsolutions.utils.empty.EmptyUtils.isNotEmpty;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;

public class EmptyUtilsForCollectionTest {

    @Test
    public void shouldReturnTrueWhenIsEmptyForCollectionCalledWithNull() {
        assertThat(isEmpty((Collection) null), is(true));
    }

    @Test
    public void shouldReturnTrueWhenIsEmptyCalledWithEmptyList() {
        assertThat(isEmpty(new ArrayList()), is(true));
    }

    @Test
    public void shouldNotReturnTrueWhenIsEmptyCalledWithPopulatedList() {
        List<String> list = new ArrayList<>();
        list.add("something");
        assertThat(isEmpty(list), is(not(true)));
    }

    @Test
    public void shouldReturnTrueWhenIsNotEmptyCalledWithPopulatedCollection() {
        List<String> list = new ArrayList<>();
        list.add("something");
        assertThat(isNotEmpty(list), is(true));
    }

}
