package com.andremapa.modulo1.aula04;

import java.util.Scanner;

public class QuestSeven {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int numberToBeFactored;
        do {
            System.out.print("Enter with a positive number: ");
            numberToBeFactored = sc.nextInt();
        }while (numberToBeFactored < 0);

        if (numberToBeFactored == 0){
            System.out.println("The factorial of the number 0 is 1");
        } else {
            int factored = numberToBeFactored;
            while(numberToBeFactored > 1){
                factored = factored * (numberToBeFactored -1);
                numberToBeFactored--;
            }
            System.out.printf("The factorial of the number is %d", factored);
        }
    }
}
