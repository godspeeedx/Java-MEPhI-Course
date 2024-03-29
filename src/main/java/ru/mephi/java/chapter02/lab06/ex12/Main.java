package ru.mephi.java.chapter02.lab06.ex12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(3, 4, 3, -5, 6, 10, 23);
        List<Integer> result1 = new ArrayList<>();

        minmax(ints, Comparator.comparingInt(x -> x), result1);
        System.out.println(result1);

    }

    public static <T> void minmax(List<T> elements,
                                  Comparator<? super T> comp, List<? super T> result) {
        if (elements.size() > 0) {
            T min = elements.get(0);
            T max = elements.get(0);
            for (T element : elements) {
                if (comp.compare(element, min) < 0) {
                    min = element;
                }
                if ((comp.compare(element, max) > 0)) {
                    max = element;
                }
            }
            result.add(min);
            result.add(max);
        }
    }
}
