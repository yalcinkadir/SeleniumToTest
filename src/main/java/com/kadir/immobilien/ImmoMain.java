package com.kadir.immobilien;

import java.util.ArrayList;
import java.util.Scanner;

public class ImmoMain {
    static ArrayList<Immo> searchData = new ArrayList<Immo>();

    public static void main(String[] args) {

        searchData.add(new Immo(false, 1, "Wohnung"));
        searchData.add(new Immo(true, 2, "Wohnung"));
        searchData.add(new Immo(true, 5, "Haus"));
        searchData.add(new Immo(true, 6, "Haus"));
        searchData.add(new Immo(true, 5, "Wohnung"));

        ImmoMain immoMain = new ImmoMain();
        immoMain.showProcess();
    }

    public void showProcess() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("1 Flat" + "\n2 House \nWhat are you looking for?:     ");
        int scannerFlatHouse = scanner.nextInt();

        switch (scannerFlatHouse) {
            case 1:
                Immo immoWohnung = new Immo("Wohnung");
                lexus(immoWohnung);
                showProcess();
                break;
            case 2:
                Immo immoHaus = new Immo("Haus");
                lexus(immoHaus);
                showProcess();
                break;
            default:
                System.out.println("your given option doesn't exist \nGive a number:        ");
                showProcess();
                break;
        }
    }

    public void lexus(Immo immo) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nfor Lexus true" + "\nfor No Lexus false  \nDo you want a lexus one?:      ");
        boolean scannerLexus = scanner.nextBoolean();
        String resText = scannerLexus ? " lexus search ok " : " lexus search not ok";
        System.out.println(resText);
        immo.setLexus(scannerLexus);

        rooms(immo);
    }

    private void rooms(Immo immo) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nHow many Rooms?:                ");
        int scannerRooms = scanner.nextInt();
        immo.setRoomNumber(scannerRooms);

        search(immo);
    }

    public void search(Immo immo) {
        for (Immo data : searchData) {
            if (immo.getType().equals(data.getType()) && data.isLexus() == immo.isLexus() && data.getRoomNumber() == immo.getRoomNumber()) {
                int priceOfObject = data.calculatePrice();

                System.out.println("your search is found. objects price is " + priceOfObject + "\n");
            }
        }
    }
}

