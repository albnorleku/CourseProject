package com.roiacademy.abstraction;

import com.roiacademy.inheritance.Trup;

public abstract class Automjet implements Trup {
    private int nrRrota;

    private int gear;

    Automjet(int nrRrota) {
        this.nrRrota = nrRrota;
    }

    public int getNrRrota() {
        return nrRrota;
    }

    public void setNrRrota(int nrRrota) {
        this.nrRrota = nrRrota;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    protected abstract void ndrroShpejtsit(int gear) ;
}
