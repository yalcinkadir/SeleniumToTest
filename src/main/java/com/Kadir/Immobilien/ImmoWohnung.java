package com.Kadir.Immobilien;

public class ImmoWohnung extends Immo {
    public ImmoWohnung() {

    }
    public ImmoWohnung(boolean lexus, int roomNumber) {

        this.setLexus(lexus);
        this.setRoomNumber(roomNumber);
    }

    public int calculatePrice() {
        System.out.println("Your choices for flat with " + getRoomNumber() + " Rooms. \nyou like Lexus: " + isLexus());

        int priceOfObject = 200 + getRoomNumber() * 10;
        if(isLexus()){
            priceOfObject = priceOfObject + 50;
        }

        return priceOfObject;

    }
}
