package com.andremapa.modulo1.aula06;

import java.util.Scanner;

public class QuestFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the maximum number of contacts: ");
        int quantityContact = sc.nextInt();

        String[] personCode = new String[quantityContact];
        String[] personPhone = new String[quantityContact];
        int[] personAges = new int[quantityContact];

        while (true) {
            int contactNumber = 0;
            int option;
            do {
                System.out.println("\n==========MENU========");
                System.out.println("(1) – Enter a contact");
                System.out.println("(2) – Remove a contact");
                System.out.println("(3) – Exit");
                System.out.println("======================");

                System.out.print("Select one of the options: ");
                option = sc.nextInt();
            } while (option == 0);

            switch (option){
                case 1 -> {
                    sc.nextLine();
                    System.out.print("Enter person code: ");
                    personCode[contactNumber] = sc.nextLine();
                    System.out.print("Enter phone number: ");
                    personPhone[contactNumber] = sc.nextLine();
                    System.out.print("Enter person age: ");
                    personAges[contactNumber] = sc.nextInt();
                    contactNumber++;
                }
                case 2 -> {
                    System.out.println("==========AGENDA========");
                    for (int i = 0; i < quantityContact; i++) {
                        if (personCode[i] != null){
                            System.out.println("     Contact " + i+1);
                            System.out.println("Person code: " + personCode[i]);
                            System.out.println("Person phone: " + personPhone[i]);
                            System.out.println("Person ages: " + personAges[i]);
                        }
                    }
                    System.out.print("Enter the number of the contact you want to delete: ");
                    int contactRemove = sc.nextInt();
                    personCode[contactRemove -1] = null;
                    personPhone[contactRemove -1] = null;
                    personAges[contactRemove -1] = 0;
                }
                default -> System.out.println("Bye!");
            }
            if (option == 3){
                break;
            }
        }
    }
}
