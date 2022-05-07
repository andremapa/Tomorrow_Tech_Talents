package com.andremapa.extras.game;

import com.andremapa.extras.game.models.Player;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static com.andremapa.extras.game.UI.Screen.*;
import static com.andremapa.extras.game.cores.Match.matchScreen;

public class GameMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int control = 0;
        if (printInitialScreen(sc) == 1){
            List<Player> team = registerTeam(sc);
            while (control == 0) {
                switch (printGameScreen(sc)) {
                    case 1 -> matchScreen(team);
                    case 2 -> team.forEach(System.out::println);
                    case 3 -> {
                        Player player = team.get(0);
                        if (team.stream().map(Player::isSuspended).toList().get(0)){
                            Player playerSuspended = team.stream().filter(Player::isSuspended).toList().get(0);
                            printCancelSuspendScreen(playerSuspended, sc);
                        }
                        if (!player.isTrained()){
                            team.forEach(Player::runTraining);
                            printTrainingScreen();
                        } else {
                            printNoTrainingScreen();
                        }
                    }
                    case 4 -> {
                        printEndGameScreen();
                        control++;
                    }
                }
            }
        } else {
            printEndGameScreen();
        }
    }
}
