package ru.mephi.java.chapter01.lab01.ex01;

// Напишите программу, вводящую целочисленное значение и
// выводящую его в двоичной, восьмеричной и шестнадцатеричной
// форме. Организуйте вывод обратного значения в виде
// шестнадцатеричного числа с плавающей точкой.

import java.util.Scanner;

public class Class01 {
    public static void main(String[] args) {
        System.out.println("Введите целочисленное значение:");
        Scanner in = new Scanner(System.in);

        while (!in.hasNextInt()) {
            System.out.println("Введите корректное значение!");
            in.next();
        }
        int number = in.nextInt();
        System.out.printf("\nДвоичная форма - %s\n", Integer.toBinaryString(number));
        System.out.printf("Восьмеричная форма - %o\n", number);
        System.out.printf("Шестнадцатеричная форма - %x\n", number);
        double hex = 1.0 / number;
        System.out.printf("Шестнадцатеричная форма с плавающей запятой - %a\n", hex);
        System.out.println("\nЗадание выполнено!");
    }
}