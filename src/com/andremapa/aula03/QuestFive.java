package com.andremapa.aula03;

import java.util.Scanner;

public class QuestFive {

    public static final int KM_PER_LITERS = 12;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How much time did you spend on the trip (hrs): ");
        int timeHour = sc.nextInt();
        System.out.print("What was the average speed of the trip: ");
        double averageSpeed = sc.nextDouble();

        double distance = timeHour * averageSpeed;
        double litersUsed = distance / KM_PER_LITERS;

        System.out.println("\nThe number of liters used is " +litersUsed);
    }
}
