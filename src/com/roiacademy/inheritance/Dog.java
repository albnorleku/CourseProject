package com.roiacademy.inheritance;

public class Dog extends Animal {

    private String name;

    public static String test2;
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

    public Dog(int age, int nrOfFeet, String dogName) {
        super(age, nrOfFeet);
        this.name = dogName;
    }

    public Dog(int age, int nrOfFeet){
        super(age, nrOfFeet);
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

    @Override
    public void makesSound() {
        //super.makesSound();
        System.out.println("Qeni leh!");
    }

    public void setAge(int nr) {
        nr += 1;
        super.setAge(nr);
    }

}
