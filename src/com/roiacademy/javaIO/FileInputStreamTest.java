package com.roiacademy.javaIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamTest {
    public static void main(String[] args) {

        FileOutputStream fileOutputStream = null;


        try (FileInputStream fileInputStream = new FileInputStream("C:\\Users\\albno\\Desktop\\IO ushtrime\\InputFile.txt")) {

            fileOutputStream = new FileOutputStream("C:\\Users\\albno\\Desktop\\IO ushtrime\\OutputFile.txt", false);

            int c;
            while ((c = fileInputStream.read()) != -1) {
                System.out.println(c);
                fileOutputStream.write(c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
