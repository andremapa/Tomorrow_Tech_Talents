package com.andremapa.modulo3_POOII.exercicio1;

import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        switch (chooseTheOptionOnMenu(sc)){
            case 1 -> {
                Sum sum = new Sum();
                System.out.println("The total is: " + sum.calculate(popArrayNumbers(sc)));
            }
            case 2 -> {
                Subtraction sub = new Subtraction();
                System.out.println("The total is: " + sub.calculate(popArrayNumbers(sc)));
            }
            case 3 -> {
                Multiplication mul = new Multiplication();
                System.out.println("The total is: " + mul.calculate(popArrayNumbers(sc)));
            }
            case 4 -> {
                Division div = new Division();
                System.out.println("The total is: " + div.calculate(popArrayNumbers(sc)));
            }
        }
    }

    private static int chooseTheOptionOnMenu(Scanner sc){
        System.out.println("=========CALCULATOR=========");
        System.out.println("| Option 1: Sum            |");
        System.out.println("| Option 2: Subtraction    |");
        System.out.println("| Option 3: Multiplication |");
        System.out.println("| Option 4: Division       |");
        System.out.println("============================");
        System.out.print("Choose a option: ");
        return sc.nextInt();
    }

    private static int getTheQuantityOfNumber(Scanner sc){
        System.out.println("\n=========CALCULATOR=========");
        System.out.print("How many number will be use? ");
        return sc.nextInt();
    }

    private static Double[] popArrayNumbers(Scanner sc){
        Double[] numbers = new Double[getTheQuantityOfNumber(sc)];
        System.out.println("\n=========CALCULATOR=========");
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Number %d: ", (i+1));
            numbers[i] = sc.nextDouble();
        }
        return numbers;
    }
}
