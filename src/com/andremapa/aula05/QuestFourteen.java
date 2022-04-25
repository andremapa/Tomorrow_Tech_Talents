package com.andremapa.aula05;

import java.util.Scanner;

public class QuestFourteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] ages = new int[2][2];
        int olderAgeM, olderAgeW, underageM, underageW;

        for (int row = 0; row < ages.length; row++) {
            if (row == 0){
                System.out.println("Write two different ages of two men: ");
            } else {
                System.out.println("Write two different ages of two women: ");
            }
            for (int col = 0; col < ages[row].length; col++) {
                System.out.printf("Age %d: ", (col + 1));
                ages[row][col] = sc.nextInt();
            }
        }

        if (ages[0][0] > ages[0][1]){
            olderAgeM = ages[0][0];
            underageM = ages[0][1];
        } else {
            olderAgeM = ages[0][1];
            underageM = ages[0][0];
        }

        if (ages[0][0] > ages[0][1]){
            olderAgeW= ages[1][0];
            underageW = ages[1][1];
        } else {
            olderAgeW = ages[1][1];
            underageW = ages[1][0];
        }

        System.out.println("The sum of the ages of the oldest man and the youngest woman is " + (olderAgeM + underageW));
        System.out.println("The product of the ages of the youngest man and the oldest woman is " + (underageM * olderAgeW));

    }
}
