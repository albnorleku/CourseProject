package com.roiacademy.newPackage;

public class Dog {

    private String name;
    private String breed;
    private int age;

    public static  String test2 = "TEST";
    public static final String test3 = "TEST";

    public static int addThese(int a, int b) {
        return a + b;
    }

    static {
        test2 = "Hello World!";
        //can not overwrite test3 because its final.
    }

    {
        System.out.println(test2);
    }

    public Dog(String dogName) {
        this.name = dogName;
    }

    public Dog(){
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setName(String name, String sureName) {
        String name2 = "sdasd";
    }

    public String getName() {
        return name;
    }

    public String doSomething() {
        return "im dogo!";
    }

}
