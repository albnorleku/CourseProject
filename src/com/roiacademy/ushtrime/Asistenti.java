package com.roiacademy.ushtrime;

public class Asistenti extends Mesimdhenesi {
    private String llojiIUshtrimeve;

    public Asistenti(String emri, int vitiILindjes, String fushaEStudimit, String llojiIUshtrimeve) {
        super(emri, vitiILindjes, fushaEStudimit);
        this.llojiIUshtrimeve = llojiIUshtrimeve;
    }

    public String getLlojiIUshtrimeve() {
        return llojiIUshtrimeve;
    }

    public void setLlojiIUshtrimeve(String llojiIUshtrimeve) {
        this.llojiIUshtrimeve = llojiIUshtrimeve;
    }

    @Override
    public String getAngazhimi() {
        return "Ushtrime";
    }

    public boolean mentoron() {
        return false;
    }

    public String toString() {
        return "Asistenti " + super.toString() + " mban " + getAngazhimi() + " " + getLlojiIUshtrimeve();
    }
}