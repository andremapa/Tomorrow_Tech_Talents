package com.andremapa.modulo3_POOII.exercicio3.domain.models;

import java.time.LocalDate;

public class Document {

    private String name;
    private String rg;
    private String cpf;
    private final LocalDate birthdate;

    public Document(String name, String rg, String cpf, LocalDate birthdate) {
        this.name = name;
        this.rg = rg;
        this.cpf = cpf;
        this.birthdate = birthdate;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }
}
