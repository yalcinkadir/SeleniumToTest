package com.Kadir.Immobilien;

public class ImmoWohnung extends Immo {

    public void calculatePrice() {
        System.out.println("Your choices for flat " + getRoomNumber() + " lexus? " + isLexus());

        int calculatedPrice = 200 + getRoomNumber() * 10;
        if(isLexus()){
            calculatedPrice = calculatedPrice + 50;
        }
        System.out.println("Your Flat Price is " + calculatedPrice);

    }
}
