package com.andremapa.modulo3_POOII.exercicio2;

import java.util.List;

public interface IBoard {
    void insertDeck(List<Player> playerList);
    boolean playACard(ICard iCard, Player player, int mana);
    void checkWinner(Player player);
    default boolean verifyTheDeckSize(CardAttack[] deck, int lengthExpected){
         return deck.length == lengthExpected;
     }
}
