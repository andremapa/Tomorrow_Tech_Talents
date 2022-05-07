package com.andremapa.modulo1.aula05;

import java.util.Scanner;

public class QuestSixteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[3];
        String searchName;

        System.out.println("Enter 10 names:");
        for (int i = 0; i < names.length; i++) {
            System.out.printf("Name %d: ", (i+1));
            names[i] = sc.nextLine().toUpperCase();
        }

        System.out.print("Enter a name to search for it among the 10 typed: ");
        searchName = sc.nextLine().toUpperCase();
        for (int i = 0; i <= names.length; i++) {
            if (i < names.length){
                if (names[i].equals(searchName)){
                    System.out.println("FOUNDED");
                    break;
                }
            } else {
                System.out.println("NOT FOUNDED");
            }

        }
    }
}
