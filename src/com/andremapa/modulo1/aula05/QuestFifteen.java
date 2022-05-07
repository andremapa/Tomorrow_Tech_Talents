package com.andremapa.modulo1.aula05;

import java.util.Scanner;

public class QuestFifteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products to register: ");
        int numberOfProducts = sc.nextInt();
        sc.nextLine();

        String[] productsName = new String[numberOfProducts];
        int[] productsInStock = new int[numberOfProducts];
        double[] unitaryValue = new double[numberOfProducts];
        double average = 0;
        double amountInStock = 0;

        for (int i = 0; i < numberOfProducts; i++) {
            System.out.printf("\nEnter product number %d data: \n", (i+1));
            System.out.print("Product name: ");
            productsName[i]= sc.nextLine();
            System.out.print("Product in stock: ");
            productsInStock[i] = sc.nextInt();
            System.out.print("Product unitary value: ");
            unitaryValue[i]= sc.nextDouble();
            sc.nextLine();
            average += unitaryValue[i];
        }

        for (int i = 0; i < numberOfProducts; i++) {
            amountInStock = amountInStock + (productsInStock[i] * unitaryValue[i]);
        }

        System.out.println("The total amount in stock is " + amountInStock + ", the average value of goods is " + average/numberOfProducts);
        System.out.println();
    }
}
