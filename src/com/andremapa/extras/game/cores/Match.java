package com.andremapa.extras.game.cores;

import com.andremapa.extras.game.models.Player;

import java.util.List;
import java.util.Random;

public class Match {

    public static void matchScreen(List<Player> team) {
        String[] opponentTime = {"BARCELONA", "REAL MADRID", "PSG", "ROMA", "JUVENTUS", "INTER", "MANCHESTER UNITED"};
        Random random = new Random();
        int whichTime = random.nextInt(6);

        System.out.println("==================================");
        System.out.println("| ==== ====SOCCER GAME==== ====  |");
        System.out.printf ("| YOUR TIME      X %13s |\n", opponentTime[whichTime]);
        System.out.println("| ==== ====SOCCER GAME==== ====  |");
        System.out.println("==================================\n");

        for (int i = 0; i < 3; i++) {
            int probability = random.nextInt(100);
            if (probability == 1){
                System.out.println("!!!WE HAVE A DOG IN THE GAME!!!");
            } else if (probability < 6){
                int whichPlayerWillGetRedCard =  random.nextInt(2);
                team.get(whichPlayerWillGetRedCard).addRedCard();
                System.out.printf("The player %s get a red card!\n", team.get(whichPlayerWillGetRedCard).getName());
            } else if (probability < 27){
                int whichPlayerWillInjured = random.nextInt(2);
                team.get(whichPlayerWillInjured).getInjured();
                System.out.printf("The player %s get a injured!\n", team.get(whichPlayerWillInjured).getName());
            } else if(probability < 60){
                int whichPlayerGetYellowCard= random.nextInt(2);
                team.get(whichPlayerGetYellowCard).addYellowCard(1);
                System.out.printf("The player %s get a yellow card!\n", team.get(whichPlayerGetYellowCard).getName());
            } else {
                System.out.println("The game is going ok");
            }
        }

        int goalsTimeOne = random.nextInt(7);
        int goalsTimeTwo = random.nextInt(7);
        System.out.println("==================================");
        System.out.println("| ==== ====SOCCER GAME==== ====  |");
        System.out.printf ("| YOUR TIME   %d X %d%13s |\n", goalsTimeOne, goalsTimeTwo,opponentTime[whichTime]);
        System.out.println("| ==== ====SOCCER GAME==== ====  |");
        System.out.println("==================================\n");
        team.forEach(x -> x.setTrained(false));
    }
}
