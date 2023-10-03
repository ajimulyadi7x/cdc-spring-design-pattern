package com.cdc2023.springdesignpattern.singleton;

public class Counter {

    private Long value = 0L;

    public Long getValue() {
        return value;
    }

    /**
     * handling race condition
     * the method which changes the value
     * should be use syncronize method
     */
    public synchronized void increment() {
        value++;
    }
}
