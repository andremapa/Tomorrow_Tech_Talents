package com.andremapa.modulo2.aula03;

import java.util.ArrayList;
import java.util.List;

public class SystemCRUD {

    private final List<Person> list = new ArrayList<>();

    public void create(Person object) {
        list.add(object);
    }

    public void listAll(){
        list.forEach(System.out::println);
    }

    public void listOne(String cpf){
        list.stream().filter(obj -> obj.getCpf().equals(cpf)).forEach(System.out::println);
    }

    public void deleteOne(String cpf){
        list.removeIf(obj -> obj.getCpf().equals(cpf));
        listAll();
    }

    public void updateStudent(String cpf,  int ages, String team, int[] notesPerSubject){
        if (verifyIfExistsPersonByCpf(cpf)){
            list.stream()
                    .filter(obj -> obj.getCpf().equals(cpf) && obj instanceof Student)
                    .map(obj -> ((Student) obj).setAges(ages).setTeam(team).setNotesPerSubject(notesPerSubject))
                    .forEach(System.out::println);
        }
    }

    public void updateEmployer(String cpf, String office, double salary){
        if (verifyIfExistsPersonByCpf(cpf)){
            list.stream()
                    .filter(obj ->  obj.getCpf().equals(cpf) && obj instanceof Employee)
                    .map(obj -> ((Employee)obj).setOffice(office).setSalary(salary))
                    .forEach(System.out::println);
        }
    }

    public void updateTeacher(String cpf, String[] classes, double salary, String[] subjects){
        if (verifyIfExistsPersonByCpf(cpf)){
            list.stream()
                    .filter(obj ->  obj.getCpf().equals(cpf) && obj instanceof Teacher)
                    .map(obj -> ((Teacher)obj).setSalary(salary).setSubjects(subjects).setClasses(classes))
                    .forEach(System.out::println);
        }
    }

    public boolean verifyIfExistsPersonByCpf(String cpf){
       return list.stream().anyMatch(obj ->  obj.getCpf().equals(cpf));
    }
}

