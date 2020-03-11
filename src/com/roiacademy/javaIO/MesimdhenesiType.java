package com.roiacademy.javaIO;

public enum MesimdhenesiType {
    PROFESORI(4),
    ASISTENTI(4);

    private final int pozita;

    MesimdhenesiType(int pozita) {
        this.pozita = pozita;
    }

    public int getPozita() {
        return pozita;
    }
}
