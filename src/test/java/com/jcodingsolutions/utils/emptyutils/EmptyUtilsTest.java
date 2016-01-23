package com.jcodingsolutions.utils.emptyutils;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.jcodingsolutions.utils.emptyutils.EmptyUtils.isEmpty;
import static com.jcodingsolutions.utils.emptyutils.EmptyUtils.isNotEmpty;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;

public class EmptyUtilsTest {

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
    public void shouldReturnTrueWhenIsEmptyForMapCalledWithNull() {
        assertThat(isEmpty((Map) null), is(true));
    }

    @Test
    public void shouldReturnTrueWhenIsEmptyCalledWithEmptyMap() {
        assertThat(isEmpty(new HashMap()), is(true));
    }

    @Test
    public void shouldNotReturnTrueWhenIsEmptyCalledWithPopulatedMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("a", "b");
        assertThat(isEmpty(map), is(not(true)));
    }

    @Test
    public void shouldReturnTrueWhenIsNotEmptyCalledWithPopulatedString() {
        assertThat(isNotEmpty("test"), is(true));
    }

    @Test
    public void shouldReturnTrueWhenIsNotEmptyCalledWithPopulatedCollection() {
        List<String> list = new ArrayList<>();
        list.add("something");
        assertThat(isNotEmpty(list), is(true));
    }

    @Test
    public void shouldReturnTrueWhenIsNotEmptyCalledWithPopulatedMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("a", "b");
        assertThat(isNotEmpty(map), is(true));
    }
}
