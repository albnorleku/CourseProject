package com.roiacademy.training;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        String reverseWord = getReverseWord(word);

        String kushti = word.equalsIgnoreCase(reverseWord) ? "Yes" : "No";
        String reverse = getReverseWord(word);
        System.out.println(reverse + " -> " + kushti);
    }

    private static String getReverseWord(String word) {
        char [] chars = word.toCharArray();
        String reverseWord = "";
        for (int i = chars.length-1; i >= 0; i--) {
            reverseWord += chars[i];
        }
        return reverseWord;
    }
}
