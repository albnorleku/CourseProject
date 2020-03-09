package com.roiacademy.exceptions;

public class AnimalException extends Exception {
    private String animalName;

    public AnimalException(String message, String animalName) {
        super(message);
        this.animalName = animalName;
    }

    public String getAnimalName() {
        return animalName;
    }
}
