package com.andremapa.aula02;

import java.util.Scanner;

public class QuestEleven {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the total purchase amount: ");
        double purchaseAmount = sc.nextDouble();

        double installmentValue = purchaseAmount / 5;

        System.out.printf("The installment value is %.2f in 5 times", installmentValue);
    }
}
