package com.roiacademy.javaIO.fakultetiService;

import com.roiacademy.javaIO.fakultetiRepository.FakultetiRepository;
import com.roiacademy.ushtrime.Fakulteti;
import com.roiacademy.ushtrime.Mesimdhenesi;
import com.roiacademy.ushtrime.MesimdhenesiException;

import java.io.IOException;

public class FakultetiService {
    private FakultetiRepository fakultetiRepository;

    public FakultetiService(String path) throws IOException {
        fakultetiRepository = new FakultetiRepository(path);
    }

    public void saveMesimdhenesitFromFakulteti(Fakulteti fakulteti) throws MesimdhenesiException, IOException {
        Mesimdhenesi [] mesimdhenesit = fakulteti.getMesimdhenesit();
        if (mesimdhenesit.length == 0) {
            throw new MesimdhenesiException("Nuk ka mesimdhenes");
        }

        for (Mesimdhenesi mesimdhenesi : mesimdhenesit) {
            if (mesimdhenesi != null) {
                System.out.println("Mesimdhenes : " + mesimdhenesi.getEmri());
                fakultetiRepository.saveMesimdhenesi(mesimdhenesi);
            }
        }
    }
}
