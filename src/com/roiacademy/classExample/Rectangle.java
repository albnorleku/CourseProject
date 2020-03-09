package com.roiacademy.classExample;

public class Rectangle implements Shape {

    public int width = 0;
    public int height = 0;
    public Point origin;  //has - a

    // four constructors
    public Rectangle() {
        origin = new Point(0, 0);
    }
    public Rectangle(Point p) {
        origin = p;
    }
    public Rectangle(int w, int h) {
        origin = new Point(0, 0);
        width = w;
        height = h;
    }
    public Rectangle(Point p, int w, int h) {
        origin = p;
        width = w;
        height = h;
    }

    // a method for moving the rectangle
    public void move(int x, int y) {
        origin.setX(x);
        origin.setY(y);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * ((double)width + height);
    }

    @Override
    public double calculateSiperfaqja() {
        return (double)width * height;
    }

}
