package ru.mephi.java.chapter01.lab01.ex05;

// Что произойдет, если привести числовое значение типа double к значению типа int,
// которое больше самого большого значения типа int? Попробуйте сделать это.

public class Class05 {
    public static void main(String[] args) {
        System.out.printf("\nСамое большое значение типа int - %d\n", Integer.MAX_VALUE);
        double x = Integer.MAX_VALUE * 1.5;
        System.out.printf("Это значние, увеличенное на 1.0 типа double - %f, типа int - %d\n", x, (int)x);
        double y = Integer.MAX_VALUE + 7000000000.0;
        System.out.printf("Это значние, увеличенное на 7000000000.0 типа double - %f, типа int - %d\n", y, (int)y);
        System.out.println("\nЗадание выполнено!");
    }
}
