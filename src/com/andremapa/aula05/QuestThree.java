package com.andremapa.aula05;

public class QuestThree {
    public static void main(String[] args) {

        double[][] numbers = {{37,57},{41,87},{7,99,86}};
        System.out.println(findOutTheLargestNumber(numbers));
    }

    public static double findOutTheLargestNumber(double[][] matrix){
        double largestNumber = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (largestNumber < matrix[i][j]){
                    largestNumber = matrix[i][j];
                }
            }
        }
        return largestNumber;
    }
}
