package com.Kadir.Immobilien;

import java.util.Scanner;

public class ImmoMain {

    public static void main(String[] args) {

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
        System.out.print("How many Rooms?      : \n 1 1+1" + "\n 2 2+1 ");
        int toRoomsId = chooseToRooms.nextInt();

        immo.setRoomNumber(toRoomsId);

        immo.calculatePrice();


    }

}

