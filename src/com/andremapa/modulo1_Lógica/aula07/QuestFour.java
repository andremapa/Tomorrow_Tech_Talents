package com.andremapa.modulo1_Lógica.aula07;

import java.util.Scanner;

public class QuestFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] cityCodes = new String[5];
        Double[][] cityCarsNumbers = new Double[5][2];
        double amountVehicle = 0;
        double amountVehicleLess2000 = 0;
        double amountCityWithLess2000 = 0;
        Double[] accidentRates = new Double[5];

        for (int i = 0; i < cityCodes.length; i++) {
            System.out.printf("\nEnter %d° city code: ", (i + 1));
            cityCodes[i] = sc.nextLine();
            for (int j = 0; j < cityCarsNumbers[i].length; j++) {
                if (j == 0) {
                    System.out.print("Enter number of passenger vehicles (in 2021): ");
                    cityCarsNumbers[i][j] = sc.nextDouble();
                    amountVehicle += cityCarsNumbers[i][j];
                } else {
                    System.out.print("Enter number of traffic accidents with victims (in 2021): ");
                    cityCarsNumbers[i][j] = sc.nextDouble();
                    if (cityCarsNumbers[i][0] < 2000){
                        amountVehicleLess2000 = cityCarsNumbers[i][j];
                        amountCityWithLess2000++;
                    }
                }
                sc.nextLine();
            }
            accidentRates[i] = (cityCarsNumbers[i][1] / cityCarsNumbers[i][0]) * 100;
        }

        double bigRate = accidentRates[0];
        String bigRateCityCode = null;
        for (int i = 0; i < accidentRates.length; i++) {
            if (accidentRates[i] > bigRate){
                bigRate = accidentRates[i];
                bigRateCityCode = cityCodes[i];
            }
        }

        double smallRate = accidentRates[0];
        String smallRateCityCode = null;
        for (int i = 0; i < accidentRates.length; i++) {
            if (accidentRates[i] < smallRate){
                smallRate = accidentRates[i];
                smallRateCityCode = cityCodes[i];
            }
        }

        System.out.printf("\nThe biggest rate of traffic accidents %.1f%% belongs to code city %s\n", bigRate, bigRateCityCode);
        System.out.printf("The smallest rate of traffic accidents %.1f%% belongs to code city %s\n", smallRate, smallRateCityCode);

        System.out.printf("\nThe average number of vehicles in the five cities together is %.2f\n", amountVehicle / 5);
        System.out.printf("The average number of traffic accidents in cities with less than 2,000 passenger vehicles is %.2f\n", amountVehicleLess2000 / amountCityWithLess2000);
    }
}
