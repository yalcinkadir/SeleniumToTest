package com.kadir.temperature;


import static java.lang.System.out;

public class TemperatureNice extends Temperature {

    private boolean sunnyDay;

    public TemperatureNice() {
        super();
    }

    public TemperatureNice(double number) {
        super(number);

        if (getNumber() > 15) {
            setSunnyDay(true);
        }
        out.println("created super(number)");
    }

    public TemperatureNice(TempScale scale) {
        super(scale);
        out.println("created super scale");
    }

    public TemperatureNice(double number, TempScale scale) {
        super(number, scale);
        out.println("created super number scale");
    }

    public void display() {
        out.printf("%5.2f degrees %s\n", getNumber(), getScale());
    }

    public boolean isSunnyDay() {
        return sunnyDay;
    }

    public void setSunnyDay(boolean sunnyDay) {
        this.sunnyDay = sunnyDay;
    }
}

