package com.roiacademy.anonymousClasses;

public interface HelloWorld {
    public void sayHi();
    public String getFirstWord();

    default String englishHelloWorld() {
        return "Hello World";
    }
}
