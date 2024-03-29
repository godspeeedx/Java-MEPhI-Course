package ru.mephi.java.chapter02.lab06.ex10;

import java.util.Objects;

public class CustomArrays {

    public CustomArrays() {
    }

    public static <E extends Comparable<? super E>> E min(E[] array) {
        Objects.requireNonNull(array);
        E min = array[0];
        for (E el : array) {
            if (el.compareTo(min) < 0) {
                min = el;
            }
        }
        return min;
    }

    public static <E extends Comparable<? super E>> E max( E[] array) {
        Objects.requireNonNull(array);
        E max = array[0];
        for (E el : array) {
            if (el.compareTo(max) > 0) {
                max = el;
            }
        }
        return max;
    }

}
