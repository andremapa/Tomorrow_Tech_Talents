package com.andremapa.modulo1.aula05;

import java.util.Scanner;

public class QuestTwo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[][] numbers = new double[2][5];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print("Enter with a number: ");
                numbers[i][j] = sc.nextDouble();
            }
        }

        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
