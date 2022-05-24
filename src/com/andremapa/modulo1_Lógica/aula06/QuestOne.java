package com.andremapa.modulo1_Lógica.aula06;

import java.util.Scanner;

public class QuestOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("The number of years he smokes: ");
        int numberYearsSmoke = sc.nextInt();

        System.out.print("The number of cigarettes smoked per day: ");
        int cigarettesPorDay = sc.nextInt();

        System.out.print("Price of a wallet with 20 cigarettes: ");
        double priceCigarettes = sc.nextDouble();

        int quantityDaysSmoke = numberYearsSmoke * 365;
        int quantityPacksPorDay = cigarettesPorDay / 20;
        double amountSpent = (quantityDaysSmoke * quantityPacksPorDay) * priceCigarettes ;

        System.out.println("The amount of money spent " + amountSpent);
    }
}
