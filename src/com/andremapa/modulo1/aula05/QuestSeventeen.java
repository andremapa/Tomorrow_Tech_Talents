package com.andremapa.modulo1.aula05;

import java.util.Scanner;

public class QuestSeventeen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] salary = new double[2];
        salary[0] = 0;
        double biggestSalary = 0;
        int cont = 0;
        double averageSalary = 0;
        int averageChildren = 0;
        double percentCont = 0;

        while (true){
            System.out.print("Enter with a salary: ");
            salary[1] = sc.nextDouble();

            if (salary[1] < 0){
                break;
            }
            averageSalary += salary[1];

            if (salary[1] < 150){
                percentCont++;
            }

            if (salary[1] > biggestSalary){
                biggestSalary = salary[1];
            }
            salary[0] = salary[1];

            System.out.print("Enter number of children: ");
            int numberChildren = sc.nextInt();
            averageChildren += numberChildren;
            cont++;
        }

        System.out.println("==============================RESUME==============================");
        System.out.printf("Average salary of the population: %.2f\n", averageSalary / cont);
        System.out.printf("Average number of children: %d\n", averageChildren / cont);
        System.out.printf("Higher salary of the inhabitants: %.2f\n", biggestSalary);
        System.out.printf("Percentage of people earning less than R$150.00: %.2f%%\n", ((percentCont*100)/cont));
        System.out.println("==================================================================");

    }
}
