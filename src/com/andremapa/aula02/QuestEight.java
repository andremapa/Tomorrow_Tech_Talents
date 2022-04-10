package com.andremapa.aula02;

import java.util.Scanner;

public class QuestEight {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the distance traveled in kilometer: ");
        double distanceTraveled = sc.nextDouble();
        System.out.print("Enter total gasoline consumption in liters: ");
        double gasolineConsumption = sc.nextDouble();

        double averageConsumption = distanceTraveled / gasolineConsumption;

        System.out.printf("The average of gasoline consumed is %.2f", averageConsumption);
    }
}
