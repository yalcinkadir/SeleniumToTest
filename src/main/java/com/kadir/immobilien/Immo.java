package com.kadir.immobilien;

public class Immo {

    String type;
    boolean lexus;
    int roomNumber;

    public Immo(String type) {
        this.setType(type);
    }

    public Immo(boolean lexus, int roomNumber, String type) {

        this.setType(type);
        this.setLexus(lexus);
        this.setRoomNumber(roomNumber);
    }

    public int calculatePrice() {
        System.out.println("\nYour choices for " + getType() + " with " + getRoomNumber() + " Rooms. \nyou like Lexus: " + isLexus());
        int priceOfObject = 0;

        if (type.equals("Wohnung")) {
            priceOfObject = 300 + getRoomNumber() * 10;
            if (isLexus()) {
                priceOfObject = priceOfObject + 100;
            }
        } else {
            priceOfObject = 200 + getRoomNumber() * 10;
            if (isLexus()) {
                priceOfObject = priceOfObject + 50;
            }
        }
        return priceOfObject;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

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
}