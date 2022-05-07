package com.andremapa.modulo1.aula02;

import java.util.Scanner;

public class QuestFifteen {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many horse are there in the stud: ");
        int horseQuantity = sc.nextInt();

        int horseshoesQuantity = horseQuantity * 4;
        System.out.printf("The amount of horseshoes you need is %d", horseshoesQuantity);
    }
}
