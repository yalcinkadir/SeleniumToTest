package com.Kadir.Immobilien;

public class Immo {

    boolean lexus;
    int roomNumber;

    public boolean isLexus() {
        return lexus;
    }

    public void setLexus(boolean lexus) {
        this.lexus = lexus;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
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
