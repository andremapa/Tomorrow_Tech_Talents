package com.andremapa.modulo1.aula05;

import java.util.Scanner;

public class QuestSix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] feedbackOfficial = {1,3,2,1,3,2,1,2,1,1,2,3,3};
        int[] punterFeedback = new int[13];
        int numberPlayer = 1;

        System.out.print("How many people will bet: ");
        int maxQuantity = sc.nextInt();

        while (numberPlayer <= maxQuantity){

            System.out.printf("\nEnter the game of %d° punter:\n", numberPlayer);
            for (int i = 0; i < punterFeedback.length; i++) {
                System.out.printf("Enter with %d° answer: ", (i+1));
                punterFeedback[i] = sc.nextInt();
            }

            int hits = verifyTheNumberOfHits(feedbackOfficial,punterFeedback);
            System.out.printf("\nThe punter %d hit %d", numberPlayer, hits);
            if (hits ==13){
               System.out.println("\nThe punter win the game");
            }
            numberPlayer++;
        }
    }

    public static int verifyTheNumberOfHits(int[] feedbackOfficial, int[] punterFeedback){
        int hits = 0;
        for (int i = 0; i < feedbackOfficial.length; i++) {
            if(feedbackOfficial[i] == punterFeedback[i]){
                hits++;
            }
        }
        return hits;
    }
}
