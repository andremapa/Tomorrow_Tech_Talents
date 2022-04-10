package com.andremapa.aula02;

import java.util.Scanner;

public class QuestTen {

    public static final double RATE = 0.7;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value to see your income a month from now: ");
        double value = sc.nextDouble();

        double valueAfterAMonth = value + (value * RATE);

        System.out.printf("After a month you'll receive %.2f", valueAfterAMonth);
    }
}
