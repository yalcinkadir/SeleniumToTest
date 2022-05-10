package com.kadir.testInterfaces;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Table implements Displayable, Summarizable {

    Scanner diskFile;
    ArrayList<String> lines = new ArrayList<>();
    public Table(String fileName) {

        File file = new File(fileName);
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            diskFile = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (diskFile.hasNextLine()) {
            lines.add(diskFile.nextLine());
        }
    }
    @Override
    public void display() {
        for (String line : lines) {
            System.out.println(line);
        }
    }
    @Override
    public String summarize() {
        if(lines.isEmpty()) {
            return null;
        }
        return lines.get(0);
    }

}
