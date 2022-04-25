package com.andremapa.aula05;

import java.util.Random;

public class QuestNine {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] numbers = new int[3][5];
        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                numbers[row][col] = random.nextInt(100);
                System.out.print(numbers[row][col]+ " ");
            }
            System.out.println();
        }
        System.out.println();

        int[] rowSum = new int[numbers.length];
        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                rowSum[row] += numbers[row][col];
            }
            System.out.printf("The sum of the %d° row is %d\n", (row+1), rowSum[row]);
        }
        System.out.println();

        int[] colSum = new int[numbers[0].length];
        for (int col = 0; col < numbers[0].length; col++) {
            for (int row = 0; row < numbers.length; row++) {
                colSum[col] += numbers[row][col];
            }
            System.out.printf("The sum of the %d° col is %d\n", (col+1), colSum[col]);
        }


    }
}
