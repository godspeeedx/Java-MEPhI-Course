package ru.mephi.java.chapter01.lab01.ex15;

// Напишите программу, сохраняющую треугольник Паскаля вплоть до заданной величины n
// в переменной типа ArrayList<ArrayList<Integer».

import java.util.*;

public class Class15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер треугольника Паскаля");
        int n = in.nextInt();
        ArrayList<ArrayList<Integer>> pascTri = create(n);
        System.out.println("Полученный треугольник:");
        print(pascTri);
        System.out.println("\nЗадание выполнено!");
    }

    public static void print(ArrayList<ArrayList<Integer>> input) {
        ArrayList<Integer> lastLine = input.get(input.size() - 1);
        int longestNumber = Integer.toString(lastLine.get((lastLine.size() - 1) / 2)).length();

        for (int i = 0; i < input.size(); i++) {
            for (int l = 0; l < (input.size() - 1 - i) * (longestNumber + 1) / 2; l++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                StringBuilder block = new StringBuilder(Integer.toString(input.get(i).get(j)));
                int totalDiff = longestNumber - block.length();

                block.append(" ".repeat(Math.max(0, totalDiff / 2)));

                for (int l = 0; l < totalDiff - (totalDiff / 2); l++) {
                    block.insert(0, " ");
                }

                System.out.print(block);
                if (j < i) {
                    System.out.print(" ");
                } else {
                    System.out.println();
                }
            }
        }
    }

    public static ArrayList<ArrayList<Integer>> create(int n) {
        ArrayList<ArrayList<Integer>> pascTri = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> stroka = new ArrayList<>();
            for (int j = 0; j < i + 1; j++)
                stroka.add(0);

            stroka.set(0, 1);

            for (int l = 1; l < i; l++)
                stroka.set(l, pascTri.get(i - 1).get(l - 1) + pascTri.get(i - 1).get(l));

            stroka.set(i, 1);

            pascTri.add(stroka);
        }
        return pascTri;
    }

}
