package com.andremapa.modulo3_POOII.exercicio2.models.cards;

import com.andremapa.modulo3_POOII.exercicio2.interfaces.cards.ICardSpecial;
import com.andremapa.modulo3_POOII.exercicio2.models.enuns.EffectCard;
import com.andremapa.modulo3_POOII.exercicio2.models.enuns.TypeCard;

public class CardSpecial extends CardAttack implements ICardSpecial {

    private final EffectCard effect;

    public CardSpecial(String name, TypeCard type, int cost, int power, int resistance, EffectCard effect) {
        super(name, type, cost, power, resistance);
        this.effect = effect;
    }

    @Override
    public EffectCard getEffect() {
        return effect;
    }
}
