package com.andremapa.aula02;

import java.util.Scanner;

public class QuestTwelve {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the purchase price of the product: ");
        double purchasePrice = sc.nextDouble();
        System.out.print("Report the percentage (%) increase: ");
        double percentageIncrease = sc.nextDouble();

        double saleValue = purchasePrice + (purchasePrice * (percentageIncrease/100));

        System.out.printf("The sale value is %.2f", saleValue);

    }
}
