package com.roiacademy.generics;

public class PrintClassGeneric<T> {
    private T element;

    public PrintClassGeneric() {
    }

    public void add(T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }

    public static <E> void printType(E [] arrayOfE) {
        for(E e : arrayOfE) {
            System.out.println("Element " + e + " class type " + e.getClass());
        }
    }
}
