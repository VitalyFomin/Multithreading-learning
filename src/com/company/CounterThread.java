package com.company;

/**
 * Created by vitaliy on 26.09.16.
 */
public class CounterThread extends Thread {

    private Counter counter;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increaseCounter();
        }
    }
}