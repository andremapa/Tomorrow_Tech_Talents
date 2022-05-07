package com.andremapa.modulo1.aula03;

import java.util.Scanner;

public class QuestOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter with the student name: ");
        String studentName = sc.nextLine();

        System.out.print("Enter with the student class name: ");
        String studentClass = sc.nextLine();

        double[] notes = new double[3];
        double average = 0;

        for (int i = 0; i < notes.length; i++) {
            System.out.printf("Enter with the student note %d: ", (i+1));
            notes[i] = sc.nextDouble();
            average+= notes[i];
        }

        System.out.printf("The average is %.2f", average/ notes.length);

    }
}
