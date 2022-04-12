package com.andremapa.aula03;

import java.util.Scanner;

public class QuestSix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] numberList = new double[4];

        for (int i = 0; i < numberList.length; i++) {
            System.out.print("Enter with a number: ");
            numberList[i] = sc.nextDouble();
        }

        double sum = 0;
        for (double v : numberList) {
            sum += Math.pow(v, 2);
        }
        System.out.println("The sum of number (n^2) is " +sum);
    }
}
