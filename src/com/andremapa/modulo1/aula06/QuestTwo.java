package com.andremapa.modulo1.aula06;

import java.util.Scanner;

public class QuestTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your hourly rate: ");
        double hourValue = sc.nextDouble();
        System.out.print("The number of hours worked in the month: ");
        double hoursWorked = sc.nextDouble();

        double grossSalary = hourValue * hoursWorked;
        double fgts = grossSalary * 0.11;
        double syndicate = grossSalary * 0.03;

        if (grossSalary <= 900){
            System.out.println("\n=============Payroll=============");
            System.out.printf("FGTS: %.2f\n" , fgts);
            System.out.printf("Syndicate: %.2f\n", syndicate);
            System.out.println("IR discount: free");
            System.out.println("Net salary: " + (grossSalary - syndicate));
            System.out.println("=================================");
        } else if (grossSalary <= 1500) {
            double irDiscount = grossSalary * 0.05;
            System.out.println("\n=============Payroll=============");
            System.out.printf("FGTS: %.2f\n" , fgts);
            System.out.printf("Syndicate: %.2f\n", syndicate);
            System.out.println("IR discount: 5%");
            System.out.printf("Net salary: %.2f\n" , (grossSalary -syndicate -irDiscount));
            System.out.println("=================================");
        } else if (grossSalary <= 2500) {
            double irDiscount = grossSalary * 0.10;
            System.out.println("\n=============Payroll=============");
            System.out.printf("FGTS: %.2f\n" , fgts);
            System.out.printf("Syndicate: %.2f\n", syndicate);
            System.out.println("IR discount: 10%");
            System.out.printf("Net salary: %.2f\n" , (grossSalary -syndicate -irDiscount));
            System.out.println("=================================");
        } else {
            double irDiscount = grossSalary * 0.20;
            System.out.println("\n=============Payroll=============");
            System.out.printf("FGTS: %.2f\n" , fgts);
            System.out.printf("Syndicate: %.2f\n", syndicate);
            System.out.println("IR discount: 20%");
            System.out.printf("Net salary: %.2f\n" , (grossSalary -syndicate -irDiscount));
            System.out.println("=================================");
        }
    }
}
