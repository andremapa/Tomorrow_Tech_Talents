package com.andremapa.modulo3_POOII.exercicio2.interfaces.board;

import com.andremapa.modulo3_POOII.exercicio2.models.cards.CardAttack;
import com.andremapa.modulo3_POOII.exercicio2.models.player.Player;

import java.util.List;

public interface IBoard {

    void insertDeck();
    boolean canBePlayed(CardAttack cardAttack, int mana);
    boolean playerWin(Player player);
}
