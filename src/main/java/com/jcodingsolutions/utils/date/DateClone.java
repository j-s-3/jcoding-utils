package com.jcodingsolutions.utils.date;

import java.util.Date;

import static com.jcodingsolutions.utils.nullutils.NullUtils.isNotNull;

public class DateClone {

    public static Date safeCopyOfDate(Date date) {
        return isNotNull(date) ? new Date(date.getTime()) : null;
    }
}
