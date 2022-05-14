package com.andremapa.modulo2.exercicio4;

import java.util.ArrayList;
import java.util.List;

public class TestEnemy {

    public static void main(String[] args) {
        List<Enemy> enemies = popEnemiesList();

        enemies.get(0).attack();
        enemies.get(0).interact();
        enemies.get(0).getDamage(TypeAttack.NORMAL, 8);

        enemies.get(1).attack();
        enemies.get(1).interact();
        enemies.get(1).getDamage(TypeAttack.DRILLING, 12);

        enemies.get(2).attack();
        enemies.get(2).interact();
        enemies.get(2).getDamage(TypeAttack.STUN, 15);

        enemies.get(3).attack();
        enemies.get(3).interact();
        enemies.get(3).getDamage(TypeAttack.ELEMENTAL, 5);
    }

    private static List<Enemy> popEnemiesList(){
        Enemy generic = new Generic("Dragg");
        Enemy vampire = new Vampire("Dracula");
        Snake snake = new Snake("Viper");
        Giant giant = new Giant("Dorim");

        return List.of(generic, vampire, snake, giant);
    }
}
