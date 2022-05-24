package com.andremapa.modulo1_Lógica.aula06;

import java.util.Scanner;

public class QuestSix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a person's age: ");
        int age = sc.nextInt();
        if (age >= 18 && age<= 67){
            System.out.println("You can donate blood");
        } else {
            System.out.println("You can't donate blood");
        }
    }
}
