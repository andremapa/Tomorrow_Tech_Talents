package com.andremapa.extras.game.models;

import java.util.Random;

public class Player {

    private int id;
    private String name;
    private String nickname;
    private String birthdate;
    private int number;
    private String position;
    private int quality;
    private int yellowCards;
    private int redCards;
    private boolean suspended;
    private boolean trained = false;

    public Player(int id, String name, String nickname, String birthdate, int number,
                  String position, int quality) {
        this.id = id;
        this.name = name;
        this.nickname = nickname;
        this.birthdate = birthdate;
        this.number = number;
        this.position = position;
        this.quality = quality;
        this.yellowCards = 0;
        this.redCards = 0;
        this.suspended = false;
    }

    public void addRedCard(){
        redCards++;
        if (redCards >= 1){
            suspended = true;
        }
    }

    public void addYellowCard(int quantity){
        yellowCards += quantity;
        if (yellowCards >= 3){
            suspended = true;
        }
    }

    public void cancelSuspension(){
        yellowCards = 0;
        redCards = 0;
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

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNickname() {
        return nickname;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public int getNumber() {
        return number;
    }

    public String getPosition() {
        return position;
    }

    public int getQuality() {
        return quality;
    }

    public int getYellowCards() {
        return yellowCards;
    }

    public int getRedCards() {
        return redCards;
    }

    public boolean isSuspended() {
        return suspended;
    }

    public boolean isTrained() {
        return trained;
    }

    public void setTrained(boolean trained) {
        this.trained = trained;
    }

    @Override
    public String toString(){
        if (!suspended && yellowCards < 3 && redCards == 0) {
            return position + ": " + id + " - " + name + " ("+ nickname +") " + " - " + birthdate + " quality: " + quality + " CONDITION: CAN PLAY";
        }
        return position + ": " + id + " - " + name + " ("+ nickname +") " + " - " + birthdate + " quality: " + quality + " CONDITION: CAN NOT PLAY";
    }
}
