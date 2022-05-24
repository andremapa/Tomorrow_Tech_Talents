package com.andremapa.modulo1_Lógica.aula07;

import java.util.Scanner;

public class QuestSix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size (m‸2) of the area to be painted: ");
        double areaPaint = sc.nextDouble();

        int amountLiterInk = (int) (areaPaint/6);
        amountLiterInk = addOneMoreIfRemainderOfDivisionIsDifferentFrom0(areaPaint, 6.0, amountLiterInk);

        int amountPaintCans18L = amountLiterInk / 18;
        amountPaintCans18L = addOneMoreIfRemainderOfDivisionIsDifferentFrom0(amountLiterInk, 18.0, amountPaintCans18L);
        System.out.printf("\nYou will need %d of 18L paint can it will cost R$%.2f\n", amountPaintCans18L, amountPaintCans18L * 80.0);

        int amountPaintCans3L = (int) (amountLiterInk / 3.6);
        amountPaintCans3L = addOneMoreIfRemainderOfDivisionIsDifferentFrom0(amountLiterInk, 3.6, amountPaintCans3L);
        System.out.printf("You will need %d of 3,6L paint can it will cost R$%.2f\n", amountPaintCans3L, amountPaintCans3L * 25.0);
    }
    public static int addOneMoreIfRemainderOfDivisionIsDifferentFrom0(double dividend, double divider, int variable){
        if (dividend%divider != 0){
            return variable + 1;
        }
        return variable;
    }
}
