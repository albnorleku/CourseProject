package com.roiacademy.ushtrime;

public class Fakulteti {
    private String drejtimi;

    private Mesimdhenesi [] mesimdhenesit;

    private int index = 0;

    public Fakulteti(String drejtimi, int nrM) {
        this.drejtimi = drejtimi;
        this.mesimdhenesit = new Mesimdhenesi[nrM];
    }

    public void shtoMesimdhenesin(Mesimdhenesi mesimdhenesi) throws MesimdhenesiException{
        if (mesimdhenesi == null) {
            throw new MesimdhenesiException("Mesimdhenesi nuk mund te jet null!");
        }
        if(mesimdhenesit.length == index) {
            throw  new MesimdhenesiException("Nuk ka vend ne Array!");
        }

        for (int i = 0; i < index; i++) {
            if(mesimdhenesit[i].equals(mesimdhenesi)) {
                throw new MesimdhenesiException("Mesimdhenesi ekziston!");
            }
        }
        mesimdhenesit[index++] = mesimdhenesi;
    }

    public void shtypAngazhimiFusha(String angazhimi, String fushaEStudimit) throws MesimdhenesiException{
        if (angazhimi == null || fushaEStudimit == null) {
            throw new MesimdhenesiException("Angazhimi ose fusha e studimit nuk mund te jene null");
        }

        for(int i = 0; i < index; i++) {
            Mesimdhenesi temp = mesimdhenesit[i];
            if(temp.getAngazhimi().equals(angazhimi) && temp.getFushaEStudimit().equals(fushaEStudimit)) {
                System.out.println(temp.toString());
            }
        }
    }

    public Mesimdhenesi mesimdhenesiMeIVjeter() {
        Mesimdhenesi mesimdhenesiMeIVjeter = null;
        for (int i = 0; i < index; i++ ) {
//            if (mesimdhenesit[i].mentoron()) {
                if (mesimdhenesiMeIVjeter == null || mesimdhenesit[i].getVitiILindjes() <= mesimdhenesiMeIVjeter.getVitiILindjes()) {
                    mesimdhenesiMeIVjeter = mesimdhenesit[i];
                }
//            }
        }
        return mesimdhenesiMeIVjeter;
    }

    public static void main(String[] args) {

        Fakulteti fakulteti = new Fakulteti("JAVA", 10);
        Mesimdhenesi mesimdhenesi = new Asistenti("Filan", 1992, "Stomatolog", "me ngjit bllomba");
        Mesimdhenesi mesimdhenesi2 = new Profesori("Fisteki", 1980, "Gjinekolog", "me nxjer ...");

        try {
            fakulteti.shtoMesimdhenesin(mesimdhenesi);
            fakulteti.shtoMesimdhenesin(mesimdhenesi2);
            Mesimdhenesi mesimdhenesiMeIVjeter = fakulteti.mesimdhenesiMeIVjeter();
            System.out.println("Mesimdhenesi me i vjeter " + mesimdhenesiMeIVjeter);

            fakulteti.shtypAngazhimiFusha("Ushtrime", "Stomatolog");


        } catch (MesimdhenesiException e) {
            System.out.println(e.getMessage());
        }
    }
}
