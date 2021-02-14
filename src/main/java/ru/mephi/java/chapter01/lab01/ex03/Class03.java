package ru.mephi.java.chapter01.lab01.ex03;

//Напишите программу, вводящую три целочисленных значения и выводящую самое большое из них,
// используя только условную операцию. Сделайте то же самое с помощью метода Math.mах ().

import java.util.Scanner;

public class Class03 {
    public static void main(String[] args) {

        System.out.println("Введите три целочисленных значения:");
        Scanner in = new Scanner(System.in);

        int numbers[] = new int[3];
        int i = 0;

        do {
            while (!in.hasNextInt()) {
                System.out.println("Введите корректное значение!");
                in.next();
            }
            numbers[i] = in.nextInt();
            i++;
        } while (i < 3);


    }
}