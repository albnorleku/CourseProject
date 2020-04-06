package com.roiacademy.unitTesting;

public class Calculator {
    public static double splitAndCalculate(String value) throws Exception {
        if (!value.contains("/")) {
            throw new Exception("Can not split this value!");
        }
        String [] number = value.split("/");
        return Double.parseDouble(number[0]) / Double.parseDouble(number[1]);
    }

    public static void main(String[] args) {
        try {
            System.out.println(splitAndCalculate("20/0"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
