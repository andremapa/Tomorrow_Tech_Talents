package com.andremapa.modulo1_Lógica.aula07;

import java.util.Scanner;

public class QuestSeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] carsBrands = new String[2];
        Double[] kmPerLiter = new Double[2];
        for (int i = 0; i < carsBrands.length; i++) {
            System.out.printf("\nVehicle %d\n", (i+1));
            System.out.print("Car brand: ");
            carsBrands[i] = sc.nextLine();
            System.out.print("Km per Liter: ");
            kmPerLiter[i] = sc.nextDouble();
            sc.nextLine();
        }

        System.out.println("\nFinal report: ");
        for (int i = 0; i < carsBrands.length; i++) {
            System.out.printf("%d - %-15s-   %.1f-  %.1f liters - R$ %.2f\n", (i+1), carsBrands[i], kmPerLiter[i], (1000/ kmPerLiter[i]), ((1000/ kmPerLiter[i])*7.25));
        }

    }
}
