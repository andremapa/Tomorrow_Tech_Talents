package com.andremapa.modulo1.aula02;

import java.util.Scanner;

public class QuestFourteen {

    public static final double PI = 3.1415;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter with the radius of the circle: ");
        double circleRadius = sc.nextDouble();

        double circleArea = PI * Math.pow(circleRadius, 2);

        System.out.printf("The area is %.2f", circleArea);
    }
}
