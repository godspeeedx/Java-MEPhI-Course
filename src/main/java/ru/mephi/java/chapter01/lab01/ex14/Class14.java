package ru.mephi.java.chapter01.lab01.ex14;

//Напишите программу, вводящую двумерный массив целочисленных значений и определяющую, содержится ли в нем магический
// квадрат (т.е. одинаковая сумма значений во всех строках, столбцах и диагоналях). Принимая строки вводимых данных,
// разбивайте их на отдельные целочисленные значения, прекратив этот процесс, когда пользователь введет пустую строку.
// Например, на следующие вводимые данные:
// 16 3 2 13
// 3 10 11 8
// 9 6 7 12
// 4 15 14 1
// (Пустая строка)
// программа должна ответить утвердительно.

import java.util.ArrayList;
import java.util.Scanner;

public class Class14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> rectangle = new ArrayList<>();
        for (String line = in.nextLine();!line.isEmpty(); line = in.nextLine()) {

        }
    }
}
