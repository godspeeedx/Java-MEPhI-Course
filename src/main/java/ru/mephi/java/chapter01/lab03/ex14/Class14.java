package ru.mephi.java.chapter01.lab03.ex14;


import ru.mephi.java.chapter01.lab03.ex02.Employee;

import java.util.Arrays;
import java.util.Comparator;


public class Class14 {
    public static void main(String[] args) {
        Employee[] empArr = new Employee[]{
                new Employee(1000,"aaa"),
                new Employee(2000,"bbbbb"),
                new Employee(3000,"c"),
                new Employee(3000,"ddddddddd"),
                new Employee(4000,"g")};
        printEmployees(empArr);
        //cleverEmployeeSort(empArr);
        cleverEmployeeSortReversed(empArr);
        printEmployees(empArr);
    }

    public static void cleverEmployeeSort(Employee[] empArr) {
        Arrays.sort(empArr, Comparator.comparing(Employee::getMeasure).thenComparing(Employee::getName));
    }

    public static void cleverEmployeeSortReversed(Employee[] empArr) {
        Arrays.sort(empArr, Comparator.comparing(Employee::getMeasure).thenComparing(Employee::getName).reversed());
    }

    public static void printEmployees(Employee[] empArr) {
        for (Employee emp : empArr) {
            System.out.format("Name: %s, salary: %s%n", emp.getName(), emp.getMeasure());
        }
        System.out.println();
    }
}