package com.andremapa.modulo3_POOII.exercicio2;

import com.andremapa.modulo3_POOII.exercicio2.enuns.EffectCard;
import com.andremapa.modulo3_POOII.exercicio2.enuns.TypeCard;

public class CardSpecial extends CardAttack{

    private final EffectCard effectCard;

    public CardSpecial(String name, int cost, TypeCard typeCard, int cardAttack, int cardResistance, EffectCard effectCard) {
        super(name, cost, typeCard, cardAttack, cardResistance);
        this.effectCard = effectCard;
    }

    public EffectCard getEffectCard() {
        return effectCard;
    }
}
