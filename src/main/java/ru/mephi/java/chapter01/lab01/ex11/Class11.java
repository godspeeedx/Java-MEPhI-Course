package ru.mephi.java.chapter01.lab01.ex11;

// Напишите программу, вводящую текстовую строку и выводящую все символы,
// не представленные в коде ASCII, вместе с их значениями в Юникоде.

import java.util.Scanner;

public class Class11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку:");
        String stroka = in.nextLine();
        int[] codePoints = stroka.codePoints().toArray();
        for (int i = 0; i < stroka.codePointCount(0, stroka.length()); i++) {
            if (codePoints[i] >= 128) {
                System.out.printf("Символ - %с, значение в Юникоде - %d\n", stroka.charAt(i), codePoints[i]);
            }
        }
        System.out.println("\nЗадание выполнено!");
    }
}
