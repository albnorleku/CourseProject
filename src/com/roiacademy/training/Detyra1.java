package com.roiacademy.training;

import java.util.Scanner;

public class Detyra1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String THE_END = "the end";

        int countTotalWords = 0; //holds total number of words
        int countAtLeast2WordsThatContainEnd = 0;
        String text;
        do {
            System.out.println("Shtyp text: ");
            text = scanner.nextLine();
            if(!text.equals(THE_END)) {
                countTotalWords++;
                boolean kushti = testKushtin(text);
                if(kushti) {
                    countAtLeast2WordsThatContainEnd++;
                }
            }
        } while (!text.equals(THE_END));

        if(countTotalWords > 0) {
            System.out.println("Ne Total jane shtypur \""  + countTotalWords +
                    "\" fjali dhe " + countAtLeast2WordsThatContainEnd +
                    " fjale prej tyre plotesojn kushtin.");
        } else {
            System.out.println("Nuk keni shypur asnje fjali!");
        }
    }

    private static boolean testKushtin(String word) {
        String [] fjaletNeFjali = word.split(" ");
        int countEndWords = 0;
        for (String fjal : fjaletNeFjali) {
            if (fjal.toLowerCase().contains("end")) {
                countEndWords++;
            }
        }
        if(countEndWords >= 2) {
            return true;
        }
        return false;
    }
}


/*
*⦁	Shkruani klasën NumeroRreshtat që e kryen funksionin më poshtë

Në metodën main 									  [6 pikë]

⦁	Duke përdorë do while loop të kërkohet nga shfrytëzuesi të shtyp tekst deri sa nuk  shtypet teksti the end (case sensitive) që është sentinel, terminon unazën (loop) dhe nuk hyn në kalkulim.

VINI RE: Nuk pranohet përdorimi i komandës break për terminim të loop

⦁	Në fund të shfaqet numri i të gjitha fjalive të shtypura si dhe të atyre që kanë së paku dy (2) fjalë që përmbajnë tekstin end (case insensitive) në rresht.


Rezultati të shfaqet si më poshtë:

Ne total jane shtypur <total> fjali dhe <nr_fjali> prej tyre plotesojne kushtin

Ose nëse nuk është shtypur asnjë fjali (tekst) të afishohet teksti

Nuk u shtyp asnjë fjali

P.sh. Një fjali që plotëson kushtin

Vikend me diell ne VENDIN tone



Metoda testoKushtin						                    [10 pikë]

⦁	Rezultati nëse një fjali e plotëson kushtin e kërkuar në pikën b) duhet të realizohet përmes metodës testoKushtin

*/
