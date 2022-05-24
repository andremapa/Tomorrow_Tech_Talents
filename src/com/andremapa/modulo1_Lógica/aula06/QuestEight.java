package com.andremapa.modulo1_Lógica.aula06;

import java.util.Scanner;

public class QuestEight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int peopleOver90 = 0;
        double average = 0;
        for (int i = 0; i < 7; i++) {
            System.out.println("\nPerson " + (i+1));
            System.out.print("Enter person's age: ");
            int ages = sc.nextInt();
            average += ages;
            System.out.print("Enter person's weight: ");
            double weights = sc.nextDouble();
            if (weights < 90) {
                peopleOver90++;
            }
        }
        System.out.println("The number of people over 90 kg " + peopleOver90);
        System.out.printf("The average age of the seven people %.2f ", average / 7);
    }
}
