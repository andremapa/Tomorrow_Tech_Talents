package com.andremapa.modulo2_POOI.exercicio3;

public class Student extends Person{

    private int age;
    private String team;
    private int[] notes;

    public Student(String name, String cpf, String rg, int age, String team, int[] notes) {
        super(name, cpf, rg);
        this.age = age;
        this.team = team;
        this.notes = notes;
    }

    public void updateStudent(String name, String cpf, String rg, int age, String team, int[] notes) {
        this.name = name;
        this.cpf = cpf;
        this.rg = rg;
        this.age = age;
        this.team = team;
        this.notes = notes;
    }

    @Override
    public String toString() {
        return super.toString() + ", age: " + age + ", team: " + team + ", notes: " + printNotes();
    }

    private String printNotes(){
        StringBuilder result = new StringBuilder();
        for (int note : notes) {
            result.append(note).append(" ");
        }
        return result.toString();
    }
}
