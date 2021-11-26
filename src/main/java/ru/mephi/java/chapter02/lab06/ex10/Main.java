package ru.mephi.java.chapter02.lab06.ex10;

public class Main {
    public static void main(String[] args) {
        Integer[] ints = new Integer[]{1, 1, 3, 5, 8, 13, 21, 34, 55, -55, 0};
        System.out.println(CustomArrays.max(ints));
        System.out.println(CustomArrays.min(ints));
    }
}
