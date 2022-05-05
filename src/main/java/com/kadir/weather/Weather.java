package com.kadir.weather;

public class Weather {

    int[] day = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
    int[] temp = new int[]{12, 14, 9, 12, 15, 16, 15, 15, 11, 8, 13, 13, 15, 12};

    public static void main(String[] args) {
        Weather weather = new Weather();

        int sum = 0;
        int min = weather.temp[0];
        int max = 0;
        int maxChange = 0;

        for (int i = 0; i < weather.temp.length; i++) {
            if (i != 0) {
                int arrayChange = weather.temp[i] - weather.temp[i - 1];
                if (arrayChange > maxChange) {
                    maxChange = arrayChange;
                }
            }

            sum = sum + weather.temp[i];
            if (weather.temp[i] < min)
                min = weather.temp[i];

            if (weather.temp[i] > max)
                max = weather.temp[i];

            System.out.println("Day:\t" + weather.day[i] + " Temperature:\t" + weather.temp[i]);
        }
        System.out.println("Average Temperature in next 2 weeks:\t" + sum / weather.temp.length);
        System.out.println("Min. Temperature:\t" + min);
        System.out.println("Max. Temperature:\t" + max);
        System.out.println("Max. Temperature Change:\t" + maxChange);

    }
}
