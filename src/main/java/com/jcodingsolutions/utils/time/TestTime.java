package com.jcodingsolutions.utils.time;

public class TestTime implements Time {

    private long time;

    @Override
    public long timeInMillis() {
        return time;
    }

    public void setTimeInMillis(long time) {
        this.time = time;
    }
}
