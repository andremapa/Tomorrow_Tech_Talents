package com.andremapa.modulo2_POOI.extra.gameOne.entities;

import com.andremapa.modulo2_POOI.extra.gameOne.models.CharacterModel;
import com.andremapa.modulo2_POOI.extra.gameOne.utils.Actions;
import com.andremapa.modulo2_POOI.extra.gameOne.utils.TypeAttack;

public class Enemy extends CharacterModel implements Actions {

    public Enemy(String name, int healthPoints, TypeAttack typeAttack, int baseDamage, TypeAttack weakness) {
        super(name, healthPoints, typeAttack, baseDamage, weakness);
    }

    @Override
    public void attack(CharacterModel characterModel) {
        if (characterModel.getWeakness()!= this.getTypeAttack()){
            ((Champion) characterModel).getDamage(this.getBaseDamage() + this.getTypeAttack().getBonusDamage());
        } else {
            ((Champion) characterModel).getDamage(this.getBaseDamage() * 2 + this.getTypeAttack().getBonusDamage());
        }
        String championName = characterModel.getName();
        int championHp = characterModel.getHealthPoints();
        System.out.printf("%s: %dhp\n%s: %dhp\n", championName, championHp, this.getName(), this.getHealthPoints());
        characterModel.isDead();
    }

    public void getDamage(int damage){
        removeHealth(damage);
    }

}
