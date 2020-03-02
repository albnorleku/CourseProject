package com.roiacademy.classExample;

public class Figura {
    public static void main(String[] args) {
        Point startingPoint = new Point(1, 3);
        Rectangle katrori1 = new Rectangle(startingPoint, 10, 15);
        System.out.println(katrori1.getArea() + "cm square");

        katrori1.move(3, 5);
        System.out.println(katrori1.origin.getX() + " : " + katrori1.origin.getY());
        System.out.println(katrori1.getPerimeter());

        Rectangle katrori2 = new Rectangle(20, 30);


        // branch test arjanit isufi
        // abetare
    }
}
