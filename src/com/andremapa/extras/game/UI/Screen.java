package com.andremapa.extras.game.UI;

import com.andremapa.extras.game.models.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Screen {

    public static int printInitialScreen(Scanner sc){
        System.out.println("==================================");
        System.out.println("| ==== ====SOCCER GAME==== ====  |");
        System.out.println("| OPTION 1: PLAY GAME            |");
        System.out.println("| OPTION 2: EXIT GAME            |");
        System.out.println("==================================");
        System.out.print(" CHOOSE A OPTION: ");
        return sc.nextInt();
    }

    public static int printGameScreen(Scanner sc) {
        System.out.println("\n==================================");
        System.out.println("| ==== ====SOCCER GAME==== ====  |");
        System.out.println("| OPTION 1: PLAY A GAME          |");
        System.out.println("| OPTION 2: TEAM STATUS          |");
        System.out.println("| OPTION 3: TRAIN TEAM           |");
        System.out.println("| OPTION 4: EXIT GAME            |");
        System.out.println("==================================");
        System.out.print(" CHOOSE A OPTION: ");
        return sc.nextInt();
    }
    public static void printTrainingScreen() {
        System.out.println("\n================================");
        System.out.println("| ==== ====TRAINING..==== ==== |");
        System.out.println("================================");
    }

    public static void printNoTrainingScreen() {
        System.out.println("\n================================");
        System.out.println("| === YOU CAN'T TRAIN MORE === |");
        System.out.println("================================");
    }

    public static void printCancelSuspendScreen(Player player, Scanner sc) {
        System.out.println("\n===================================");
        System.out.println("| === YOU CAN CANCEL THE SUSPEND== |");
        System.out.println("====================================");
        System.out.println("The player " + player.getName() + " is suspended!");
        System.out.println("Want to cancel the suspend? (S/N): ");
        switch (sc.nextLine().toUpperCase().charAt(0)){
            case 'S' -> player.cancelSuspension();
            case 'N' -> System.out.println("Ok");
        }
    }


    public static void printEndGameScreen() {
        System.out.println("\n================================");
        System.out.println("| ==== ==== END GAME ==== ==== |");
        System.out.println("================================");
    }

    public static List<Player> registerTeam(Scanner sc){
        System.out.println("\n==================================");
        System.out.println("| ==== ====SOCCER GAME==== ====  |");
        System.out.println("| REGISTER YOUR TEAM             |");
        System.out.println("==================================");
        List<Player> team = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            cleanScannerBuff(sc);
            System.out.printf("\nPLAYER %d\n", (i+1));
            System.out.print("NAME: ");
            String name = sc.nextLine();
            System.out.print("NICKNAME: ");
            String nickname = sc.nextLine();
            System.out.print("BIRTHDATE: ");
            String birthdate = sc.nextLine();
            System.out.print("NUMBER: ");
            int number = sc.nextInt();
            cleanScannerBuff(sc);
            System.out.print("POSITION: ");
            String position = sc.nextLine();
            System.out.print("QUALITY: ");
            int quality = sc.nextInt();
            team.add(new Player(i, name, nickname, birthdate, number, position, quality));
        }
        return team;
    }

    private static void cleanScannerBuff(Scanner sc){
        if (sc.hasNextLine()){
            sc.nextLine();
        }
    }
}
