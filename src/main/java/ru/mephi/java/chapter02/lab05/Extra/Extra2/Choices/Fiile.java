package ru.mephi.java.chapter02.lab05.Extra.Extra2.Choices;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Fiile implements Choice {
    @Override
    public ArrayList<String> read() throws FileNotFoundException {
        File file = new File("src/main/resources/lab5extra.txt");
        if (!file.exists()) {
            throw new FileNotFoundException("Путь к файлу указан неверно или файл не существует");
        }
        ArrayList<String> arrayList = new ArrayList<>();
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                arrayList.add(sc.nextLine());
            }
        }
        return arrayList;
    }
}
