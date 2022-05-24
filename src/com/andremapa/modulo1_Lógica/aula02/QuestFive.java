package com.andremapa.modulo1_Lógica.aula02;

import java.util.Scanner;

public class QuestFive {

    public static final double READJUSTMENT_RATE = 0.07;

    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        System.out.print("Enter the value of your salary: ");
        double notReadjustmentSalary = sc.nextDouble();
        double readjustmentSalary = notReadjustmentSalary + (notReadjustmentSalary * READJUSTMENT_RATE);

        System.out.printf("Your salary was R$%.2f but now with the readjustment (7%%) is R$%.2f", notReadjustmentSalary, readjustmentSalary);
    }

}
