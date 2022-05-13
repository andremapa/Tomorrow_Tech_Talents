package com.andremapa.modulo2.exercicio3;

import com.andremapa.modulo2.exercicio3.util.Subject;

import java.util.ArrayList;
import java.util.List;

public class School {

    private List<Student> studentsList = new ArrayList<>();
    private List<Employee> employeeList = new ArrayList<>();
    private List<Professor> professorList = new ArrayList<>();

    public void createStudent(String name, String cpf, String rg, int age, String team, int[] notes) {
        Student student = new Student(name, cpf, rg, age, team, notes);
        studentsList.add(student);
    }

    public void createEmployee(String name, String cpf, String rg, String role, double salary) {
        Employee employee = new Employee(name, cpf, rg, role, salary);
        employeeList.add(employee);
    }

    public void createProfessor(String name, String cpf, String rg, double salary, String[] teams, List<Subject> subjects) {
        Professor professor = new Professor(name, cpf, rg, salary, teams, subjects);
        professorList.add(professor);
    }

    public void updateStudent(String oldCpf, String name, String cpf, String rg, int age, String team, int[] notes){
        for (Student student : studentsList) {
            if (student.getCpf().equals(oldCpf)){
                student.updateStudent(name, cpf, rg, age, team, notes);
            }
        }
    }

    public void updateEmployee(String oldCpf, String name, String cpf, String rg, String role, double salary){
        for(Employee employee : employeeList){
            if (employee.getCpf().equals(oldCpf)){
                employee.updateEmployee(name, cpf, rg, role, salary);
            }
        }
    }
    public void updateProfessor(String oldCpf, String name, String cpf, String rg, double salary, String[] teams, List<Subject> subjects){
        for (Professor professor : professorList){
            if (professor.getCpf().equals(oldCpf)){
                professor.updateProfessor(name, cpf, rg, salary, teams, subjects);
            }
        }
    }

    public void deleteStudentByCpf(String cpf){
        Student aux = null;
        for(Student student : studentsList){
            if(student.getCpf().equals(cpf)) {aux = student;}
        }
        if (aux!=null){studentsList.remove(aux);}
    }

    public void deleteEmployeeByCpf(String cpf){
        Employee aux = null;
        for(Employee employee : employeeList){
            if(employee.getCpf().equals(cpf)) {aux = employee;}
        }
        if (aux!=null){employeeList.remove(aux);}
    }

    public void deleteProfessorByCpf(String cpf){
        Professor aux = null;
        for(Professor professor : professorList){
            if(professor.getCpf().equals(cpf)) {aux = professor;}
        }
        if (aux!=null){professorList.remove(aux);}
    }

    public void listAllStudent() {
        System.out.println("Student list -> ");
        for (Student student : studentsList) {
            System.out.println(student);
        }
    }

    public void listAllEmployee() {
        System.out.println("Employee list -> ");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    public void listAllProfessor(){
        System.out.println("Professor list -> ");
        for (Professor professor: professorList) {
            System.out.println(professor);
        }
    }
}
