package com.cdc2023.springdesignpattern.singleton;

public class Counter {

    private Long value = 0L;

    public Long getValue() {
        return value;
    }

    public void increment() {
        value++;
    }
}
