package com.andremapa.modulo2.exercicio4;

public abstract class Enemy {

    protected String name;

    protected Enemy(String name) {
        this.name = name;
    }

    protected abstract void attack();
    protected abstract void getDamage(TypeAttack typeAttack, int damageValue);
    protected abstract void interact();
}
