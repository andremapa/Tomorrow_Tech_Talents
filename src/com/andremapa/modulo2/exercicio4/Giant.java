package com.andremapa.modulo2.exercicio4;

public class Giant extends Enemy{

    protected Giant(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("The enemy " + name + " dealt 25 damage! (Your character is stunned)");
    }

    @Override
    public void getDamage(TypeAttack typeAttack, int damageValue) {
        if(!typeAttack.equals(TypeAttack.ELEMENTAL)) {
            System.out.printf("Get %d damage!\n", damageValue);
        }
        System.out.printf("Get %d damage!\n", damageValue * 2);
    }

    @Override
    public void interact() {
        System.out.println("I'm sorry...");
    }
}
