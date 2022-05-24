package com.andremapa.modulo1_Lógica.aula02;

import java.util.Scanner;

public class QuestSeven {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter with a number: ");
        double numberOne = sc.nextDouble();
        System.out.print("Enter with another number: ");
        double numberTwo = sc.nextDouble();

        double sum = numberOne + numberTwo;
        double sub = numberOne - numberTwo;
        double mul = numberOne * numberTwo;
        double div = numberOne / numberTwo;

        System.out.printf("\nSum: %.2f\nSub: %.2f\nMul: %.2f\nDiv: %.2f\n", sum, sub, mul, div);

    }
}
