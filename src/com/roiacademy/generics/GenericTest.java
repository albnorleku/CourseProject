package com.roiacademy.generics;

public class GenericTest {
    public static void main(String[] args) {
        Integer [] integers = {1, 2, 3 ,4, 5};
        Double [] doubles = {1.3, 2.5, 23.5123};
        String [] strings = {"test", "string"};

        /*PrintClassGeneric<Integer> genericInteger = new PrintClassGeneric<>(integers);
        genericInteger.printType();
        PrintClassGeneric<Double> genericDouble = new PrintClassGeneric<>(doubles);
        genericDouble.printType();
        PrintClassGeneric<String> genericString = new PrintClassGeneric<>(strings);
        genericString.printType();*/
        PrintClassGeneric.printType(integers);
        PrintClassGeneric.printType(doubles);
        PrintClassGeneric.printType(strings);


        PrintClassGeneric<Integer> integerPrintClassGeneric = new PrintClassGeneric<>();
        integerPrintClassGeneric.add(2);

        PrintClassGeneric<String> stringGeneric = new PrintClassGeneric<>();
        stringGeneric.add("test");

        System.out.println("Integer class : " + integerPrintClassGeneric.getElement() + " is Integer " + (integerPrintClassGeneric.getElement() instanceof Integer) );
        System.out.println("String class : " + stringGeneric.getElement() );
    }
}
