package com.andremapa.modulo2_POOI.exercicio3;

public class Employee extends Person{

    protected String role;
    protected double salary;

    public Employee(String name, String cpf, String rg, String role, double salary) {
        super(name, cpf, rg);
        this.role = role;
        this.salary = salary;
    }

    public void updateEmployee(String name, String cpf, String rg, String role, double salary){
        this.name = name;
        this.cpf = cpf;
        this.rg = rg;
        this.role = role;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", role: " + role + ", salary: " + salary;
    }
}
