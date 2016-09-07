package com.jcodingsolutions.utils.time;

public class DefaultTime implements Time {
    @Override
    public long timeInMillis() {
        return System.currentTimeMillis();
    }
}
