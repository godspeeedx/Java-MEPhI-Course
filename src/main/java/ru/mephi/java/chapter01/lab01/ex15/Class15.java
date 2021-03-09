package ru.mephi.java.chapter01.lab01.ex15;

// Напишите программу, сохраняющую треугольник Паскаля вплоть до заданной величины n
// в переменной типа ArrayList<ArrayList<Integer».

import java.util.*;

public class Class15 {
    public static void main(String[] args) {
        int n = Int("Введите размер треугольника Паскаля");
        ArrayList<ArrayList<Integer>> pascTri = create(n);
        System.out.println("Полученный треугольник:");
        print(pascTri);
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
    public static void print(ArrayList<ArrayList<Integer>> input) {
        ArrayList<Integer> lastLine = input.get(input.size() - 1);
        int maxNumWidth = Integer.toString(lastLine.get((lastLine.size() - 1) / 2)).length();

        for (int i = 0; i < input.size(); i++) {
            //Вывод первых пробелов
            for (int l = 0; l < (input.size() - 1 - i) * (maxNumWidth + 1) / 2; l++)
                System.out.printf(" ");

            for (int j = 0; j <= i; j++) {
                //Вывод по блоку (сначала добавляяем в блок число)
                String numBlock = Integer.toString(input.get(i).get(j));
                int totalPad = maxNumWidth - numBlock.length();
                //правые пробелы
                for (int l = 0; l < totalPad / 2; l++)
                    numBlock = numBlock + " ";
                //левые пробелы
                for (int l = 0; l < totalPad - (totalPad / 2); l++)
                    numBlock = " " + numBlock;
                //вывод блока
                System.out.print(numBlock);
                if (j < i)
                    System.out.print(" ");
                else
                    System.out.println();
            }
        }
    }
}
