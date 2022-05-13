package com.kadir.inputStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

public class inputStream {

    public static void main(String[] args) throws IOException {

        InputStream in = System.in;
        BufferedWriter bw = new BufferedWriter(new FileWriter("TestFileCreateFile2.txt"));

        int letter;
        while ((letter = in.read()) != -1) {
            bw.write((char) letter);
            bw.flush();
        }

        //ToDo
        //close writing if ...
        if (!(bw == null)) {
            bw.close();
        }
    }
}
