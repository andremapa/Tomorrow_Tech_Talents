package com.andremapa.modulo3_POOII.exercicio2;

public class Player {

    private String name;
    private int hp;
    private int mana;
    private CardAttack[] deckVersus;
    private CardAttack[] deckParty;

    public Player(String name, int hp, int mana, CardAttack[] deckVersus, CardAttack[] deckParty) {
        this.name = name;
        this.hp = hp;
        this.mana = mana;
        this.deckVersus = deckVersus;
        this.deckParty = deckParty;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getMana() {
        return mana;
    }

    public CardAttack[] getDeckVersus() {
        return deckVersus;
    }

    public CardAttack[] getDeckParty() {
        return deckParty;
    }

}
