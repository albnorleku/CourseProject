package com.roiacademy.abstraction;

public class AbstractionExample {
    public static void main(String[] args) {
        Kamion man = new Kamion(10);
        man.ndrroShpejtsit(2);
        man.ndrroShpejtsit(3);

        man.autoMinusChangeGear();
        System.out.println(man.getGear());
    }
}
