package ru.mephi.java.chapter01.lab01.ex08;

//Напишите программу, вводящую символьную строку и выводящую все ее непустые подстроки.

import java.util.Scanner;

public class Class08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку:");
        String stroka = in.nextLine();
        for (int i = 0; i < stroka.length(); i++) {
            if (!Character.isSpaceChar(stroka.charAt(i))) {
                for (int j = stroka.length(); j > i; j--) {
                    if (!Character.isSpaceChar(stroka.charAt(j - 1))) {
                        System.out.println(stroka.substring(i, j));
                    }
                }
            }
        }
        System.out.println("\nЗадание выполнено!");
    }
}
