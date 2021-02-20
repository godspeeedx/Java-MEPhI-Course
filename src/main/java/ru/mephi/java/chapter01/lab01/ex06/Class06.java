package ru.mephi.java.chapter01.lab01.ex06;

// Напишите программу, вычисляющую факториал n! = 1 х 2 * . . . х n,
// используя класс Biglnteger. Вычислите факториал числа 1000.

import java.math.BigInteger;

public class Class06 {
    public static void main(String[] args) {

        BigInteger factorial = BigInteger.valueOf(1);
        //BigInteger factorial = new BigInteger("1");
        for (int i = 1; i<=1000; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.printf("Факториал числа 1000 - %s\n", factorial.toString());
        System.out.println("\nЗадание выполнено!");
    }
}
