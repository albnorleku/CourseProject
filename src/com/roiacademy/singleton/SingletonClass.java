package com.roiacademy.singleton;

public class SingletonClass {
    private static SingletonClass instance;
    private String name;

    private SingletonClass() {}

    public static SingletonClass initialize() {
        if (instance == null) {
            synchronized (SingletonClass.class) {
                if (instance == null) {
                    instance = new SingletonClass();
                }
            }
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
