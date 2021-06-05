package ru.mephi.java.chapter01.lab03.ex12;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

public class Class12 {
    public static void main(String[] args) {
        File[] files = getDirFiles("D:\\");
        filesSort(files);
        for (File file : files) {
            System.out.println(file);
        }
    }

    public static void filesSort(File[] filesArr) {

        Arrays.sort(filesArr, Comparator.comparing(File::isDirectory).thenComparing(File::getName));
    }

    public static File[] getDirFiles(String dir) {
        return (new File(dir)).listFiles();
    }
}