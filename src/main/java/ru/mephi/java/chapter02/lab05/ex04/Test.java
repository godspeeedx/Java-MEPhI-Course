package ru.mephi.java.chapter02.lab05.ex04;

import ru.mephi.java.chapter02.lab05.ex01.Class01;

import java.util.ArrayList;

public class Test {

    private static final String basePath = Class01.getResourcesFilePath();
    private static final String filename = basePath.concat("lab5.txt");

    public static void main(String[] args) {
        NoExceptions obj = new NoExceptions();
        ArrayList<Double> list = new ArrayList<>();

        if (obj.sumOfValues(filename, list) == Errors.OK){
            System.out.println("Sum = " + list.get(0));
        } else {
            System.out.println(obj.sumOfValues(filename, list));
        }
    }
}