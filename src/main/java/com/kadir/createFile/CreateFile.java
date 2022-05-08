package com.kadir.createFile;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class CreateFile {
    public static void main(String[] args) throws IOException {

        File file = new File("TestFile3.txt");
        boolean createdFile = file.createNewFile();

        System.out.println(createdFile);

        if(createdFile){
            System.out.println("file created! ");
        } else {
            System.out.println("file already exists ");
        }

        if(file.exists()){
            System.out.println(file.getName() + " exists!");
        }

        File directoryFileList = new File("/Users/kadiryalcin/");
        if(directoryFileList.isDirectory()) {
            File[] listFilename = directoryFileList.listFiles();
            System.out.println(listFilename);

            //Foreach founds your file
            File searchFile = Arrays.stream(listFilename).filter(foreachFileName -> foreachFileName.getName().equals("Desktop")).findFirst().get();
            System.out.println("Foreach found your file " + searchFile);
            System.out.println();

            // For founds your file
            File forFoundsFile = null;
            // Get the names of the files by using the .getName() method
            for (int i = 0; i < listFilename.length; i++) {
                System.out.println(listFilename[i].getName());

                if(listFilename[i].getName().equals("Desktop")){
                    forFoundsFile = listFilename[i];
                    System.out.println("\ni get your file " + listFilename[i].getName());
                    break;
                }
            }
            System.out.println("For found your file " + forFoundsFile);
        }
    }
}
