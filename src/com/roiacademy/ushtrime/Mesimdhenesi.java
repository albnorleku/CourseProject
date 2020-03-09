package com.roiacademy.ushtrime;

public abstract class Mesimdhenesi implements Angazhohet {
    private String emri;
    private int vitiILindjes;
    private String fushaEStudimit;

    public Mesimdhenesi(String emri, int vitiILindjes, String fushaEStudimit) {
        //todo handle exceptions
        this.emri = emri;
        this.vitiILindjes = vitiILindjes;
        this.fushaEStudimit = fushaEStudimit;
    }

    public String getEmri() {
        return emri;
    }

    public int getVitiILindjes() {
        return vitiILindjes;
    }

    public void setVitiILindjes(int vitiILindjes) {
        this.vitiILindjes = vitiILindjes;
    }

    public String getFushaEStudimit() {
        return fushaEStudimit;
    }

    public void setFushaEStudimit(String fushaEStudimit) {
        this.fushaEStudimit = fushaEStudimit;
    }

    public String toString() {
        return emri + ":" + vitiILindjes + " me fushe studimi "+ fushaEStudimit;
    }

    public boolean equals(Object object) {
        if(object instanceof Mesimdhenesi) {
            Mesimdhenesi mesimdhenesi = (Mesimdhenesi) object;
            return this.getEmri().equals(mesimdhenesi.getEmri()) && this.getVitiILindjes() == mesimdhenesi.getVitiILindjes();
        }
        return false;
    }
}
