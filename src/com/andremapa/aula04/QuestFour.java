package com.andremapa.aula04;

import java.util.Scanner;

public class QuestFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbersArray = new int[5];
        for (int i = 0; i < numbersArray.length; i++) {
            System.out.print("Enter with a integer number: ");
            numbersArray[i] = sc.nextInt();
        }

        System.out.println("The numbers entered in descending order were:");
        for (int i = (numbersArray.length-1); i >= 0; i--) {
            System.out.print(numbersArray[i] + " ");
        }
    }
}
