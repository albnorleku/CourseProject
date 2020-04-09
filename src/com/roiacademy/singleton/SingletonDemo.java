package com.roiacademy.singleton;

import com.roiacademy.ushtrime.Fakulteti;

public class SingletonDemo {
    public static void main(String[] args) {
        SingletonClass singletonClass = SingletonClass.initialize();
        SingletonClass singletonClass2 = SingletonClass.initialize();

        singletonClass.setName("Filani");

        System.out.println(singletonClass.getName());
        System.out.println(singletonClass2.getName());

        System.out.println("Classes are identical: " + singletonClass.equals(singletonClass2));

        /*Fakulteti f1 = new Fakulteti("test", 12);
        Fakulteti f2 = new Fakulteti("test", 12);

        System.out.println(f1.equals(f2));*/
    }
}
