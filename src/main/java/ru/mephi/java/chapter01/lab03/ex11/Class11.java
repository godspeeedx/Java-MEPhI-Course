package ru.mephi.java.chapter01.lab03.ex11;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class Class11 {
    public static void main(String[] args) {
        System.out.println(getFilesWithExtentionLambda("D:\\", "fb2"));
    }

    public static ArrayList<File> getFilesWithExtentionLambda(String dir, String ext) {
        File f = new File(dir);
        ArrayList<File> requiredFiles = new ArrayList<>();
        Collections.addAll(requiredFiles, Objects
                .requireNonNull(f
                        .listFiles(pathname -> {
                            return (pathname.getName()).endsWith(ext);
                        })));
        return requiredFiles;
    }
}
