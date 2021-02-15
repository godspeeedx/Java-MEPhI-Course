package ru.mephi.java.chapter01.lab01.ex07;

// Напишите программу, вводящую два числа в пределах от 0 до 65535, сохраняющую их в переменных типа short
// и вычисляющую их сумму, разность, произведение, частное и остаток без знака, не преобразуя эти величины в тип int.

import java.util.Scanner;

public class Class07 {
    public static void main(String[] args) {

        System.out.println("Введите два числа в пределах от 0 до 65535:");
        Scanner in = new Scanner(System.in);

        short[] numbers = new short[2];
        int i = 0;

        do {
            while (!in.hasNextInt()) {
                System.out.println("Введите корректное значение!");
                in.next();
            }
            numbers[i] = (short) (in.nextInt() - 32768);
            i++;
        } while (i < 2);

    }
}
