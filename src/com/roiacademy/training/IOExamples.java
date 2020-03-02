package com.roiacademy.training;

import java.util.Scanner;

public class IOExamples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers = new int[10];
        int count = 0;
        int stopNr = -100;
        boolean shouldContinue = true;
        while (shouldContinue) {
            shouldContinue = scanner.hasNext();
            System.out.println("Type something: ");
            int nr = scanner.nextInt();
            numbers[count++] = nr;
            if(nr == stopNr) {
                shouldContinue = false;
            }
        }

        for(int i :  numbers) {
            System.out.println(i);
        }
    }
}
