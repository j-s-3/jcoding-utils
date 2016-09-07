package com.jcodingsolutions.utils.time;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class TestTimeTest {

    private Time testTime;

    @Before
    public void setUp() {
        this.testTime = new TestTime();
    }

    @Test
    public void shouldReturnSetTime() throws Exception {
        long time = 10L;
        ((TestTime) testTime).setTimeInMillis(time);
        assertThat(testTime.timeInMillis(), is(equalTo(time)));
    }

}
