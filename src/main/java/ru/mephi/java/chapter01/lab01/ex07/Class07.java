package ru.mephi.java.chapter01.lab01.ex07;

// Напишите программу, вводящую два числа в пределах от 0 до 65535, сохраняющую их в переменных типа short
// и вычисляющую их сумму, разность, произведение, частное и остаток без знака, не преобразуя эти величины в тип int.

import java.util.Scanner;

public class Class07 {
    public static void main(String[] args) {
        short first = inShort(IntWCheck("Введите большее число", 0, 65535));
        short second = inShort(IntWCheck("Введите число-делитель", 0, 65535));

        short sum = summar(first, second);
        short sub = subst(first, second);
        short mult = multix(first, second);
        short div = divide(first, second);
        short mod = modDividing(first, second);
        printRes(sum, sub, mult, div, mod);
    }

    public static int Int(String text) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(text);
            if (sc.hasNextInt() == true)
                break;
            else {
                System.out.println("Wrong input type, try from -2 147 483 648 to 2 147 483 647 ");
                sc.next();
            }
        } while (true);
        int input = sc.nextInt();
        System.out.println("You've printed: " + input);
        //sc.close();
        return input;
    }

    public static int IntWCheck(String text, int min, int max) { // -2 147 483 648 < x < +2 147 483 647
        int input;
        do {
            input = Int(text);
            if (input > min && input < max) break;
            else System.out.println("Please, try values between " + min + " and " + max);
        } while (true);
        return input;
    }

    public static short inShort(int a) {
        return (short) (a + Short.MIN_VALUE);
    }

    public static int shortIn(short a) {
        return a - Short.MIN_VALUE;
    }

    public static short summar(short a, short b) {
        if ((a + b - Short.MIN_VALUE) < -32768 || (a + b - Short.MIN_VALUE) > 32767) {
            return -1;
        } else return (short) (a + b - Short.MIN_VALUE);
    }

    public static short subst(short a, short b) {
        if ((a - b) < 0 || (a - b) > 65535) return -1;
        else return (short) ((a - b) + Short.MIN_VALUE);
    }

    public static short multix(short a, short b) {
        if (((a - Short.MIN_VALUE) * (b - Short.MIN_VALUE)) < 0 || ((a - Short.MIN_VALUE) * (b - Short.MIN_VALUE)) > 65535)
            return -1;
        else return (short) (((a - Short.MIN_VALUE) * (b - Short.MIN_VALUE)) + Short.MIN_VALUE);
    }

    public static short divide(short a, short b) {
        if (b != Short.MIN_VALUE) {
            if (((a - Short.MIN_VALUE) / (b - Short.MIN_VALUE)) < 0 || ((a - Short.MIN_VALUE) / (b - Short.MIN_VALUE)) > 65535) {
                return -1;
            } else {
                return (short) ((a - Short.MIN_VALUE) / (b - Short.MIN_VALUE) + Short.MIN_VALUE);
            }
        } else return -2;
    }

    public static short modDividing(short a, short b) {
        if (b != Short.MIN_VALUE) {
            if ((a - Short.MIN_VALUE) % (b - Short.MIN_VALUE) < 0 || (a - Short.MIN_VALUE) % (b - Short.MIN_VALUE) > 65535) {
                return -1;
            } else {
                return (short) ((a - Short.MIN_VALUE) % (b - Short.MIN_VALUE) + Short.MIN_VALUE);
            }
        } else return -2;
    }

    public static void printRes(short sum, short sub, short mux, short div, short mod) {
        if (sum != -1) {
            System.out.printf("Сумма %d\n", shortIn(sum));
        } else System.out.println("Значение суммы не лежит в заданном диапазоне");

        if (sub != -1) {
            System.out.printf("Разность %d\n", shortIn(sub));
        } else System.out.println("Значение разности не лежит в заданном диапазоне");

        if (mux != -1) {
            System.out.printf("Произведение %d\n", shortIn(mux));
        } else System.out.println("Значение умножения не лежит в заданном диапазоне");

        if (div != -1) {
            if (div != -2) {
                System.out.printf("Частное %d\n", shortIn(div));
            } else System.out.println("Деление на ноль");
        } else System.out.println("Значение деления не лежит в заданном диапазоне");

        if (mod != -1) {
            if (mod != -2) {
                System.out.printf("Остаток %d\n", shortIn(mod));
            } else System.out.println("Деление на ноль");
        } else System.out.println("Значение остатка не лежит в заданном диапазоне");
    }
}
