package com.jcodingsolutions.utils.conversion;

public interface Converter<E, T> {
    T convert(E e);
}
