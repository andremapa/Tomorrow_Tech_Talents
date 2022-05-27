package com.andremapa.modulo3_POOII.exercicio2.models.cards;

import com.andremapa.modulo3_POOII.exercicio2.interfaces.cards.IGenericCard;
import com.andremapa.modulo3_POOII.exercicio2.models.enuns.TypeCard;

public class GenericCard implements IGenericCard {

    private final String name;
    private final TypeCard type;
    private final int cost;

    public GenericCard(String name, TypeCard type, int cost) {
        this.name = name;
        this.type = type;
        this.cost = cost;
    }

    @Override
    public String getName(){return name;}

    @Override
    public TypeCard getType(){return type;}

    @Override
    public int getCost(){return cost;}
}
