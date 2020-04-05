package com.roiacademy.javaIO.fakultetiController;

import com.roiacademy.javaIO.BufferedReaderTest;
import com.roiacademy.javaIO.fakultetiService.FakultetiService;
import com.roiacademy.ushtrime.*;

import java.io.BufferedReader;
import java.io.IOException;

public class FakultetiTest {

    public static void main(String[] args) {
        Fakulteti fakulteti = new Fakulteti("JAVA", 10);
        Mesimdhenesi mesimdhenesi = new Asistenti("Filan", 1992, "Stomatolog", "me ngjit bllomba");
        Mesimdhenesi mesimdhenesi2 = new Profesori("Fisteki", 1980, "Gjinekolog", "me nxjer ...");

        try {
            Mesimdhenesi mesimdhenesiMeIVjeter = fakulteti.mesimdhenesiMeIVjeter();
            //System.out.println("Mesimdhenesi me i vjeter " + mesimdhenesiMeIVjeter);

            //fakulteti.shtypAngazhimiFusha("Ushtrime", "Stomatolog");
            fakulteti.shtoMesimdhenesin(mesimdhenesi);
            fakulteti.shtoMesimdhenesin(mesimdhenesi2);
            FakultetiService fakultetiService = new FakultetiService(BufferedReaderTest.dbFile);
            fakultetiService.saveMesimdhenesitFromFakulteti(fakulteti);
        } catch (MesimdhenesiException | IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
