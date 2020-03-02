package com.roiacademy.training;

import java.util.Scanner;

public class DayOfTheWeek {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dayReturned = getDayOfTheWeekInOrder(scanner.nextInt());
        System.out.println(dayReturned);
    }

    private static String getDayOfTheWeekInOrder(int weekDay) {
        switch (weekDay) {
            case 1: {
               return "E hene";
            } case 2: {
               return "E Marte";
            } case 3: {
               return "E Merkure";
            } case 4: {
               return "E Enjte";
            } case 5: {
               return "E Premte";
            } default: {
               return " Nuk ka dite te javes!";
            }
        }
    }
}
