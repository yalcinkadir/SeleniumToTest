package com.Kadir.Immobilien;

public class ImmoHaus extends Immo {
    public ImmoHaus(boolean lexus, int roomNumber) {

        this.setLexus(lexus);
        this.setRoomNumber(roomNumber);

    }

    public ImmoHaus() {

    }
    public int calculatePrice() {
        System.out.println("\nYour choices for House with " + getRoomNumber() + " Rooms. \nyou like Lexus: " + isLexus());

        int priceOfObject = 300 + getRoomNumber() * 20;
        if(isLexus()){
            priceOfObject = priceOfObject + 100;
        }
        return priceOfObject;
    }
}
