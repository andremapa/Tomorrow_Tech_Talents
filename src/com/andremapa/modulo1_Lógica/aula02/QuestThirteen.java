package com.andremapa.modulo1_Lógica.aula02;

import java.util.Scanner;

public class QuestThirteen {

    public static final double DISTRIBUTOR_PERCENTAGE = 0.28;
    public static final double TAX_PERCENTAGE = 0.45;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the car's factory value: ");
        double carFactoryValue = sc.nextDouble();

        double carFinalValue = carFactoryValue + (carFactoryValue * DISTRIBUTOR_PERCENTAGE) + (carFactoryValue * TAX_PERCENTAGE);

        System.out.printf("The final value is %.2f", carFinalValue);
    }
}
