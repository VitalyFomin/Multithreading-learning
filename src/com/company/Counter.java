package com.company;

/**
 * Created by vitaliy on 26.09.16.
 */
public class Counter {
    private long counter = 0L;

    public void increaseCounter() {
        counter++;
    }

    public long getCounter() {
        return counter;
    }

    public void setCounter(long counter) {
        this.counter = counter;
    }
}
