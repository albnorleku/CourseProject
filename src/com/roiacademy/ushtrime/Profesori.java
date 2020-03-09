package com.roiacademy.ushtrime;

public class Profesori extends Mesimdhenesi {
    private String thirrjaAkademike;

    public Profesori(String emri, int vitiILindjes, String fushaEStudimit, String thirrjaAkademike) {
        super(emri, vitiILindjes, fushaEStudimit);
        this.thirrjaAkademike = thirrjaAkademike;
    }

    public String getThirrjaAkademike() {
        return thirrjaAkademike;
    }

    public void setThirrjaAkademike(String thirrjaAkademike) {
        this.thirrjaAkademike = thirrjaAkademike;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Profesori ").append(super.toString()).append(", mban ")
                .append(getAngazhimi()).append(", ka thirrje ").append(getThirrjaAkademike());

        return stringBuilder.toString();
    }

    @Override
    public String getAngazhimi() {
        return "Ligjerata";
    }
}
