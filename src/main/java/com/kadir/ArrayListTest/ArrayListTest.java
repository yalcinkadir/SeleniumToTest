package com.kadir.ArrayListTest;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest {


    public static void main(String[] args) throws InterruptedException {

        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("Kadir","Gülsün","Yusuf Kerem"));

        for (String names : arrayList) {
            System.out.println(names);
            System.out.println(names.toUpperCase());
            System.out.println(names.toLowerCase());
        }

    }

}
