package ru.mephi.java.chapter01.lab03.Examples.exmpl1;

import java.util.Scanner;

public class TestExmpl1 {
    public static void main(String[] args) {
        English eng = new English();
        Russian rus = new Russian();
        German ger = new German();
        Scanner in = new Scanner(System.in);

        while (!in.hasNextInt()) {
            System.out.println("Введите цифру");
            in.next();
        }

        polymorph(in.nextInt(), eng, rus, ger);
        polymorphDifference(in.nextInt(), eng, rus);
        polymorphDifference(in.nextInt(), ger, eng);

    }

    public static void polymorph(int number, Digit... digits) {
        for (int i = 0; i < digits.length; i++) {
            System.out.println(digits[i].getName(number));
        }
    }

    public static int polymorphDifference(int number, Digit first, Digit second) {
        return Math.abs(first.getName(number).length() - second.getName(number).length());
    }

}
