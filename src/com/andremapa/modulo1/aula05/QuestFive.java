package com.andremapa.modulo1.aula05;

public class QuestFive {
    public static void main(String[] args) {
        double[][] numbers = {{1,2},{3,1,2},{4,5}};
        System.out.println(findTheAverageOnRow(numbers, 0));
    }

    public static double findTheAverageOnRow(double[][] matrix, int row){
        double average = 0;
        for (int i = 0; i < matrix[row].length; i++) {
            average += matrix[row][i];
        }
        return average/ matrix[row].length;
    }
}
