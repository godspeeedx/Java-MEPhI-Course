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
        ArrayList<ArrayList<Integer>> arr = GetSquareArray();
        if(!CheckContent(arr)){
            System.out.println("Пустой ввод!");
            return;
        }
        if (!CheckSquare(arr)) {
            System.out.println("Not a square!");
            return;
        }
        if (CheckMagic(arr))
            System.out.println("It's magick!");
        else System.out.println("No magick(");
    }

    public static ArrayList<ArrayList<Integer>> GetSquareArray() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter some numbers:");
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

    public static boolean CheckContent(ArrayList<ArrayList<Integer>> arr) {
        return arr.size() != 0;
    }

    public static boolean CheckSquare(ArrayList<ArrayList<Integer>> arr) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.size() != arr.get(i).size())
                return false;
        }
        return true;
    }

    public static boolean CheckMagic(ArrayList<ArrayList<Integer>> arr) {
        return RowsCheckSum(arr) && ColumnsCheckSum(arr) && DiagonalsCheckSum(arr);
    }

    public static boolean RowsCheckSum(ArrayList<ArrayList<Integer>> arr) {
        int row_control_sum = 0;
        for (int i = 0; i < arr.get(0).size(); i++) {
            row_control_sum += arr.get(0).get(i);
        }
        for (int i = 1; i < arr.size(); i++) {
            int row_sum = 0;
            for (int j = 0; j < arr.get(i).size(); j++) {
                row_sum += arr.get(i).get(j);
            }
            if (row_sum != row_control_sum)
                return false;
        }
        return true;
    }

    public static boolean ColumnsCheckSum(ArrayList<ArrayList<Integer>> arr) {
        int column_control_sum = 0;
        for (ArrayList<Integer> integers : arr) {
            column_control_sum += integers.get(0);
        }
        for (int i = 1; i < arr.size(); i++) {
            int column_sum = 0;
            for (ArrayList<Integer> integers : arr) {
                column_sum += integers.get(i);
            }
            if (column_sum != column_control_sum)
                return false;
        }
        return true;
    }

    public static boolean DiagonalsCheckSum(ArrayList<ArrayList<Integer>> arr) {
        int first_diagonal_sum = 0, second_diagonal_sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size(); j++) {
                if (i == j)
                    first_diagonal_sum += arr.get(i).get(j);
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            for (int j = arr.size() - 1; j >= 0; j--) {
                if (j == arr.size() - 1 - i)
                    second_diagonal_sum += arr.get(i).get(j);
            }
        }
        return first_diagonal_sum == second_diagonal_sum;
    }

}
