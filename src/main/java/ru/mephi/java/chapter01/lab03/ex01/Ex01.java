package ru.mephi.java.chapter01.lab03.ex01;

public class Ex01 {


    public static Employee[] testCreateEmployees() {
        Employee[] emps = new Employee[10];
        for (int i = 0; i < 10; i++) {
            emps[i] = new Employee(i);
        }
        return emps;
    }

    public static void main(String[] args) {
        Employee[] employees = testCreateEmployees();
        for (Employee workers : employees) {
            System.out.println(workers.toString());
        }
        System.out.println("\nAverage salary: " + Employee.average(employees));
    }

}
