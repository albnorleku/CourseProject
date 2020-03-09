package com.roiacademy.ushtrime;

public abstract class Mesimdhenesi implements Angazhohet {
    private String emri;
    private int vitiILindjes;
    private String fushaEStudimit;

    public Mesimdhenesi(String emri, int vitiILindjes, String fushaEStudimit) throws  MesimdhenesiException{
       if(emri.trim().length() == 0 || emri.isEmpty()) {
           throw new MesimdhenesiException("Emri nuk mund te jete i zbrazet !");
       }
       if(vitiILindjes < 0) {
           throw new MesimdhenesiException("VitiLindjes nuk mund te jete negativ");
       }

       if(fushaEStudimit.trim().length() == 0 || fushaEStudimit.isEmpty()) {
           throw  new MesimdhenesiException("Fusha Studimit nuk mund te jete e zbrazet");
       }
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

    public void setVitiILindjes(int vitiILindjes) throws MesimdhenesiException {
        if(vitiILindjes < 0) {
            throw new MesimdhenesiException("VitiLindjes nuk mund te jete negativ");
        }
        this.vitiILindjes = vitiILindjes;
    }

    public String getFushaEStudimit() {
        return fushaEStudimit;
    }

    public void setFushaEStudimit(String fushaEStudimit) throws MesimdhenesiException {
        if(fushaEStudimit.trim().length() == 0 || fushaEStudimit.isEmpty()) {
            throw  new MesimdhenesiException("Fusha Studimit nuk mund te jete e zbrazet");
        }
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
