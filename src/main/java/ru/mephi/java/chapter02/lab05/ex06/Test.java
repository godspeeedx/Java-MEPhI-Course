package ru.mephi.java.chapter02.lab05.ex06;

import ru.mephi.java.chapter02.lab05.ex01.Class01;

public class Test {

    private static final String pathToFile = Class01.getResourcesFilePath().concat("lab6.txt");

    public static void main(String[] args) {
        Class06 task06 = new Class06();
        System.out.println(task06.readSomething1(pathToFile));
        System.out.println(task06.readSomething2(pathToFile));
        System.out.println(task06.readSomething3(pathToFile));
    }

}
