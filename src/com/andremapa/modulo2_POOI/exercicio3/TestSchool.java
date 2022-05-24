package com.andremapa.modulo2_POOI.exercicio3;

import com.andremapa.modulo2_POOI.exercicio3.util.Subject;

import java.util.List;

public class TestSchool {
    public static void main(String[] args) {
        School school = new School();

        System.out.println("===============TEST CREATE STUDENT METHOD===============");
        school.createStudent("Andrew", "xxx", "yyy", 20, "Class A", new int[]{7, 8, 9, 10, 8});
        school.createStudent("Liz", "www", "zzz", 25, "Class A", new int[]{8, 8, 9, 10, 10});
        school.listAllStudent();
        System.out.println("\n===============TEST UPDATE STUDENT METHOD===============");
        school.updateStudent("xxx", "Andrew", "xxx", "yyy", 20, "Class B", new int[]{10, 10, 10, 10, 10});
        school.listAllStudent();
        System.out.println("\n===============TEST DELETE STUDENT METHOD===============");
        school.deleteStudentByCpf("xxx");
        school.listAllStudent();
        System.out.println("========================================================");

        System.out.println("\n===============TEST CREATE EMPLOYEE METHOD===============");
        school.createEmployee("Gerald", "ppp", "ooo", "Director", 2600.89);
        school.createEmployee("Vanda", "uuu", "ttt", "Coordinator", 2790.80);
        school.listAllEmployee();
        System.out.println("\n===============TEST UPDATE EMPLOYEE METHOD===============");
        school.updateEmployee("ppp", "Gerald", "lll", "ooo", "Director", 2499.90);
        school.listAllEmployee();
        System.out.println("\n===============TEST DELETE EMPLOYEE METHOD===============");
        school.deleteEmployeeByCpf("uuu");
        school.listAllEmployee();
        System.out.println("========================================================");

        List<Subject> subjects = List.of(new Subject("English"), new Subject("Math"));
        System.out.println("\n===============TEST CREATE PROFESSOR METHOD===============");
        school.createProfessor("Rodolfo", "aaa", "bbb", 2500.89, new String[]{"Class A", "Class B"}, subjects);
        school.createProfessor("Joao", "ccc", "ddd", 2500.68, new String[]{"Class C", "Class D"}, subjects);
        school.listAllProfessor();
        System.out.println("\n===============TEST UPDATE PROFESSOR METHOD===============");
        school.updateProfessor("aaa", "Rodolfo", "eee", "fff", 3000.00, new String[]{"Class C", "Class B"}, subjects);
        school.listAllProfessor();
        System.out.println("\n===============TEST DELETE PROFESSOR METHOD===============");
        school.deleteProfessorByCpf("ccc");
        school.listAllProfessor();
        System.out.println("========================================================");
    }
}
