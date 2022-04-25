package com.andremapa.aula05;

import java.util.Scanner;

public class QuestTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] notes = {100, 50, 20, 10, 5, 2, 1};
        int quantityNotes = 0;

        System.out.print("\nEnter a value: ");
        int value = sc.nextInt();

        while (value > 0) {
            for (int note : notes) {
                if (value >= note) {
                    quantityNotes = value / note;
                    value = value%note;
                    System.out.printf("%d notes of $%d\n", quantityNotes, note);
                }
            }
        }
    }
}
