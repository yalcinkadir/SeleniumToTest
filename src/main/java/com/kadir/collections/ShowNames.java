package com.kadir.collections;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class ShowNames {

    public static void main(String[] args) {
        //HashMap always gets 2 types
        HashMap<Integer, String> hashMap = new HashMap<>();
        Scanner scanner = new Scanner(in);

        hashMap.put(41, "Kirsehir"); // key value
        hashMap.put(71, "Kirikkale");
        hashMap.put(6, "Ankara");

        ArrayList<String> people = new ArrayList<>();
        Scanner diskScanner = null;
        try {
            diskScanner = new Scanner(new File("names.txt"));
        } catch (Exception e) {
            out.println("File not found!");
            throw new MyFileNotFoundException();
        } finally {
            out.println("Always called");
        }

        while (diskScanner.hasNext()) {
            people.add(diskScanner.nextLine());
        }
        people.remove(0);
        people.add("Jim Newton");
        for (String name : people) {
            out.println(name);
        }
        diskScanner.close();

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(41);
        numbers.add(71);
        numbers.add(6);

        for (Integer x : numbers) {
            out.println(x + ", city name " + hashMap.get(x));
        }

        for (Integer key : hashMap.keySet()) {
            out.println(key + ", city name " + hashMap.get(key));
        }

        for (String value : hashMap.values()) {
            out.println(value);
        }

        Iterator<String> iterator = people.iterator();
        while (iterator.hasNext()) {
            out.println(iterator.next());
        }
    }
}
