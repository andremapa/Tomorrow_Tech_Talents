package com.andremapa.modulo1_Lógica.aula04;

import java.util.Scanner;

public class QuestFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the weight: ");
        double weight = sc.nextDouble();
        System.out.print("Enter the height: ");
        double height = sc.nextDouble();

        double IMC = weight / Math.pow(height, 2);
        if (IMC < 18){
            System.out.print("Under weight");
        } else if (IMC > 18.5 && IMC < 24.9) {
            System.out.print("Normal weight");
        } else if (IMC > 25.0 && IMC< 29.9){
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
