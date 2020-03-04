package com.roiacademy.anonymousClasses;

import com.roiacademy.newPackage.Dog;

public class AnonymousClassExample {

    public static void main(String[] args) {

        HelloWorld hiInEnglish = new HelloWorld() {
            @Override
            public void sayHi() {
                System.out.println("Hello World!");
            }

            @Override
            public String getFirstWord() {
                return "Hi!";
            }
        };

        HelloWorld hiNeShqip = new HelloWorld() {
            @Override
            public void sayHi() {
                System.out.println("Tung Bote!");
            }

            @Override
            public String getFirstWord() {
                return "Pershendetje!";
            }
        };

        Dog rexi = new Dog() {
            @Override
            public void setName(String name) {
                super.setName("rex_" + name);
            }
        };
        rexi.setName("rexiiii");

        hiInEnglish.sayHi();
        hiNeShqip.sayHi();

        System.out.println(hiInEnglish.getFirstWord());
        System.out.println(hiNeShqip.getFirstWord());

        System.out.println(rexi.getName());
    }
}
