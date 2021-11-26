package ru.mephi.java.chapter02.lab06.ex18;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println((Arrays.toString(CustomArrays.repeat(10, 42, Integer[]::new))));
    }
}
