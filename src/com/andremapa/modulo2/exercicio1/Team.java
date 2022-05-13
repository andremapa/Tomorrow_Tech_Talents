package com.andremapa.modulo2.exercicio1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Team {

    public static List<Player> createTeam(){
        Player p1 = new Player( 1, "Player 1", "One", LocalDate.of(2000, 1, 5),
                1, "Attacker", 3, 0, 1, false);
        Player p2 = new Player( 2, "Player 2", "Two", LocalDate.of(2000, 2, 6),
                1, "Attacker", 3, 0, 0, false);
        Player p3 = new Player( 3, "Player 3", "Three", LocalDate.of(2000, 3, 7),
                1, "Midfield", 3, 0, 0, false);
        Player p4 = new Player( 4, "Player 4", "Four", LocalDate.of(2000, 4, 8),
                1, "Midfield", 3, 0, 1, false);
        Player p5 = new Player( 5, "Player 5", "Five", LocalDate.of(2000, 5, 15),
                1, "Halfback", 3, 0, 0, false);
        Player p6 = new Player( 6, "Player 6", "Six", LocalDate.of(2000, 6, 25),
                1, "Halfback", 3, 0, 1, false);
        Player p7 = new Player( 7, "Player 7", "Seven", LocalDate.of(2000, 7, 5),
                1, "Right Side", 3, 3, 0, false);
        Player p8 = new Player( 8, "Player 8", "Eight", LocalDate.of(2000, 8, 6),
                1, "Goalkeeper", 3, 0, 0, false);
        Player p9 = new Player( 9, "Player 9", "Nine", LocalDate.of(2000, 9, 7),
                1, "Left Side", 3, 0, 1, false);
        Player p10 = new Player( 10, "Player 10", "Ten", LocalDate.of(2000, 10, 4),
                1, "HalfBack", 3, 0, 0, false);
        Player p11 = new Player( 11, "Player 11", "Eleven", LocalDate.of(2000, 11, 2),
                1, "Attacker", 3, 0, 0, false);
        return new ArrayList<>(Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11));
    }
}
