package com.andremapa.modulo1_Lógica.aula05;

import java.util.Scanner;

public class QuestTwelve {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter salary amount: ");
        double fixedSalary = sc.nextDouble();

        System.out.print("Enter the sales amount: ");
        double salesValue = sc.nextDouble();

        double percentage = verifyThePercentage(salesValue);

        System.out.println("The final salary is " + (fixedSalary + (salesValue * percentage)));
    }

    public static double verifyThePercentage(double salesValue){
        if (salesValue <= 1500){
            return 0.03;
        } else {
            return  0.05;
        }
    }
}
