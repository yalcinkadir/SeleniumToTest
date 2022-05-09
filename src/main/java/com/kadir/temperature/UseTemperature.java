package com.kadir.temperature;

import org.springframework.http.converter.json.GsonBuilderUtils;

import java.time.LocalTime;

import static java.lang.System.out;

public class UseTemperature {

    static LocalTime currentTime = LocalTime.now();
    static LocalTime time = LocalTime.of(12, 40);


    public static void main(String[] args) {

        out.println(currentTime);
        out.println(time);

        UseTemperature useTemperature = new UseTemperature();
        useTemperature.message();

        final String format = "%5.2f degrees %s calculated for %s\n";

        Temperature temp = new Temperature();
        temp.setNumber(70.0);
        temp.setScale(TempScale.FAHRENHEIT);

        out.printf(format, temp.getNumber(), temp.getScale(), "child");

        out.println(temp.getNumber() + " degrees " + temp.getScale() + " calculated for child" );

        temp = new Temperature(32.0);

        out.printf(format, temp.getNumber(), temp.getScale(), "adult");

        temp = new Temperature(TempScale.CELSIUS);

        out.printf(format, temp.getNumber(), temp.getScale(), "adult");

        temp = new Temperature(2.73, TempScale.KELVIN);

        out.printf(format, temp.getNumber(), temp.getScale(), "adult");

        TempScale scale = TempScale.CELSIUS;
        char letter;
        switch (scale) {
            case CELSIUS:
                letter = 'C';
                break;
            case KELVIN:
                letter = 'K';
                break;
            case RANKINE:
            case RÉAUMUR:
            case RØMER:
                letter = 'R';
                break;
            default:
                letter = 'X';
                break; }
        out.println(letter);
    }


    public void message(){

        final String message = "dear Student %s lesson %s will begin very soon\n";
        out.printf(message, "Yusuf Kerem", "emekleme\n");

    }



}
