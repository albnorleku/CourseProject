package com.roiacademy.inheritance;

import com.roiacademy.exceptions.AnimalException;

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

    public void setAge(int nr) throws AnimalException {
        if (nr < 0) {
            throw new AnimalException("Age can not be negative!", getName());
        }
        nr += 1;
        super.setAge(nr);
    }

    public boolean equals(Object object) {
        if (object instanceof Dog) {
            Dog dog = (Dog) object;
            return getName().equalsIgnoreCase(dog.getName());
        }
        return false;
    }
}
