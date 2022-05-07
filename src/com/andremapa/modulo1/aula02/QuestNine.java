package com.andremapa.modulo1.aula02;

import java.util.Scanner;

public class QuestNine {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] studentGradeList = new double[3];
        double average = 0;

        System.out.print("Enter student name: ");
        String studentName = sc.nextLine();

        for (int i = 1; i < 4; i++) {
            System.out.printf("Enter student grade %d: ", i);
            studentGradeList[i-1] = sc.nextDouble();
        }

        for(double grade : studentGradeList){
            average+=grade;
        }

        average = average/ studentGradeList.length;

        System.out.printf("The average student is %.2f", average);
    }
}
