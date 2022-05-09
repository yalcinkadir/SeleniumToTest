package com.kadir.arrayListTest;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPrint {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("Kadir", "Gülsün", "Yusuf Kerem"));

        //names is the name for "for" loop
        for (String getNamesInArrayList : arrayList) {
            System.out.println(getNamesInArrayList);
            System.out.println(getNamesInArrayList.toUpperCase());
            System.out.println(getNamesInArrayList.toLowerCase());
        }
    }
}
