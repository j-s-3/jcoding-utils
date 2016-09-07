package com.jcodingsolutions.utils.time;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class DefaultTimeTest {

    private Time time;

    @Before
    public void setUp() {
        this.time = new DefaultTime();
    }

    @Test
    public void shouldReturnSystemTime() throws Exception {
        long currentTimeMillis = System.currentTimeMillis();
        long l = time.timeInMillis();
        assertTrue(l >= currentTimeMillis);
        assertTrue(l < currentTimeMillis + 500L);
    }

}
