package com.andremapa.modulo2_POOI.extra.gameOne.utils;

public enum TypeAttack {
    NORMAL(0),
    FIRE(2),
    ICE(2),
    AIR(2),
    WATER(2),
    DRILLING(5),
    SHARP(5),
    STUN(8);

    private final int bonusDamage;

    TypeAttack(int bonusDamage) {
        this.bonusDamage = bonusDamage;
    }

    public int getBonusDamage() {
        return bonusDamage;
    }
}
