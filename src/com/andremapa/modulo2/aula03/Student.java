package com.andremapa.modulo2.aula03;

import java.util.Arrays;
import java.util.OptionalDouble;

public class Student extends Person {

    private int ages;
    private String team;
    private int[] notesPerSubject;

    public Student(String name, String cpf, String rg, int ages, String team, int[] notesPerSubject) {
        super(name, cpf, rg);
        this.ages = ages;
        this.team = team;
        this.notesPerSubject = notesPerSubject;
    }

    public Student setAges(int ages) {
        this.ages = ages;
        return this;
    }

    public Student setTeam(String team) {
        this.team = team;
        return this;
    }

    public Student setNotesPerSubject(int[] notesPerSubject) {
        this.notesPerSubject = notesPerSubject;
        return this;
    }

    public void calculateAverage(){
        OptionalDouble average = Arrays.stream(notesPerSubject).average();
        System.out.println(average);
    }

    @Override
    public String toString() {
        return "Student{" +
                super.toString() +
                " ages=" + ages +
                ", team='" + team + '\'' +
                ", notesPerSubject=" + Arrays.toString(notesPerSubject) +
                '}';
    }
}
