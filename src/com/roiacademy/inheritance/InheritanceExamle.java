package com.roiacademy.inheritance;

public class InheritanceExamle {
    public static void main(String[] args) {
        Animal animal = new Animal(4, 3);
        Dog dog = new Dog(2, 4, "bubi bubi");
        Animal animal1 = new Dog(2, 5, "bubi 2");

        animal.makesSound();
        dog.makesSound();
        animal1.makesSound();
        dog.setName("murrki");
        System.out.println(animal instanceof Dog);
        System.out.println(dog instanceof Animal);
        System.out.println(animal1 instanceof Dog);
    }
}
