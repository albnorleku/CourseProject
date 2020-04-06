package com.roiacademy.concurrency;

public class SynchronizedDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            //synchronized (SynchronizedDemo.class) {
                doPrint("t1");
                System.out.println("Thread 1 finished");
            //}
        });

        Thread thread2 = new Thread(() -> {
            //synchronized (SynchronizedDemo.class) {
                doPrint("t2");
                System.out.println("Thread 2 Finished");
            //}
        });
        thread.start();
        thread2.start();
    }

    public static synchronized void doPrint(String threadName) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Printing number from thread " + threadName + "  - "+ i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
