package ru.mephi.java.chapter01.lab01.ex14;

//Напишите программу, вводящую двумерный массив целочисленных значений и определяющую, содержится ли в нем магический
// квадрат (т.е. одинаковая сумма значений во всех строках, столбцах и диагоналях). Принимая строки вводимых данных,
// разбивайте их на отдельные целочисленные значения, прекратив этот процесс, когда пользователь введет пустую строку.
// Например, на следующие вводимые данные:
// 16 3 2 13
// 5 10 11 8
// 9 6 7 12
// 4 15 14 1
// (Пустая строка)
// программа должна ответить утвердительно.

import java.util.ArrayList;
import java.util.Scanner;

public class Class14 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = Matrix();

        if (!IsSquare(arr)) {
            System.out.println("Матрица не квадратная!");
            return;
        }
        if (!IsEmpty(arr)) {
            System.out.println("Пустой ввод!");
            return;
        }
        if (IsMagic(arr))
            System.out.println("Введенный квадрат действительно магический!");
        else System.out.println("Введеная матрица не квадратная");

        System.out.println("\nЗадание выполнено!");
    }

    public static ArrayList<ArrayList<Integer>> Matrix() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите несколько строк, разделенных пробелом:");
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for (; ; ) {
            String inStr = in.nextLine();
            if ("".equals(inStr)) {
                return arr;
            }
            String[] splittedStr = inStr.split(" ");
            ArrayList<Integer> subArr = new ArrayList<>();
            for (String s : splittedStr) {
                subArr.add(Integer.parseInt(s));
            }
            arr.add(subArr);
        }

    }

    public static boolean IsEmpty(ArrayList<ArrayList<Integer>> arr) {
        return arr.size() != 0;
    }

    public static boolean IsSquare(ArrayList<ArrayList<Integer>> arr) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.size() != arr.get(i).size())
                return false;
        }
        return true;
    }

    public static boolean IsMagic(ArrayList<ArrayList<Integer>> arr) {
        return RowsCheckSum(arr) && ColumnsCheckSum(arr) && DiagonalsCheckSum(arr);
    }

    public static boolean RowsCheckSum(ArrayList<ArrayList<Integer>> arr) {
        int buffSum = 0;
        for (int i = 0; i < arr.get(0).size(); i++) {
            buffSum += arr.get(0).get(i);
        }
        for (int i = 1; i < arr.size(); i++) {
            int rowSum = 0;
            for (int j = 0; j < arr.get(i).size(); j++) {
                rowSum += arr.get(i).get(j);
            }
            if (rowSum != buffSum)
                return false;
        }
        return true;
    }

    public static boolean ColumnsCheckSum(ArrayList<ArrayList<Integer>> arr) {
        int buffSum = 0;
        for (ArrayList<Integer> i : arr) {
            buffSum += i.get(0);
        }
        for (int i = 1; i < arr.size(); i++) {
            int colSum = 0;
            for (ArrayList<Integer> n : arr) {
                colSum += n.get(i);
            }
            if (colSum != buffSum)
                return false;
        }
        return true;
    }

    public static boolean DiagonalsCheckSum(ArrayList<ArrayList<Integer>> arr) {
        int firstSum = 0, secondSum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size(); j++) {
                if (i == j)
                    firstSum += arr.get(i).get(j);
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            for (int j = arr.size() - 1; j >= 0; j--) {
                if (j == arr.size() - 1 - i)
                    secondSum += arr.get(i).get(j);
            }
        }
        return firstSum == secondSum;
    }

}
