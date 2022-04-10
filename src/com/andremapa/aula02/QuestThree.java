package com.andremapa.aula02;

import java.util.Scanner;

public class QuestThree {

    public static final double INTEREST_RATE = 0.02;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount to be borrowed: ");
        double amountBorrow = sc.nextDouble();

        System.out.print("Enter how many months you want to pay: ");
        int timesInMonths = sc.nextInt();

        double totalAmount = amountBorrow * Math.pow(1 + INTEREST_RATE, timesInMonths);

        System.out.printf("\nThe total amount you'll pay is R$%.2f in %d months", totalAmount, timesInMonths);
    }
}
