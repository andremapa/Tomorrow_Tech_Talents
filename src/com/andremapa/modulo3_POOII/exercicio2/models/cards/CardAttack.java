package com.andremapa.modulo3_POOII.exercicio2.models.cards;

import com.andremapa.modulo3_POOII.exercicio2.interfaces.cards.ICardAttack;
import com.andremapa.modulo3_POOII.exercicio2.models.enuns.TypeCard;

public class CardAttack extends GenericCard implements ICardAttack {

    private final int power;
    private final int resistance;

    public CardAttack(String name, TypeCard type, int cost, int power, int resistance) {
        super(name, type, cost);
        this.power = power;
        this.resistance = resistance;
    }

    @Override
    public int getPower() {return power;}

    @Override
    public int getResistance() {return resistance;}
}
