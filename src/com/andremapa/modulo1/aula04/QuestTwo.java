package com.andremapa.modulo1.aula04;

import java.util.Scanner;

public class QuestTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int isZero = 1;
        while(isZero != 0){
            System.out.print("Enter with a number (If you want to exit the program enter with zero): ");
            isZero = sc.nextInt();

            if (isZero > 0){
                System.out.println("The number is positive");
            } else if (isZero < 0){
                System.out.println("The number is negative");
            }
        }
    }
}
