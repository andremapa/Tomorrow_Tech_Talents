package com.andremapa.modulo1.aula05;

import java.util.Random;

public class QuestOne {
    public static void main(String[] args) {

        Random random = new Random();
        double[] randomNumber = new double[10];

        for (int i = 0; i < randomNumber.length; i++) {
            randomNumber[i] = random.nextDouble() * 100;
            System.out.println("Real number up to 100: " + randomNumber[i]);
        }
    }
}
