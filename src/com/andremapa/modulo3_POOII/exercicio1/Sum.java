package com.andremapa.modulo3_POOII.exercicio1;

public class Sum implements Calculation{

    @Override
    public Double calculate(Double... numbers) {
        double result = 0;
        for (Double number: numbers) {
            result += number;
        }
        return result;
    }
}
