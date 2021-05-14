package ru.mephi.java.chapter01.lab03.ex07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Class07 {
    public static void main(String[] args) {
        ArrayList<String> array = testArrList(new String[]{"First", "Second", "Third", "Fourth", "Fifth"});
        luckySort(array, Comparator.comparing(String::length));
        array.forEach(System.out::println);
    }

    public static void luckySort(ArrayList<String> strings, Comparator<String> comparator) {
        int i = 0;
        while (i < strings.size() - 1) {
            if (comparator.compare(strings.get(i + 1), strings.get(i)) > 0) {
                Collections.shuffle(strings);
                i = -1;
            }
            i++;
        }
    }

    public static ArrayList<String> testArrList(String[] strArr) {
        return new ArrayList<>(Arrays.asList(strArr));
    }
}
