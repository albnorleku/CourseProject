package com.roiacademy.abstraction;

public class Kamion extends Automjet {

    private boolean rimorkio;

    Kamion(int nrRrotave) {
        super(nrRrotave);
    }

    public boolean getRimorkio() {
        return rimorkio;
    }

    public void setRimorkio(boolean rimorkio) {
        this.rimorkio = rimorkio;
    }

    public void autoPlusChangeGear() {
        int gear = super.getGear();
        ndrroShpejtsit(++gear);
    }

    public void autoMinusChangeGear() {
        int gear = super.getGear();
        ndrroShpejtsit(--gear);
    }

    @Override
    protected void ndrroShpejtsit(int gear) {
        super.setGear(gear);
        System.out.println("Changed gear to " + gear);
    }

    @Override
    public int getMass() {
        return 5000;
    }
}
