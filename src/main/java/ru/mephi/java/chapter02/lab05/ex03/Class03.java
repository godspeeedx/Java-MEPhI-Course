package ru.mephi.java.chapter02.lab05.ex03;

import ru.mephi.java.chapter02.lab05.ex01.Class01;
import ru.mephi.java.chapter02.lab05.ex02.Class02;

import java.io.IOException;

public class Class03 {

    public static void main(String[] args) throws IOException {
        printSumOfDoublesInFile(Class01.getResourcesFilePath() + "lab5.txt");
    }

    public static void printSumOfDoublesInFile(String filename) throws IOException {
        System.out.println(Class02.sumOfValues(filename));
    }

}
