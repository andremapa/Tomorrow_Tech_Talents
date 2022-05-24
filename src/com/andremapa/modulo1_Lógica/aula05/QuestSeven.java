package com.andremapa.modulo1_Lógica.aula05;

import java.util.Arrays;
import java.util.Scanner;

public class QuestSeven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Character[] teacherFeedback = {'A', 'A', 'B', 'E', 'D', 'D', 'B', 'B', 'C', 'C'};
        Character[][] studentAnswers = new Character[10][10];

        System.out.println("=====Enter the answers of the student=====");
        for (int i = 0; i < studentAnswers.length; i++) {
            System.out.printf("          Student %d\n", (i+1));
            for (int j = 0; j < studentAnswers[i].length; j++) {
                System.out.printf("Grade %d: ", (j+1));
                studentAnswers[i][j] = sc.nextLine().charAt(0);
            }
        }

        String[] studentSituation = verifyTheQuantityOfHits(teacherFeedback, studentAnswers);
        System.out.println("\n" + Arrays.toString(studentSituation));
    }

    public static String[] verifyTheQuantityOfHits(Character[] teacherFeedback, Character[][] studentAnswers){
        String[] situation = new String[studentAnswers.length];
        for (int i = 0; i < studentAnswers.length; i++) {
            for (int row = 0; row < studentAnswers.length; row++) {
                int quantityOfHits = 0;
                for (int column = 0; column < studentAnswers[row].length; column++) {
                    if( (teacherFeedback[column]).equals(studentAnswers[row][column])){
                        quantityOfHits++;
                    }
                }
                if (quantityOfHits >= 6){
                    situation[i] = "The student " + (i+1) + " got " + quantityOfHits + " is approved";
                } else {
                    situation[i] = "The student " + (i+1) + " got " + quantityOfHits + " is not approved";
                }
            }
        }
        return situation;
    }
}
