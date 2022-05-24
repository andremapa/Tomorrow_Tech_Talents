package com.andremapa.modulo1_Lógica.aula07;

import java.util.Scanner;

public class QuestThree {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double fishWeightSurplus = 0;
            double fine = 0;
            double amountFishWeightInGrams = 0;

            System.out.print("Enter the amount of fish weight: ");
            double amountFishWightInKilos = sc.nextDouble();
            if (amountFishWightInKilos > 50) {
                amountFishWeightInGrams = amountFishWightInKilos * 1000;
                fishWeightSurplus = amountFishWeightInGrams - 50000;
                fine = fishWeightSurplus * 0.004;
            }

            System.out.println("=========================================");
            System.out.printf("Amount of fish weight: %.1fKg\n", amountFishWightInKilos);
            System.out.printf("Amount of fish weight surplus: %.1fKg\n", fishWeightSurplus / 1000);
            System.out.printf("Fine value: R$%.2f\n", fine);
            System.out.println("=========================================");
        }
}
