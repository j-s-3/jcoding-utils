package com.jcodingsolutions.utils.copy;

import org.junit.Test;

import static com.jcodingsolutions.utils.copy.Copy.copy;
import static junit.framework.Assert.assertFalse;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNull.nullValue;

public class CopyTest {

    @Test
    public void shouldReturnNullWhenPassedNull() throws Exception {
        assertThat(copy(null), is(nullValue()));
    }

    @Test
    public void shouldReturnArrayWithSameContents() throws Exception {
        String[] input = new String[]{"A", "B"};
        String[] copy = copy(input);
        assertThat(copy[0], is(equalTo(input[0])));
        assertThat(copy[1], is(equalTo(input[1])));
        assertFalse(input == copy);
    }
}
