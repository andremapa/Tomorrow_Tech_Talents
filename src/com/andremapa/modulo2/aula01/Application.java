package com.andremapa.modulo2.aula01;


import java.util.List;

import static com.andremapa.modulo2.aula01.Team.createTeam;

public class Application {

    public static void main(String[] args) {

        List<Player> playerList = createTeam();
        playerList.forEach(System.out::println);
    }
}
