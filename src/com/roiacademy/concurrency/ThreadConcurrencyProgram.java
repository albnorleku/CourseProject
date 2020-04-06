package com.roiacademy.concurrency;

public class ThreadConcurrencyProgram extends Thread {
    private Thread thread;
    private String threadName;
    private int milliSeconds;

    public ThreadConcurrencyProgram(String threadName, int milliSeconds) {
        this.threadName = threadName;
        this.milliSeconds = milliSeconds;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("Thread " + threadName + " - " + i);
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
