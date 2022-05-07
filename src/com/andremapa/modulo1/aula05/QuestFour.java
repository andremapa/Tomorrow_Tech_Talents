package com.andremapa.modulo1.aula05;

public class QuestFour {
    public static void main(String[] args) {

        int[][] numbers = {{1,5,6},{1,2},{8,9,7,4}};
        System.out.println(findOutTheLargestNumber(numbers));
    }

    public static int findOutTheLargestNumber(int[][] matrix){
        int sum = 0;
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                sum += anInt;
            }
        }
        return sum;
    }
}
