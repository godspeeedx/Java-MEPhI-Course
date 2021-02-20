package ru.mephi.java.chapter01.lab01.ex10;

// Напишите программу, составляющую произвольную символьную строку из букв и цифр, \
// генерируя произвольное значение типа long и выводя его по основанию 36.

import java.util.Random;

public class Class10 {
    public static void main(String[] args) {
        Random generator = new Random();
        long number = generator.nextLong();
        System.out.println("\n" + Long.toString(number,36));

        System.out.println("\nЗадание выполнено!");
    }
}
