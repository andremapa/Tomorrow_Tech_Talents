package com.andremapa.modulo3_POOII.exercicio2;

import com.andremapa.modulo3_POOII.exercicio2.enuns.TypeCard;

public class CardAttack implements ICard{

    protected String name;
    protected int cost;
    protected TypeCard typeCard;
    protected int cardAttack;
    protected int cardResistance;

    public CardAttack(String name, int cost, TypeCard typeCard, int cardAttack, int cardResistance) {
        this.name = name;
        this.cost = cost;
        this.typeCard = typeCard;
        this.cardAttack = cardAttack;
        this.cardResistance = cardResistance;
    }

    public int getCardAttack() {
        return cardAttack;
    }

    public int getCardResistance() {
        return cardResistance;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public TypeCard cardType() {
        return typeCard;
    }
}
