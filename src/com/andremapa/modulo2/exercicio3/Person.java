package com.andremapa.modulo2.exercicio3;

public class Person {

    protected String name;
    protected String cpf;
    protected String rg;

    public Person(String name, String cpf, String rg) {
        this.name = name;
        this.cpf = cpf;
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", cpf: " + cpf + ", rg: " + rg;
    }
}
