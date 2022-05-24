package com.andremapa.modulo1_Lógica.aula04;

import java.util.Scanner;

public class QuestEight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] positiveArray = new int[10];
        int sum = 0;
        for (int i = 0; i < positiveArray.length; i++) {
                System.out.print("Enter with ten positive number: ");
                positiveArray[i] = sc.nextInt();
                sum += positiveArray[i];
                if (positiveArray[i] < 0) {
                    System.out.print("Please, enter with a positive number: ");
                    positiveArray[i] = sc.nextInt();
                    sum += positiveArray[i];
                }
        }

        double average = (double) sum/ positiveArray.length;
        int higherNumber = positiveArray[0];
        int smallestNumber = positiveArray[0];
        for (int i = 1; i < positiveArray.length; i++) {
            if (higherNumber < positiveArray[i]) {
                higherNumber = positiveArray[i];
            }

            if (smallestNumber > positiveArray[i]) {
                smallestNumber = positiveArray[i];
            }
        }

        System.out.printf("\nThe average is %.2f\nThe Higher number is %d\nThe Smallest number is %d\n",
                average, higherNumber, smallestNumber);
    }
}
