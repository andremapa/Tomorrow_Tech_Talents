package com.andremapa.modulo1_Lógica.aula04;

import java.util.Scanner;

public class QuestOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] studentNotes = new double[4];

        double sumNotes = 0;
        for (int i = 0; i < studentNotes.length; i++) {
            System.out.printf("Enter with the student note %d: ", (i+1));
            studentNotes[i] = sc.nextDouble();
            sumNotes += studentNotes[i];
        }
        double average = sumNotes / studentNotes.length;

        if(average >= 7){
            System.out.println("The student was approved");
        } else{
            System.out.println("The student was not approved");
        }
    }
}
