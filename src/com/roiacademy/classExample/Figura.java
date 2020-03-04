package com.roiacademy.classExample;

import com.roiacademy.nestedClasses.ClassA;

public class Figura {
    public static void main(String[] args) {
        Point startingPoint = new Point(1, 3);
        Rectangle katrori1 = new Rectangle(startingPoint, 10, 15);
        System.out.println(katrori1.calculateSiperfaqja() + "cm square");

        katrori1.move(3, 5);
        System.out.println(katrori1.origin.getX() + " : " + katrori1.origin.getY());
        System.out.println(katrori1.calculatePerimeter());

        Rectangle katrori2 = new Rectangle(20, 30);
        katrori2.height = 25;
        System.out.println(katrori2.height);

        // From develop branch


        // branch test arjanit isufi
        // abetare

    }
}
