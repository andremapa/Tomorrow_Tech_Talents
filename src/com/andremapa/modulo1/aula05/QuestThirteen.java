package com.andremapa.modulo1.aula05;

import java.util.Scanner;

public class QuestThirteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double discount;
        double amount;

        System.out.print("Enter the number of liters sold: ");
        double litersSold = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter type of fuel (A-alcohol, G-gasoline): ");
        char fuelType = sc.nextLine().toUpperCase().charAt(0);

        switch (fuelType) {
            case 'A' -> {
                if (litersSold <= 20) {
                    discount = 0.03;
                } else {
                    discount = 0.05;
                }
                amount = litersSold * (5.20 - (5.20 * discount));
                System.out.printf("The amount to be paid by the customer R$%.2f", amount);
            }
            case 'G' -> {
                if (litersSold <= 20) {
                    discount = 0.04;
                } else {
                    discount = 0.06;
                }
                amount = litersSold * (7.59 - (7.59 * discount));
                System.out.printf("The amount to be paid by the customer R$%.2f", amount);
            }
            default -> {
                System.out.print("Enter type of fuel (A-alcohol, G-gasoline): ");
                fuelType = sc.nextLine().charAt(0);
            }
        }


    }
}
