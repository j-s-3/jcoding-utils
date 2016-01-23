package com.jcodingsolutions.utils.emptyutils;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static com.jcodingsolutions.utils.emptyutils.EmptyUtils.isEmpty;
import static com.jcodingsolutions.utils.emptyutils.EmptyUtils.isNotEmpty;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;

public class EmptyUtilsForMapTest {

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
    public void shouldReturnTrueWhenIsNotEmptyCalledWithPopulatedMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("a", "b");
        assertThat(isNotEmpty(map), is(true));
    }
}
