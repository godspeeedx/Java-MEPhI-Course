package ru.mephi.java.chapter02.lab05.ex04;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class NoExceptions {

    public Errors readValues(String filename, ArrayList<Double> list) {
        File file = new File(filename);
        if (!file.exists()) {
            return Errors.FILE_NOT_FOUND;
        }
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                String[] str = sc.nextLine().split(", ");
                for (String s : str) {
                    try {
                        list.add(Double.parseDouble(s));
                    } catch (NumberFormatException e) {
                        System.out.println("It's not double - " + e.getMessage());
                    }
                }
            }
        } catch (FileNotFoundException e) {
            return Errors.FILE_NOT_FOUND;
        } catch (NumberFormatException e) {
            return Errors.INCORRECT_FORMAT;
        }
        return Errors.OK;
    }

    public Errors sumOfValues(String filename, ArrayList<Double> list) {
        Errors code = readValues(filename, list);
        if (code == Errors.OK) {
            double sum = 0;
            for (double numb : list) {
                sum += numb;
            }
            list.set(0, sum);
        }
        return code;
    }
}