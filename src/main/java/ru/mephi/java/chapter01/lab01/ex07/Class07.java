package ru.mephi.java.chapter01.lab01.ex07;

// Напишите программу, вводящую два числа в пределах от 0 до 65535, сохраняющую их в переменных типа short
// и вычисляющую их сумму, разность, произведение, частное и остаток без знака, не преобразуя эти величины в тип int.

import java.util.Scanner;

public class Class07 {

    public static void main(String[] args) {

        System.out.println("Введите два числа в пределах от 0 до 65535:");
        Scanner in = new Scanner(System.in);

        int number1 = in.nextInt();
        int number2 = in.nextInt();
        short sh1 = ToShort(number1);
        short sh2 = ToShort(number2);

        /*System.out.printf("1 - %d\n", sh1);
        System.out.printf("2 - %d\n", sh2);
        System.out.println(sh1 + sh2);
        System.out.println(sh1 - sh2);*/

        System.out.printf("\nРезультат сложения - %d\n", ToInt(Addition(sh1, sh2)));
        System.out.printf("Результат вычитания - %d\n", ToInt(Subtraction(sh1, sh2)));
        System.out.printf("Результат умножения - %d\n", ToInt(Multiplication(sh1, sh2)));
        System.out.printf("Результат деления - %d\n", ToInt(Division(sh1, sh2)));
        System.out.println("\nЗадание выполнено!");

    }

    public static short ToShort(int number) {
        return (short) (number - 32768);
    }

    public static int ToInt(short number) {
        return (number + 32768);
    }

    public static short Addition(short num1, short num2) {
        return (short) (num1 + num2);
    }

    public static short Subtraction(short num1, short num2) {
        return (short) (num1 - num2);
    }

    public static short Multiplication(short num1, short num2) {
        return (short) (num1 * num2);
    }

    public static short Division(short num1, short num2) {
        return (short) (num1 / num2);
    }

}