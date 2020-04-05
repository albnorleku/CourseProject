package com.roiacademy.javaIO.fakultetiRepository;

import com.roiacademy.javaIO.MesimdhenesiType;
import com.roiacademy.ushtrime.Asistenti;
import com.roiacademy.ushtrime.Mesimdhenesi;

import java.io.*;

public class FakultetiRepository {
    private BufferedWriter bufferedWriter;

    public FakultetiRepository(String filePath) throws IOException {
        FileWriter fileWriter = new FileWriter("C:\\Users\\albno\\Desktop\\IO ushtrime\\Fakulteti2.txt");
        bufferedWriter = new BufferedWriter(fileWriter);
    }

    public void saveMesimdhenesi(Mesimdhenesi mesimdhenesi) throws IOException {
        String mesimdhenesiTransformed = transformMesimdhenesi(mesimdhenesi);
        System.out.println(mesimdhenesiTransformed);
        bufferedWriter.write(mesimdhenesiTransformed);
        bufferedWriter.newLine();
        bufferedWriter.flush();
    }

    public String transformMesimdhenesi(Mesimdhenesi mesimdhenesi) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(mesimdhenesi.getEmri()).append(";");
        stringBuilder.append(mesimdhenesi.getVitiILindjes()).append(";");
        stringBuilder.append(mesimdhenesi.getFushaEStudimit()).append(";");
        stringBuilder.append(mesimdhenesi.getAngazhimi()).append(";");
        MesimdhenesiType mesimdhenesiType = mesimdhenesi.mentoron() ? MesimdhenesiType.PROFESORI : MesimdhenesiType.ASISTENTI;
        stringBuilder.append(mesimdhenesiType.name());
        return stringBuilder.toString();
    }
}
