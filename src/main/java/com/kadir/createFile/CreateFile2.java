package com.kadir.createFile;

import java.io.*;
import java.util.Scanner;

public class CreateFile2 {

    public static void main(String[] args) throws IOException {

        // create a file
        File file = new File("TestFileCreateFile2.txt");
        System.out.println(file.getName() + " " + file.isFile());

        // if file doesn't exist, create a file here
        if (!file.exists()) {
            file.createNewFile();
            System.out.println("File created: " + file.getName());
        }

        // Writing to file
        FileWriter fileWriter = new FileWriter(file, true);
        fileWriter.write("This is a Test Line to write in to file\n"); // write this to file
        fileWriter.flush(); // save this
        fileWriter.close(); // close FileWriter

        // Reading from file
        Scanner scanner = new Scanner(file);

        // printing all in file
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }
    }
}

