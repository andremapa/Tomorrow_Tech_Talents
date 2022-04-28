package com.andremapa.aula07;

import java.util.Scanner;

public class QuestFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter with person gender(M - men, W- women): ");
        char personGender = sc.nextLine().toUpperCase().charAt(0);
        System.out.print("Enter the height (h) of a person: ");
        double personHeight = sc.nextDouble();

        switch (personGender){
            case 'M' -> {
                double idealWeight = (72.7 * personHeight) - 58;
                System.out.printf("\nYour ideal weight is %.2f ", idealWeight);
            }
            case 'W' -> {
                double idealWeight = (62.1 * personHeight) - 44.7;
                System.out.printf("\nYour ideal weight is %.2f ", idealWeight);
            }
        }
    }
}
