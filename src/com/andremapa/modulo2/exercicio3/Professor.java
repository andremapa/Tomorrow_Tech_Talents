package com.andremapa.modulo2.exercicio3;

import com.andremapa.modulo2.exercicio3.util.Subject;

import java.util.List;

public class Professor extends Employee{

    private String[] teams;
    private List<Subject> subjects;

    public Professor(String name, String cpf, String rg, double salary, String[] teams, List<Subject> subjects) {
        super(name, cpf, rg, "Professor", salary);
        this.teams = teams;
        this.subjects = subjects;
    }

    public void updateProfessor(String name, String cpf, String rg, double salary, String[] teams, List<Subject> subjects){
        this.name = name;
        this.cpf = cpf;
        this.rg = rg;
        this.salary = salary;
        this.teams = teams;
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return super.toString() + ", teams: " + printTeams() + ", subjects: " + printSubjects();
    }

    private String printTeams(){
        StringBuilder result = new StringBuilder();
        for (String team: teams) {
            result.append(team).append(" ");
        }
        return result.toString();
    }

    private String printSubjects(){
        StringBuilder result = new StringBuilder();
        for (Subject subject: subjects){
            result.append(subject.getName()).append(" ");
        }
        return result.toString();
    }
}
