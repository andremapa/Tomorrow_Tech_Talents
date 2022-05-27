package com.andremapa.modulo3_POOII.exercicio2.models.boards;

import com.andremapa.modulo3_POOII.exercicio2.interfaces.board.IBoard;
import com.andremapa.modulo3_POOII.exercicio2.models.cards.CardAttack;

import com.andremapa.modulo3_POOII.exercicio2.models.player.Player;


public class VersusBoard implements IBoard {

    @Override
    public void insertDeck() {

    }

    @Override
    public boolean canBePlayed(CardAttack cardAttack, int mana) {
        return false;
    }

    @Override
    public boolean playerWin(Player player) {
        return false;
    }
}
