package com.roiacademy.concurrency;

import com.roiacademy.h2Database.model.CourseUsers;

import java.util.Optional;

public class ConcurrencyProgramTest {
    public static void main(String[] args) {
        RunnableConcurrencyProgram runnableConcurrencyProgram = new RunnableConcurrencyProgram("t-1", 100);
        //RunnableConcurrencyProgram runnableConcurrencyProgram2 = new RunnableConcurrencyProgram("t-2", 500);

        runnableConcurrencyProgram.start();
        //runnableConcurrencyProgram2.start();

        ThreadConcurrencyProgram threadConcurrencyProgram = new ThreadConcurrencyProgram("t-3", 200);
        //ThreadConcurrencyProgram threadConcurrencyProgram2 = new ThreadConcurrencyProgram("t-4", 1000);
        threadConcurrencyProgram.start();
        //threadConcurrencyProgram2.start();

        Thread runnable = new Thread(() -> {
            for(int i = 0; i < 15; i++) {
                System.out.println("Running in anonymous  class: " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        runnable.start();
        runnable.setName("TEST-3");

        Thread thread = new Thread(() -> {
            for(int i = 0; i < 15; i++) {
                System.out.println("Running in anonymous thread class: " + i);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
        thread.setName("noli's thread");

        // OPTIONAL java.
        Optional<CourseUsers> courseUsers = Optional.empty();
        //CourseUsers courseUsers = null;

        courseUsers.ifPresent(cu -> System.out.println(cu.getFirstName()));
        String firstName = null;
        if (courseUsers.isPresent()) {
            firstName = courseUsers.get().getFirstName();
        }
    }
}
