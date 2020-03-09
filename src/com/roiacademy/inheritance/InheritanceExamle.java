package com.roiacademy.inheritance;

import com.roiacademy.exceptions.AnimalException;

public class InheritanceExamle {
    public static void main(String[] args) {
        Animal animal = new Animal(4, 3);
        Dog dog = new Dog(2, 4, "bubi bubi");
        Animal animal1 = new Dog(2, 5, "bubi bubi");
        Dog animal2 = (Dog) animal1;
        animal.makesSound();
        dog.makesSound();
        animal1.makesSound();
        dog.setName("murrki");
        System.out.println(animal instanceof Dog);
        System.out.println(dog instanceof Animal);
        System.out.println(animal1 instanceof Dog);


        System.out.println( "Dog equals: " + dog.equals(animal2));

        try {
            dog.setAge(-1);
        } catch (AnimalException e) {
            e.printStackTrace();
            System.out.println(e.getAnimalName());
        }
    }
}
