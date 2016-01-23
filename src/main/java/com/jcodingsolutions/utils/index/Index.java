package com.jcodingsolutions.utils.index;

public class Index {
    private int value;

    private Index(int index) {
        this.setValue(index);
    }

    public static Index atIndex(int index) {
        return new Index(index);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
