package ru.mephi.java.chapter01.lab03.ex01;

public class Employee implements IMeasurable {

    private final static double BASE = 1000;
    private double salary;

    public Employee() {
        this.salary = BASE;
    }

    public Employee(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                '}';
    }

    @Override
    public double getMeasure() {
        return this.salary;
    }

    public static double average(IMeasurable[] objects) {
        double res = 0;
        for (IMeasurable obj : objects) {
            res += obj.getMeasure();
        }
        return res / objects.length;
    }

}
