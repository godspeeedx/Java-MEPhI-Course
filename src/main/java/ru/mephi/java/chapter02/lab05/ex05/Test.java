package ru.mephi.java.chapter02.lab05.ex05;

import ru.mephi.java.chapter02.lab05.ex01.Class01;

import java.io.IOException;

public class Test {

    private static final String basePath = Class01.getResourcesFilePath();
    private static final String filenameFrom = basePath.concat("lab5.txt");
    private static final String filenameTo = basePath.concat("lab5ex05.txt");

    public static void main(String[] args) throws Exception {
        Class05 class05 = new Class05();
        class05.method(filenameFrom, filenameTo);
    }

}
