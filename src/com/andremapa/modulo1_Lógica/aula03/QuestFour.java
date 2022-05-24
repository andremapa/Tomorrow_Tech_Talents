package com.andremapa.modulo1_Lógica.aula03;

import java.util.Scanner;

public class QuestFour {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] beachNames = new String[5];
        double[] beachDistance = new double[5];

        for (int i = 0; i < beachNames.length; i++) {
            System.out.printf("Enter the beach name %d: ", (i+1));
            beachNames[i] = sc.nextLine();
            System.out.printf("Enter the beach distance %d: ",(i+1));
            beachDistance[i] = sc.nextDouble();
            sc.nextLine();
        }

        String bigBeachDistanceName = "";
        double bigBeachDistance = 0;
        double sum = 0;
        for (int i = 0; i < beachNames.length; i++) {
            sum += beachDistance[i];

            if (beachDistance[i] < 10){
                System.out.println("The beach " + beachNames[i] + " is less than 10");
            } else if (beachDistance[i] > 15){
                System.out.println("The beach " + beachNames[i] + " it's been more than 15");
            }

            if (beachDistance[i] > bigBeachDistance){
                bigBeachDistance = beachDistance[i];
                bigBeachDistanceName = beachNames[i];
            }
        }

        double average = sum / beachNames.length;

        System.out.printf("The furthest beach is %s\nThe average is %.2f", bigBeachDistanceName, average);
    }
}
