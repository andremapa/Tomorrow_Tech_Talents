package com.andremapa.modulo1.aula02;

import java.util.Scanner;

public class QuestEleven {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the total purchase amount: ");
        double purchaseAmount = sc.nextDouble();

        double installmentValue = purchaseAmount / 5;

        System.out.printf("\nThe installment value is %.5f in 5 times\n", installmentValue);
    }
}
