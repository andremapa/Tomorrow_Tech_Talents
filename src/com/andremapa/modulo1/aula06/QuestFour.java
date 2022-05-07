package com.andremapa.modulo1.aula06;

import java.util.Scanner;

public class QuestFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("The maximum speed allowed on an avenue: ");
        int avenueMaxSpeed = sc.nextInt();
        System.out.print("The speed at which the driver was driving: ");
        double driverSpeed = sc.nextDouble();

        double diff = driverSpeed - avenueMaxSpeed;
        if (diff < 10){
            System.out.println("Traffic ticket R$50,0");
        } else if (diff < 30) {
            System.out.println("Traffic ticket R$100,0");
        } else {
            System.out.println("Traffic ticket R$200,0");
        }
    }
}
