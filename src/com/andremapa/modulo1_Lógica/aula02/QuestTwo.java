package com.andremapa.modulo1_Lógica.aula02;

import java.util.Scanner;

public class QuestTwo {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);

        System.out.print("Enter with a mass (Kg): ");
        double mass = sc.nextDouble();
        System.out.print("Enter with a height (m): ");
        double height = sc.nextDouble();
        System.out.print("Enter with a time (s): ");
        double time = sc.nextDouble();

        double horsePower = (mass * height / time) / 745.699;

        System.out.printf("\nThe horse power you need to get up a mass %.2fKg is %.5f hp", mass, horsePower);
    }
}
