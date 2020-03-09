package com.roiacademy.ushtrime;

public class Profesori extends Mesimdhenesi {
    private String thirrjaAkademike;

    public Profesori(String emri, int vitiILindjes, String fushaEStudimit, String thirrjaAkademike) throws  MesimdhenesiException{
        super(emri, vitiILindjes, fushaEStudimit);
        if(thirrjaAkademike.trim().length() == 0 || thirrjaAkademike.isEmpty()) {
            throw new MesimdhenesiException("Thirrja akademike nuk mund te jete e zbrazet !");
        }
        this.thirrjaAkademike = thirrjaAkademike;
    }

    public String getThirrjaAkademike() {
        return thirrjaAkademike;
    }

    public void setThirrjaAkademike(String thirrjaAkademike) throws MesimdhenesiException {
        if(thirrjaAkademike.trim().length() == 0 || thirrjaAkademike.isEmpty()) {
            throw new MesimdhenesiException("Thirrja akademike nuk mund te jete e zbrazet !");
        }
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
