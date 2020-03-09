package com.roiacademy.ushtrime;

public class Asistenti extends Mesimdhenesi {
    private String llojiIUshtrimeve;

    public Asistenti(String emri, int vitiILindjes, String fushaEStudimit, String llojiIUshtrimeve) throws  MesimdhenesiException{
        super(emri, vitiILindjes, fushaEStudimit);
        if(llojiIUshtrimeve.trim().length() == 0 || llojiIUshtrimeve.isEmpty()) {
            throw new MesimdhenesiException("Lloji i ushtrimeve nuk mund te jete negative");
        }
        this.llojiIUshtrimeve = llojiIUshtrimeve;
    }

    public String getLlojiIUshtrimeve() {
        return llojiIUshtrimeve;
    }

    public void setLlojiIUshtrimeve(String llojiIUshtrimeve) throws MesimdhenesiException {
        if(llojiIUshtrimeve.trim().length() == 0 || llojiIUshtrimeve.isEmpty()) {
            throw new MesimdhenesiException("Lloji i ushtrimeve nuk mund te jete negative");
        }
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
