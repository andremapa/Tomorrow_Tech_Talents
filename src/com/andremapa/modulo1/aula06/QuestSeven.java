package com.andremapa.modulo1.aula06;

import java.util.Scanner;

public class QuestSeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double amountInCash = 0;
        double amountOnTerm = 0;
        double amountPurchasesMade = 0;
        for (int i = 0; i < 15; i++) {
            System.out.print("Enter the transaction code (V - in Cash ou P - on term): ");
            char transactionCode = sc.nextLine().toUpperCase().charAt(0);
            System.out.print("Enter the transaction value: ");
            double transactionValue = sc.nextDouble();

            switch (transactionCode) {
                case 'V' -> {
                    amountInCash += transactionValue;
                    amountPurchasesMade += transactionValue;
                }
                case 'P' -> {
                    amountOnTerm += transactionValue;
                    amountPurchasesMade += transactionValue;
                }
            }
        }
        System.out.println("The total amount of cash purchases is " + amountInCash);
        System.out.println("The total amount on term purchases is " + amountOnTerm);
        System.out.println("The total value of purchases made is " + amountPurchasesMade);
        System.out.println("The value of the first installment of installment purchases is " + amountOnTerm / 3);
    }
}
