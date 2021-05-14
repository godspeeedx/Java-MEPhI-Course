package ru.mephi.java.chapter01.lab03.ex02;

public class Employee implements IMeasurable {

    private final static double BASE = 1000;
    private double salary;
    private String name;

    public Employee(double salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    public Employee() {
        this.name = "";
    }

    public String getName() {
        return name;
    }

    @Override
    public double getMeasure() {
        return 0;
    }

    public static double average(IMeasurable[] objects) {
        double res = 0;
        for (IMeasurable obj : objects) {
            res += obj.getMeasure();
        }
        return res / objects.length;
    }

    public static IMeasurable largest(IMeasurable[] objects) {
        IMeasurable largestSalaryEmployee = new Employee();
        double maxSalary = 0;
        for (IMeasurable obj : objects) {
            if (maxSalary < obj.getMeasure()) {
                maxSalary = obj.getMeasure();
                largestSalaryEmployee = obj;
            }
        }
        return largestSalaryEmployee;
    }

}
