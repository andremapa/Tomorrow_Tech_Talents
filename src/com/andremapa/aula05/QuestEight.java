package com.andremapa.aula05;

import java.util.Random;
import java.util.Scanner;

public class QuestEight {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int[][] numbers = new int[1][10];
        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                numbers[row][col] = random.nextInt(100);
            }
        }

        System.out.print("\nEnter a value: ");
        int value = sc.nextInt();

        System.out.println(verifyIfTheNumberExists(numbers, value));
    }

    public static String verifyIfTheNumberExists(int[][] number, double value){
        String situation = "==";
        for (int row = 0; row < number.length; row++) {
            for (int col = 0; col < number[row].length; col++) {
                if (number[row][col] == value) {
                    situation = "The value exists in the set";
                    break;
                }
            }
        }
        return situation;
    }
}
