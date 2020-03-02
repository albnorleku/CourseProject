package com.roiacademy.training;

import java.util.Scanner;

public class LlogaritMesataren {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int gjatesiaEVargut = 0;
        do {
            System.out.println("Shtype gjatesin e vargu: ");
            gjatesiaEVargut = scanner.nextInt();
        } while (gjatesiaEVargut < 10);

        int [] vargu = new int[gjatesiaEVargut];

        for (int index = 0; index < vargu.length; ) {
            System.out.println("Shtyp vleren per poziten : " + index);
            int vlera = scanner.nextInt();

            if(vlera >= -250 && vlera <= 250) {
                vargu[index++] = vlera;
            }
        }
        double [] rezultati = kalkuloVlerat(vargu);
        System.out.println("Mesatarja e nr te shypur: "+ rezultati[0]);
        System.out.println("Perqindja e nr pozitiv: "+ rezultati[1]);
        System.out.println("Totali i nr negativ:  "+ (int)rezultati[2]);
    }

    public static double [] kalkuloVlerat(int [] vargu) {
        int totali = 0;
        int pozitivCounter = 0;
        int negativCounter = 0;
        for(int i : vargu) {
            totali += i;
            if (i >= 0) {
                pozitivCounter++;
            } else {
                negativCounter++;
            }
        }

        Double mesatarja = ((double) totali) / vargu.length;
        Double perqindjeENrPozitiv = ((double)pozitivCounter / vargu.length) * 100;
        double [] values = {mesatarja, perqindjeENrPozitiv, negativCounter};
        return values;
    }
}
