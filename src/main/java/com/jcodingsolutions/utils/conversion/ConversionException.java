package com.jcodingsolutions.utils.conversion;

public class ConversionException extends RuntimeException {

    public ConversionException(String message) {
        super(message);
    }

    public ConversionException(Throwable throwable) {
        super(throwable);
    }
}
