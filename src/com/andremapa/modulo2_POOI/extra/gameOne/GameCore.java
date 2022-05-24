package com.andremapa.modulo2_POOI.extra.gameOne;

import com.andremapa.modulo2_POOI.extra.gameOne.entities.Champion;
import com.andremapa.modulo2_POOI.extra.gameOne.entities.Enemy;
import com.andremapa.modulo2_POOI.extra.gameOne.utils.TypeAttack;

public class GameCore {

    public static void main(String[] args) {
        Champion champion = new Champion("Bardo", 100, TypeAttack.FIRE, 4, TypeAttack.DRILLING);
        Enemy enemy = new Enemy("Alistar", 50, TypeAttack.STUN, 8, TypeAttack.FIRE);

        champion.attack(enemy);
        System.out.println("");
        enemy.attack(champion);
        System.out.println("");
        champion.attack(enemy);
        System.out.println("");
        enemy.attack(champion);
        System.out.println("");
        champion.attack(enemy);
    }
}
