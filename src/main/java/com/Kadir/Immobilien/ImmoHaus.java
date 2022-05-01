package com.Kadir.Immobilien;

public class ImmoHaus extends Immo {
    public ImmoHaus(boolean lexus, int roomNumber) {

        this.setLexus(lexus);
        this.setRoomNumber(roomNumber);

    }

    public ImmoHaus() {

    }
    public int calculatePrice() {
        System.out.println("Your choices for house " + getRoomNumber() + " lexus? " + isLexus());

        int calculatedPrice = 300 + getRoomNumber() * 20;
        if(isLexus()){
            calculatedPrice = calculatedPrice + 100;
        }
        return calculatedPrice;
    }
}
