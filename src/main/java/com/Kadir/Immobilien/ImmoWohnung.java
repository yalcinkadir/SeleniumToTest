package com.Kadir.Immobilien;

public class ImmoWohnung extends Immo {
    public ImmoWohnung() {

    }
    public ImmoWohnung(boolean lexus, int roomNumber) {

        this.setLexus(lexus);
        this.setRoomNumber(roomNumber);

    }

    public int calculatePrice() {
        System.out.println("Your choices for flat " + getRoomNumber() + " lexus? " + isLexus());

        int calculatedPrice = 200 + getRoomNumber() * 10;
        if(isLexus()){
            calculatedPrice = calculatedPrice + 50;
        }

        return calculatedPrice;

    }
}
