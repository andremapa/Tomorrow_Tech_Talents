package com.andremapa.modulo3_POOII.exercicio3.exceptions;

public class DatabaseIllegalTransaction extends RuntimeException{
    public DatabaseIllegalTransaction(String message) {
        super(message);
    }
}
