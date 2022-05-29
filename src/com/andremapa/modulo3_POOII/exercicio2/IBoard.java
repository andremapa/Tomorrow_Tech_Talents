package com.andremapa.modulo3_POOII.exercicio2;

public interface IBoard {
    <T> void insertDeck(T deck);
    boolean playACard(ICard iCard, Player player, int mana);
    void checkWinner(Player player);
     default boolean verifyTheDeckSize(CardAttack[] deck, int lengthExpected){
         return deck.length == lengthExpected;
     }
}
