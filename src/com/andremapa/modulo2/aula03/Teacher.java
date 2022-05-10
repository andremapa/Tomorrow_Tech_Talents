package com.andremapa.modulo2.aula03;

import java.util.Arrays;

public class Teacher extends Person{

    private String[] classes;
    private double salary;
    private String[] subjects;

    public Teacher(String name, String cpf, String rg, String[] classes, double salary, String[] subjects) {
        super(name, cpf, rg);
        this.classes = classes;
        this.salary = salary;
        this.subjects = subjects;
    }

    public Teacher setClasses(String[] classes) {
        this.classes = classes;
        return this;
    }

    public Teacher setSalary(double salary) {
        this.salary = salary;
        return this;
    }

    public Teacher setSubjects(String[] subjects) {
        this.subjects = subjects;
        return this;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                super.toString() +
                " classes=" + Arrays.toString(classes) +
                ", salary=" + salary +
                ", subjects=" + Arrays.toString(subjects) +
                '}';
    }
}
