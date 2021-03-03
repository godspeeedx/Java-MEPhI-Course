package ru.mephi.java.chapter01.lab01.extra;

//Пользователь вводит числа. Ввод осуществляется до момента, пока пользователь не
//введет что-то отличное от числа. Сохранять числа в массив. По результатам выполнения
//вывести массив.

import java.util.Arrays;
import java.util.Scanner;

public class Extra {
    public static void main(String[] args) {
        System.out.println("Вводите целочисленные значения:");
        Scanner in = new Scanner(System.in);
        int[] array = new int[1];
        int i = 0;
        while (in.hasNextInt()) {
            System.out.println("И еще одно:");
            array = Arrays.copyOf(array, i + 1);
            array[i] = in.nextInt();
            i++;
        }
        System.out.println(Arrays.toString(array));
    }
}
