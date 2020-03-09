package com.roiacademy.exceptions;

import java.io.IOException;

public class ExceptionTest {

    public static void main(String[] args) {
        int [] arr = { 0, 2 , 4 , 5 };
        System.out.println(arr[2]); //print
        try {
            System.out.println(arr[4]); // throws runtime exception
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Index out of bound exception");
        }
        System.out.println(arr[0]); //never reaches here.

        try {
            printTest(1);
            printTest(-1);
            try {
                printTest(3);
            } finally {

            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("An exception happened here! -> " + e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bound exception: " + e.getMessage());
        } finally {
            System.out.println("This Line executes all the time!");
        }
        /*catch (IOException | IndexOutOfBoundsException e) {
            //example can be handled this way!
        }*/
    }

    public static void printTest(int nr) throws IOException {
        int [] arr = {0, 3, 3};
        if (nr < 0) {
            throw new IOException("Number can not be negative!");
        }
        System.out.println("Number : " + arr[nr]);
    }
}
