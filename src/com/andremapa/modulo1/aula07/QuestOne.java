package com.andremapa.modulo1.aula07;

import java.util.Scanner;

public class QuestOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] jumps = new double[5];
        String[] ordinalNumbers = {"First", "Second", "Third", "Fourth", "Fifth"};

        System.out.print("Enter athlete name: ");
        String name = sc.nextLine();
        for (int i = 0; i < jumps.length; i++) {
            System.out.printf("Enter the value of the %d° jump: ", (i+1));
            jumps[i]= sc.nextDouble();
        }

        System.out.printf("\nAthlete: %s\n\n", name);
        for (int i = 0; i < jumps.length; i++) {
            System.out.printf("%s jump: %.1f\n", ordinalNumbers[i], jumps[i]);
        }
        System.out.printf("\nBest Jump: %.1f\n", getTheBestJump(jumps));
        System.out.printf("Worst Jump: %.1f\n", getTheWorstJump(jumps));
        System.out.printf("\nAverage of the others jumps: %.1f", getAverage(jumps));
    }

    public static double getTheBestJump(double[] jumps){
        double bestJump = jumps[0];
        for (double jump : jumps) {
            if (jump > bestJump) {
                bestJump = jump;
            }
        }
        return bestJump;
    }

    public static int getBestJumpIndex(double[] jumps){
        int indexBestJump = 0;
        double bestJump = jumps[0];
        for (int i = 0; i < jumps.length; i++) {
            if (jumps[i] > bestJump){
                bestJump = jumps[i];
                indexBestJump = i;
            }
        }
        return indexBestJump;
    }

    public static double getTheWorstJump(double[] jumps){
        double worstJump = jumps[0];
        for (double jump : jumps) {
            if (jump < worstJump) {
                worstJump = jump;
            }
        }
        return worstJump;
    }

    public static int getWorstJumpIndex(double[] jumps){
        int indexWorstJump = 0;
        double worstJump = jumps[0];
        for (int i = 0; i < jumps.length; i++) {
            if (jumps[i] < worstJump){
                worstJump = jumps[i];
                indexWorstJump = i;
            }
        }
        return indexWorstJump;
    }

    public static double getAverage(double[] jumps){
        jumps[getWorstJumpIndex(jumps)] = 0;
        jumps[getBestJumpIndex(jumps)] = 0;
        double average = 0;
        for (double jump: jumps) {
            average += jump;
        }
        return average / 3;
    }
}
