package com.jcodingsolutions.utils.date;

import org.junit.Test;

import java.util.Date;

import static com.jcodingsolutions.utils.date.DateClone.safeCopyOfDate;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.hamcrest.core.IsNull.nullValue;

public class DateCloneTest {

    @Test
    public void shouldCreateDateClone() {
        Date testDate = new Date();
        Date result = safeCopyOfDate(testDate);
        assertThat(result, is(notNullValue()));
        assertThat(result == testDate, is(equalTo(false)));
    }

    @Test
    public void shouldReturnNullWhenNullArgument() {
        Date result = safeCopyOfDate(null);
        assertThat(result, is(nullValue()));
    }
}
