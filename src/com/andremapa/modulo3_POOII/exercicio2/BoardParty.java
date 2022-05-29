package com.andremapa.modulo3_POOII.exercicio2;

import java.util.ArrayList;
import java.util.List;

public class BoardParty implements IBoard {

    private List<Player> playerList = new ArrayList<>(5);
    private List<CardAttack[]> decks = new ArrayList<>(5);
    private List<CardAttack> fieldAttack = new ArrayList<>(5);
    private List<CardSpecial> fieldSpecial = new ArrayList<>(2);


    public BoardParty( List<Player> playerList) {
        for (Player p: playerList) {
            decks.add(p.getDeckVersus());
        }
    }

    @Override
    public <T> void insertDeck(T deck) {
        System.out.println("Deck inserted");
    }

    @Override
    public boolean playACard(ICard iCard, Player player, int mana) {
        return mana == player.getMana();
    }

    @Override
    public void checkWinner(Player player) {
        removeLoser();
        if (playerList.size() == 1){
            System.out.println("The winner is " + player.getName());
        }
    }

    private void addToField(CardAttack card){
        if (card instanceof CardSpecial){
            if(fieldSpecial.size() <= 2) {
                fieldSpecial.add((CardSpecial) card);
            }
        } else {
            if (fieldAttack.size() <= 5){
                fieldAttack.add(card);
            }
        }
    }

    private void removeLoser(){
        for (Player player: playerList) {
            if (player.getHp() == 0){
                playerList.remove(player);
            }
        }
    }
}
