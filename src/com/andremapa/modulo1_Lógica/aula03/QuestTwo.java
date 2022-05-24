package com.andremapa.modulo1_Lógica.aula03;

import java.util.Scanner;

public class QuestTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter with your name: ");
        String nameComplete = sc.nextLine();
        System.out.print("Enter with your address: ");
        String address = sc.nextLine();
        System.out.print("Enter with your CEP: ");
        String cep = sc.nextLine();
        System.out.print("Enter with your phone number: ");
        String phoneNumber = sc.nextLine();

        System.out.printf("Name: %s\nAddress: %s\nCEP: %s  Phone: %s", nameComplete, address, cep, phoneNumber);
    }
}
