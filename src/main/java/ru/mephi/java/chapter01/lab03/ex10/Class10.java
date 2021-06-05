package ru.mephi.java.chapter01.lab03.ex10;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;


public class Class10 {
    public static void main(String[] args) {
        //System.out.println(allSubcatalogs("C:\\"));
        System.out.println(allSubcatalogsLambda("C:\\"));
        System.out.println(allSubcatalogsLambda2("C:\\empty\\"));
        //System.out.println(allSubcatalogsAnon("C:\\"));
    }

    public static ArrayList<File> allSubcatalogs(String catalog) {
        File currCatalog = new File(catalog);
        ArrayList<File> subCatalogs = new ArrayList<>();
        if (currCatalog.isDirectory()) {
            for (File item : Objects.requireNonNull(currCatalog.listFiles())) {
                if (item.isDirectory()) {
                    subCatalogs.add(item);
                }
            }
        } else {
            throw new IllegalArgumentException("The input parameter is not a catalog!");
        }
        return subCatalogs;
    }

    public static ArrayList<File> allSubcatalogsLambda(String catalog) {
        File currCatalog = new File(catalog);
        /*ArrayList<File> subCatalogs = new ArrayList<>();
        for (File item : Objects.requireNonNull(currCatalog.listFiles(pathname -> pathname.isDirectory()))) {             //File::isDirectory()
            subCatalogs.add(item);
        }
        return subCatalogs;*/
        return new ArrayList<>(Arrays.asList(Objects.requireNonNull(currCatalog.listFiles(File::isDirectory))));
    }

    public static ArrayList<File> allSubcatalogsLambda2(String catalog) {
        File currCatalog = new File(catalog);
        /*ArrayList<File> subCatalogs = new ArrayList<>();
        for (File item : Objects.requireNonNull(currCatalog.listFiles(pathname -> pathname.isDirectory()))) {             //File::isDirectory()
            subCatalogs.add(item);
        }
        return subCatalogs;*/
        return new ArrayList<>(Arrays.asList(Objects.requireNonNull(currCatalog.listFiles(File::isDirectory))));
    }

    public static ArrayList<File> allSubcatalogsAnon(String catalog) {
        File currCatalog = new File(catalog);
        ArrayList<File> subCatalogs = new ArrayList<>();
        for (File item : Objects
                .requireNonNull(currCatalog.listFiles(new FileFilter() {
                    @Override
                    public boolean accept(File pathname) {
                        return pathname.isDirectory();
                    }
                }))
        ) {
            subCatalogs.add(item);
        }
        return subCatalogs;
    }
}
