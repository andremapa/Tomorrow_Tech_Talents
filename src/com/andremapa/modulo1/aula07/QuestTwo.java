package com.andremapa.modulo1.aula07;

import java.util.Scanner;

public class QuestTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size (m‸2) of the area to be painted: ");
        double areaPaint = sc.nextDouble();

        int amountLitersInk = (int) areaPaint / 3;
        amountLitersInk = addOneMoreIfRemainderOfDivisionIsDifferentFrom0(areaPaint,3, amountLitersInk);
        int numbersOfCans = 0;
        if (amountLitersInk <= 18){
            numbersOfCans = 1;
        } else{
            numbersOfCans = amountLitersInk / 18;
            numbersOfCans = addOneMoreIfRemainderOfDivisionIsDifferentFrom0(amountLitersInk, 18, numbersOfCans);
        }

        System.out.println("\nNumber of cans: " + numbersOfCans);
        System.out.printf("Total value R$%.2f\n", (double) numbersOfCans * 80);
    }

    public static int addOneMoreIfRemainderOfDivisionIsDifferentFrom0(double dividend, int divider, int variableToRound){
        if (dividend%divider != 0){
            return variableToRound = variableToRound + 1;
        }
        return variableToRound;
    }
}
