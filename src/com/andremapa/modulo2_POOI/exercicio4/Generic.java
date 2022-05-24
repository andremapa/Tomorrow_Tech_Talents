package com.andremapa.modulo2_POOI.exercicio4;

public class Generic extends Enemy{

    public Generic(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("The enemy " + name + " dealt 10 damage!");
    }

    @Override
    public void getDamage(TypeAttack typeAttack, int damageValue) {
        System.out.printf("Get %d damage!\n", damageValue);
    }

    @Override
    public void interact() {
        System.out.println("Why would I answer my enemy");
    }
}
