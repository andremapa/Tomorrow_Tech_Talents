package com.andremapa.modulo2.aula03;

public class Employee extends Person{

    private String office;
    private double salary;

    public Employee(String name, String cpf, String rg, String office, double salary) {
        super(name, cpf, rg);
        this.office = office;
        this.salary = salary;
    }

    public Employee setOffice(String office) {
        this.office = office;
        return this;
    }

    public Employee setSalary(double salary) {
        this.salary = salary;
        return this;
    }

    @Override
    public String toString() {
        return "Employee{" +
                super.toString() +
                " office='" + office + '\'' +
                ", salary=" + salary +
                '}';
    }
}
