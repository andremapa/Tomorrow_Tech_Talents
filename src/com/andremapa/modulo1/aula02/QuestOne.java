package com.andremapa.modulo1.aula02;

import java.util.Scanner;

public class QuestOne {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter with a temperature in Celsius: ");
        double celsiusTemperature = sc.nextDouble();

        double kelvinTemperature = celsiusTemperature + 273.15;
        double fahrenheitTemperature = (celsiusTemperature * 1.8) + 32;
        double rankineTemperature = (celsiusTemperature + 1.8) + 32 + 459.67;
        double reaumurTemperature = celsiusTemperature * 0.8;

        System.out.printf("Kelvin: %.2f\nFahrenheit: %.2f\nRankine: %.2f\nReaumur: %.2f\n", kelvinTemperature, fahrenheitTemperature, rankineTemperature, reaumurTemperature);
    }
}
