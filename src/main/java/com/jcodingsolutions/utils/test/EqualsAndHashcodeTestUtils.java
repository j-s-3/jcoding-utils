package com.jcodingsolutions.utils.test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;

public class EqualsAndHashcodeTestUtils {

    public static void testEqualsAndHashcode(Object o1, Object o2) {
        testEquals(o1, o2);
        testHashcode(o1, o2);
    }

    private static void testEquals(Object o1, Object o2) {
        assertThat(o1.equals(o1), is(equalTo(true)));
        assertThat(o1.equals(o2), is(equalTo(true)));
        assertThat(o1.equals(null), is(equalTo(false)));
        assertThat(o1.equals(""), is(equalTo(false)));
    }

    public static void testHashcode(Object o1, Object o2) {
        assertThat(o1.hashCode(), is(equalTo(o2.hashCode())));
        assertThat(o1.hashCode(), is(not(equalTo(0))));
    }
}
