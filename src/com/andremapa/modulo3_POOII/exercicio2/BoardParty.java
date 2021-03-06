package com.andremapa.modulo3_POOII.exercicio2;

import java.util.ArrayList;
import java.util.List;

public class BoardParty implements IBoard {

    private List<Player> playerList = new ArrayList<>(5);
    private List<CardAttack[]> decks = new ArrayList<>(5);
    private List<CardAttack> field = new ArrayList<>(34);

    public BoardParty( List<Player> playerList) {
        insertDeck(playerList);
    }

    @Override
    public void insertDeck(List<Player> playerList) {
        for (Player p: playerList) {
            decks.add(p.getDeckVersus());
        }
    }

    @Override
    public boolean playACard(ICard iCard, Player player, int mana) {
        if (verifyField()) {
            return mana == player.getMana();
        }
        return false;
    }

    @Override
    public void checkWinner(Player player) {
        removeLoser();
        if (playerList.size() == 1){
            System.out.println("The winner is " + player.getName());
        }
    }

    private void addToField(CardAttack card){
        if (field.size() <= 34){
            field.add(card);
        }
    }

    private boolean verifyField(){
        return field.size() <= 34;
    }

    private void removeLoser(){
        for (Player player: playerList) {
            if (player.getHp() == 0){
                playerList.remove(player);
            }
        }
    }
}
