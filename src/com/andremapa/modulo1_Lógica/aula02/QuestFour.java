package com.andremapa.modulo1_Lógica.aula02;

import java.util.Scanner;

public class QuestFour {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter with your age in years: ");
        int personAge = sc.nextInt();

        int quantityOfDay = personAge * 365;

        System.out.printf("\nThe quantity of day you lived is %d", quantityOfDay);
    }
}
