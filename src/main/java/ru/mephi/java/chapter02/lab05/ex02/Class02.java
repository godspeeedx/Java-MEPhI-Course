package ru.mephi.java.chapter02.lab05.ex02;

import ru.mephi.java.chapter02.lab05.ex01.Class01;

import java.io.IOException;

public class Class02 {

    public static void main(String[] args) throws IOException {
        double sum = sumOfValues(Class01.getResourcesFilePath() + "lab5.txt");
        //System.out.println(sum);
    }

    public static double sumOfValues(String filename) {
        double resSum;
        resSum = Class01.readValues(filename)
                .stream()
                .mapToDouble(d -> d)
                .sum();
        return resSum;
    }
}
