package com.andremapa.modulo2.exercicio4;

public class Vampire extends Enemy{

    protected Vampire(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("The enemy " + name + " dealt 20 damage! (Your character is bleeding)");
    }

    @Override
    public void getDamage(TypeAttack typeAttack, int damageValue) {
        if (!typeAttack.equals(TypeAttack.DRILLING)) {
            System.out.printf("Get %d damage!\n", damageValue);
        }
        System.out.printf("Get %d damage!\n", damageValue * 2);
    }

    @Override
    public void interact() {
        System.out.println("What is a man?");
    }

}
