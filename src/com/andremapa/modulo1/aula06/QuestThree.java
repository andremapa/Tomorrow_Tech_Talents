package com.andremapa.modulo1.aula06;

import java.util.Scanner;

public class QuestThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] answers = new boolean[5];
        int positiveAnswers =0;

        System.out.println("====================POLICE_QUESTIONNAIRE====================");
        System.out.println("Instruction: Answer the questions below with yes(true) or no(false)");
        System.out.print("Did you call the victim? ");
        answers[0] = sc.nextBoolean();
        System.out.print("Were you at the crime scene? ");
        answers[1] = sc.nextBoolean();
        System.out.print("Do you live near the victim? ");
        answers[2] = sc.nextBoolean();
        System.out.print("I owed it to the victim? ");
        answers[3] = sc.nextBoolean();
        System.out.print("Have you ever worked with the victim? ");
        answers[4] = sc.nextBoolean();

        for (boolean answer : answers) {
            if (answer) {
                positiveAnswers++;
            }
        }

        switch (positiveAnswers){
            case 2-> System.out.println("Suspect");
            case 3, 4-> System.out.println("Accomplice");
            case 5-> System.out.println("Assassin");
            default -> System.out.println("Innocent");
        }
    }
}
