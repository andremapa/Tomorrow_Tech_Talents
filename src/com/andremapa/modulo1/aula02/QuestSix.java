package com.andremapa.modulo1.aula02;

import java.util.Scanner;

public class QuestSix {

    public static final double CONVERSION_VALUE_TO_DOLLAR = 4.70;
    public static final double CONVERSION_VALUE_TO_POUND = 5.11;
    public static final double CONVERSION_VALUE_TO_EURO = 6.12;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter with a value in R$: ");
        double moneyReal = sc.nextDouble();

        double realToDollar = moneyReal / CONVERSION_VALUE_TO_DOLLAR;
        double realToPound = moneyReal / CONVERSION_VALUE_TO_POUND;
        double realToEuro = moneyReal / CONVERSION_VALUE_TO_EURO;

        System.out.printf("The value R$%.2f in dollar, pound and euro is:\nDollar: U$%.2f\nPound: $%.2f lbs\nEuro: €%.2f", moneyReal, realToDollar, realToPound, realToEuro);
    }
}
