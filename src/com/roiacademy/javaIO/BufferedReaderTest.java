package com.roiacademy.javaIO;

import com.roiacademy.ushtrime.*;

import java.io.*;
import java.nio.file.Path;

public class BufferedReaderTest {

    public static void main(String[] args) {
        Fakulteti fakulteti = new Fakulteti("CSE", 15);
        String dbFile = "C:\\Users\\albno\\Desktop\\IO ushtrime\\FakultetiDB.txt";
        Mesimdhenesi [] mesimdhenesit = getMesimdhenesit(dbFile);

        try {
            if(mesimdhenesit != null) {
                for (Mesimdhenesi mesimdhenesi : mesimdhenesit) {
                    if (mesimdhenesi != null) {
                        fakulteti.shtoMesimdhenesin(mesimdhenesi);
                        System.out.println("U shtua mesimdhenesi : "+ mesimdhenesi.toString() );
                    }
                }
                System.out.println(" -----------------------    ");
                System.out.println("Mesimdhenesi me i vjeter :" + fakulteti.mesimdhenesiMeIVjeter().toString());
            }
        } catch (MesimdhenesiException e) {
            e.printStackTrace();
        }

    }

    private static Mesimdhenesi [] getMesimdhenesit(String filePath) {
        try {
            FileReader fileReader = new FileReader(new File(filePath));
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            Mesimdhenesi [] mesimdhenesitNeFile = new Mesimdhenesi[15];
            int iteratorMesimdhenseve = 0;
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                System.out.println("=======================");
                String [] rreshti = line.split(";");
                Mesimdhenesi mesimdhenesi;
                String emri = rreshti[MesimdhenesiEnum.Emri.ordinal()].trim();
                int vitiILindjes = Integer.parseInt(rreshti[MesimdhenesiEnum.VitiILindje.ordinal()].trim());
                String fushaEStudimit = rreshti[MesimdhenesiEnum.FushaEStudimit.ordinal()].trim();
                String angazhimi = rreshti[MesimdhenesiEnum.Angazhimi.ordinal()].trim();

                if (rreshti[MesimdhenesiType.ASISTENTI.getPozita()].trim().equals(MesimdhenesiType.ASISTENTI.name())) {
                    mesimdhenesi = new Asistenti(emri, vitiILindjes, fushaEStudimit, angazhimi);
                } else {
                    mesimdhenesi = new Profesori(emri, vitiILindjes, fushaEStudimit, angazhimi);
                }
                mesimdhenesitNeFile[iteratorMesimdhenseve++] = mesimdhenesi;
            }
            return mesimdhenesitNeFile;
        } catch (FileNotFoundException f){
            f.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
