package com.andremapa.modulo3_POOII.exercicio1;

public class Division implements Calculation{

    @Override
    public Double calculate(Double... numbers) {
        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result /= numbers[i];
        }
        return result;
    }
}
