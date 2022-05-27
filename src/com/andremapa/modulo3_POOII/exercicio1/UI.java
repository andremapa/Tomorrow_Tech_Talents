package com.andremapa.modulo3_POOII.exercicio1;

import java.util.Scanner;

public class UI {

    public static int chooseTheOptionOnMenu(Scanner sc){
        System.out.println("=========CALCULATOR=========");
        System.out.println("| Option 1: Sum            |");
        System.out.println("| Option 2: Subtraction    |");
        System.out.println("| Option 3: Multiplication |");
        System.out.println("| Option 4: Division       |");
        System.out.println("============================");
        System.out.print("Choose a option: ");
        return sc.nextInt();
    }

    public static int getTheQuantityOfNumber(Scanner sc){
        System.out.println("\n=========CALCULATOR=========");
        System.out.print("How many number will be use? ");
        return sc.nextInt();
    }

    public static Double[] popArrayNumbers(Scanner sc){
        Double[] numbers = new Double[getTheQuantityOfNumber(sc)];
        System.out.println("\n=========CALCULATOR=========");
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Number %d: ", (i+1));
            numbers[i] = sc.nextDouble();
        }
        return numbers;
    }
}
