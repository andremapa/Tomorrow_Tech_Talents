package com.andremapa.modulo2_POOI.extra.gameOne.models;

import com.andremapa.modulo2_POOI.extra.gameOne.utils.TypeAttack;

import java.util.Random;

public class CharacterModel {

    private String name;
    private int healthPoints;
    private TypeAttack typeAttack;
    private int baseDamage;
    private TypeAttack weakness;

    public CharacterModel(String name, int healthPoints, TypeAttack typeAttack, int baseDamage, TypeAttack weakness){
        this.name = name;
        this.healthPoints = healthPoints;
        this.typeAttack = typeAttack;
        this.baseDamage = baseDamage;
        this.weakness = weakness;
    }

    protected void addHealth(int value){
         this.healthPoints += value;
    }

    protected void removeHealth(int value){
        this.healthPoints -= value;
    }

    protected int generateNumber(){
        Random random = new Random();
        return random.nextInt(4)+1;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public TypeAttack getTypeAttack() {
        return typeAttack;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public TypeAttack getWeakness() {
        return weakness;
    }

    public void isDead(){
        if (getHealthPoints() <= 0){
            System.out.printf("%s is dead!", getName());
        }
    }
}
