package com.Kadir.Immobilien;

import java.util.ArrayList;
import java.util.Scanner;

public class ImmoMain {

    static Immo immo1 = new ImmoWohnung(false, 1);
    static Immo immo2 = new ImmoWohnung(true, 2);
    static Immo immo3 = new ImmoHaus(true, 5);
    static Immo immo4 = new ImmoHaus(true, 6);
    static Immo immo5 = new ImmoWohnung(true, 5);
    static ArrayList<Immo> searchData = new ArrayList<Immo>();

    public static void main(String[] args) {

        searchData.add(immo1);
        searchData.add(immo2);
        searchData.add(immo3);
        searchData.add(immo4);
        searchData.add(immo5);

        ImmoMain immoMain = new ImmoMain();
        immoMain.showProcess();

    }

    public void showProcess() {

        Scanner chooseToBuy = new Scanner(System.in);
        System.out.print("1 Flat" + "\n2 House \nWhat are you looking for?      :");
        int toBuyId = chooseToBuy.nextInt();

        switch (toBuyId) {
            case 1:
                Immo immoWohnung = new ImmoWohnung();
                lexus(immoWohnung);
                showProcess();
                break;
            case 2:
                Immo immoHaus = new ImmoHaus();
                lexus(immoHaus);
                showProcess();
                break;
            default:
                System.out.println("your given option doesn't exist \nGive a number: ");
                showProcess();
                break;
        }
    }

    public void lexus(Immo immo) {
        Scanner chooseLexus = new Scanner(System.in);
        System.out.print("What are you looking for?      : \n 1 Lexus" + "\n 2 No Lexus ");
        boolean toBuyLexus = chooseLexus.nextBoolean();

        immo.setLexus(toBuyLexus);

        rooms(immo);
    }

    private void rooms(Immo immo) {
        Scanner chooseToRooms = new Scanner(System.in);
        System.out.print("How many Rooms?      : ");
        int toRoomsId = chooseToRooms.nextInt();

        immo.setRoomNumber(toRoomsId);

        search(immo);

    }

    public void search(Immo immo){
        for(Immo data : searchData) {
            if(data.isLexus() == immo.isLexus() && data.getRoomNumber() == immo.getRoomNumber()) {
                System.out.println("your search is found. objects price is " + data.calculatePrice());

            }
        }
    }

}

