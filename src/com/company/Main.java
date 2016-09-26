package com.company;

/**
 * Created by vitaliy on 26.09.16.
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {

        long val = 1_000_000;
        Counter counter = new Counter();
        counter.setCounter(val);

        while (counter.getCounter() == val) {
            counter = new Counter();

            for (int i = 0; i < 1000; i++) {
                CounterThread ct = new CounterThread(counter);
                ct.start();
            }
            Thread.sleep(1000);

            System.out.println("Counter:" + counter.getCounter());
        }
    }
}
