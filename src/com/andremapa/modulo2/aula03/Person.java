package com.andremapa.modulo2.aula03;

public abstract class Person {

    private String name;
    private String cpf;
    private String rg;

    protected Person(String name, String cpf, String rg) {
        this.name = name;
        this.cpf = cpf;
        this.rg = rg;
    }

    protected String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'';
    }
}
