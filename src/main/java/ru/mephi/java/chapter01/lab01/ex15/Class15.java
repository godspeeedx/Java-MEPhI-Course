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
        for (ArrayList<Integer> i : input) {
            for (Integer j : i) {
                System.out.printf("%d", j);
            }
            System.out.println();
        }
    }

    public static ArrayList<ArrayList<Integer>> create(int n) {
        ArrayList<ArrayList<Integer>> pascTri = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> stroka = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                stroka.add(0);
            }
            stroka.set(0, 1);
            stroka.set(i, 1);
            for (int l = 1; l < i; l++) {
                stroka.set(l, pascTri.get(i - 1).get(l - 1) + pascTri.get(i - 1).get(l));
            }
            pascTri.add(stroka);
        }
        return pascTri;
    }

}
