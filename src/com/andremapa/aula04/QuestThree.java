package com.andremapa.aula04;

import java.util.Scanner;

public class QuestThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 100; i++) {
            if (i%10 == 0){
                System.out.printf("The number %d is multiple of 10\n", i);
            }
        }
    }
}
