package com.andremapa.modulo2.exercicio4;

public class Snake extends Enemy{

    protected Snake(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("The enemy " + name + " dealt 10 damage! (Your character is poisoned)");
    }

    @Override
    public void getDamage(TypeAttack typeAttack, int damageValue) {
        if (!typeAttack.equals(TypeAttack.STUN)) {
            System.out.printf("Get %d damage!\n", damageValue);
        }
        System.out.printf("Get %d damage!\n", damageValue * 2);
    }

    @Override
    public void interact() {
        System.out.println("If you light the flame the curse ends.");
    }
}
