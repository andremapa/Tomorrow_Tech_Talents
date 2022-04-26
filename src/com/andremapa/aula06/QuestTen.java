package com.andremapa.aula06;

import java.util.Scanner;

public class QuestTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double averageViewerAgeForExcellent = 0;
        int quantityViewerForExcellent = 0;
        int quantityViewerForRegular = 0;
        int quantityViewerForGood = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Viewer " + (i+1));
            System.out.print("Enter viewer age: ");
            int viewerAge = sc.nextInt();
            System.out.print("Enter viewer opinion(1-regular, 2-good, 3-excellent): ");
            int viewerOpinion = sc.nextInt();
            System.out.println();

            switch (viewerOpinion){
                case 3 -> {
                    averageViewerAgeForExcellent += viewerAge;
                    quantityViewerForExcellent++;
                }
                case 2 -> quantityViewerForGood++;
                case 1 -> quantityViewerForRegular++;
                default -> {
                    System.out.print("Enter viewer opinion(1-regular, 2-good, 3-excellent): ");
                    viewerOpinion = sc.nextInt();
                }
            }
        }
        System.out.println("The average age of the people who responded great " + averageViewerAgeForExcellent / quantityViewerForExcellent);
        System.out.println("The number of people who responded regularly " + quantityViewerForRegular);
        System.out.printf("The percentage of people who responded “good” among all the viewers analyzed %d%%", (quantityViewerForGood*100/5));
    }
}
