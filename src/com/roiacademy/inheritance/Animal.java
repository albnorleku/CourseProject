package com.roiacademy.inheritance;


import com.roiacademy.exceptions.AnimalException;

public class Animal {
    private int age;
    private int nrOfFeet;
    //private String breed;

    public Animal(int age, int nrOfFeet) {
        this.age = age;
        this.nrOfFeet = nrOfFeet;
    }

    protected void setAge(int age) throws AnimalException {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setNrOfFeet(int nrOfFeet) {
        this.nrOfFeet = nrOfFeet;
    }

    public int getNrOfFeet(){
        return nrOfFeet;
    }

    protected void makesSound() {
        System.out.println("Animal is making sound!");
    }

    public static void testStatic() { //can not be overridden
        System.out.println("in static of Animal");
    }
}
