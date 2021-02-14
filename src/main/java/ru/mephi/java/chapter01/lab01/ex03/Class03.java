package ru.mephi.java.chapter01.lab01.ex03;

//Напишите программу, вводящую три целочисленных значения и выводящую самое большое из них,
// используя только условную операцию. Сделайте то же самое с помощью метода Math.mах ().

import java.util.Scanner;

public class Class03 {
    public static void main(String[] args) {

        System.out.println("Введите три целочисленных значения:");
        Scanner in = new Scanner(System.in);

        int[] numbers = new int[3];
        int i = 0;

        do {
            while (!in.hasNextInt()) {
                System.out.println("Введите корректное значение!");
                in.next();
            }
            numbers[i] = in.nextInt();
            i++;
        } while (i < 3);

        System.out.printf("\nСамое большое число через условную операцию - %d\n", numbers[0] >= numbers[1] ? numbers[0] : numbers[1] >= numbers[2] ? numbers[1] : numbers[2]);
        System.out.printf("Самое большое число через метод Math.max - %d\n", Math.max(numbers[0], Math.max(numbers[1], numbers[2])));
        System.out.println("\nЗадание выполнено!");
    }
}