package com.andremapa.modulo2.aula03;

public class SystemApplication {

    public static void main(String[] args) {
        SystemCRUD systemCRUD = new SystemCRUD();

        Student andrew = new Student("Andrew", "xxx", "xxx", 20, "3°ano", new int[]{8, 5, 6, 7, 9});
        Employee rodolfo = new Employee("Rodolfo", "yyy", "yyy", "Let's Code", 3250.68);
        Employee eder = new Employee("Eder", "xxx", "yyy", "Let's Code", 3250.68);
        Teacher joao = new Teacher("Joao", "www", "www", new String[]{"1° ano", "2° ano", "3°ano"}, 3250.68, new String[]{"Coding Tank", "Tomorrow"});

        systemCRUD.create(andrew);
        systemCRUD.create(rodolfo);
        systemCRUD.create(eder);
        systemCRUD.create(joao);
        System.out.println();

        systemCRUD.listAll();
        System.out.println();

        systemCRUD.listOne("xxx");
        systemCRUD.listOne("www");
        System.out.println();

        systemCRUD.deleteOne("yyy");
        System.out.println();

        systemCRUD.updateEmployer("xxx", "Santander", 5630.89);
        System.out.println();

        andrew.calculateAverage();
        System.out.println();
    }
}
