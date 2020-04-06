package com.roiacademy.concurrency;

public class RunnableConcurrencyProgram implements Runnable {
    private Thread thread;
    private String threadName;
    private int milliSeconds;

    public RunnableConcurrencyProgram(String threadName, int milliSeconds) {
        this.threadName = threadName;
        this.milliSeconds = milliSeconds;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("Runnable " + threadName + " - " + i);
                Thread.sleep(milliSeconds);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void start() {
        System.out.println("Thread " + threadName + " has started!");
        thread = new Thread(this, threadName);
        thread.start();
    }
}
