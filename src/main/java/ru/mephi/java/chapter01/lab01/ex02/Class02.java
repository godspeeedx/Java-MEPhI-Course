package ru.mephi.java.chapter01.lab01.ex02;

// Напишите программу, вводящую целочисленное (как положительное, так
// и отрицательное) значение угла и нормализующую его в пределах от 0
// до 359 градусов. Попробуйте сделать это сначала с помощью операции %,
// а затем метода floorMod().

import java.util.Scanner;

public class Class02 {
    public static void main(String[] args) {
        System.out.println("Введите значение угла:");
        Scanner in = new Scanner(System.in);

        while (!in.hasNextInt()) {
            System.out.println("Введите корректное значение!");
            in.next();
        }
        int angle = in.nextInt();
        System.out.printf("C помощью операции %% - %d\n", ((angle % 360) + 360) % 360);
        System.out.printf("С помощью метода floorMod() - %d\n", Math.floorMod(angle, 360));
        System.out.println("\nЗадание выполнено!");

    }
}
