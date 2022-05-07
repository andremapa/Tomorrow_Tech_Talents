package com.andremapa.modulo1.aula06;

import java.util.Scanner;

public class QuestNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int option;
        do {
            System.out.println("Options menu:");
            System.out.println("    1. Arithmetic mean");
            System.out.println("    2. Weighted average");

            System.out.print("Select a option: ");
            option = sc.nextInt();
        } while (option == 0);

        switch (option){
            case 1 -> {
                System.out.print("Insert to first number: ");
                double firstNumber = sc.nextDouble();
                System.out.print("Insert to second number: ");
                double secondNumber = sc.nextDouble();

                System.out.println("The arithmetic mean is " + (firstNumber + secondNumber) / 2);
            }
            case 2 -> {
                System.out.print("Insert to first number: ");
                double firstNumber = sc.nextDouble();
                System.out.print("Insert to first number weight: ");
                double firstNumberWeight = sc.nextDouble();

                System.out.print("Insert to second number: ");
                double secondNumber = sc.nextDouble();
                System.out.print("Insert to second number weight: ");
                double secondNumberWeight = sc.nextDouble();

                System.out.print("Insert to third number: ");
                double thirdNumber = sc.nextDouble();
                System.out.print("Insert to third number weight: ");
                double thirdNumberWeight = sc.nextDouble();

                double weightedAverage = (firstNumber * firstNumberWeight) +(secondNumber * secondNumberWeight)
                        +(thirdNumber * thirdNumberWeight) / (firstNumber + secondNumber + thirdNumber);

                System.out.println("The weighted average is " + weightedAverage);
            }
            default -> System.out.println("Error! Invalid option!");
        }
    }
}
