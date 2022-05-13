package com.andremapa.modulo2.exercicio1;

import java.time.LocalDate;
import java.util.Random;

public class Player {
    
    private int id;
    private String name;
    private String nickname;
    private LocalDate birthdate;
    private int number;
    private String position;
    private int quality;
    private int yellowCards;
    private int redCards;
    private boolean suspended;

    boolean trained = false;

    public Player() {}

    public Player(int id, String name, String nickname, LocalDate birthdate, int number,
                  String position, int quality, int yellowCards, int redCards, boolean suspended) {
        this.id = id;
        this.name = name;
        this.nickname = nickname;
        this.birthdate = birthdate;
        this.number = number;
        this.position = position;
        this.quality = quality;
        this.yellowCards = yellowCards;
        this.redCards = redCards;
        this.suspended = suspended;
    }

    public boolean verifyPlayerCondition(){
        return !suspended;
    }

    public void addYellowCard(int quantity){
        yellowCards += quantity;
        if (yellowCards >= 3){
            suspended = true;
        }
    }

    public void addRedCard(){
        redCards++;
        if (redCards >= 1){
            suspended = true;
        }
    }

    public void cancelSuspension(){
        yellowCards = 0;
        redCards =0;
        suspended = false;
    }

    public void getInjured(){
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        if (randomNumber <= 4) {
            quality = (int) (quality - (quality * 0.15));
        } else if (randomNumber <= 14) {
            quality = (int) (quality - (quality * 0.10));
        } else if (randomNumber <= 29) {
            quality = (int) (quality - (quality * 0.05));
        } else if (randomNumber <= 59) {
            if(quality <= 2) {
                quality -= 2;
            }
        } else {
            if(quality <= 1) {
                quality -= 1;
            }
        }
    }

    public void runTraining(){
        if (!trained) {
            Random random = new Random();
            int randomNumber = random.nextInt(2) + 1;
            quality += randomNumber;
            trained = true;
        }
    }

    @Override
    public String toString(){
        if (!suspended && yellowCards < 3 && redCards == 0) {
            return position + ": " + id + " - " + name + " ("+ nickname +") " + " - " + birthdate + " CONDITION: CAN PLAY";
        }
        return position + ": " + id + " - " + name + " ("+ nickname +") " + " - " + birthdate + " CONDITION: CAN NOT PLAY";
    }
}
