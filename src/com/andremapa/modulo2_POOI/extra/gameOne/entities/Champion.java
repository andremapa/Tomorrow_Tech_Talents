package com.andremapa.modulo2_POOI.extra.gameOne.entities;

import com.andremapa.modulo2_POOI.extra.gameOne.models.CharacterModel;
import com.andremapa.modulo2_POOI.extra.gameOne.utils.Actions;
import com.andremapa.modulo2_POOI.extra.gameOne.utils.TypeAttack;

public class Champion extends CharacterModel implements Actions {

    public Champion(String name, int healthPoints, TypeAttack typeAttack, int baseDamage, TypeAttack weakness) {
        super(name, healthPoints, typeAttack, baseDamage, weakness);
    }

    @Override
    public void attack(CharacterModel characterModel) {
        if (characterModel.getWeakness()!= this.getTypeAttack()){
            ((Enemy) characterModel).getDamage(this.getBaseDamage() + this.getTypeAttack().getBonusDamage());
        } else {
            ((Enemy) characterModel).getDamage(this.getBaseDamage() * 2 + this.getTypeAttack().getBonusDamage());
        }
        String enemyName = characterModel.getName();
        int enemyHp = characterModel.getHealthPoints();
        System.out.printf("%s: %dhp\n%s: %dhp\n", this.getName(), this.getHealthPoints(), enemyName, enemyHp);
        characterModel.isDead();

    }

    public void meditation(){
        addHealth(generateNumber());
    }

    public void getDamage(int damage){
        removeHealth(damage);
    }

}
