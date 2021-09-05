package ru.mephi.java.chapter01.lab01.extra;

//Пользователь вводит числа. Ввод осуществляется до момента, пока пользователь не
//введет что-то отличное от числа. Сохранять числа в массив. По результатам выполнения
//вывести массив.

import java.util.*;

public class Extra {

    public static int getResult(List<Integer> parcels, int m) {
        ArrayList<ArrayList<Integer>> pairs = new ArrayList<>();
        for (int i = 0; i < parcels.size() - 1; i++) {
            for (int j = 1; j < parcels.size();j++) {
                ArrayList<Integer> pair = new ArrayList<>(2);
                if (parcels.get(i) + parcels.get(j) == m) {
                    pair.add(parcels.get(i));
                    pair.add(parcels.get(j));
                    pairs.add(pair);
                }
            }
        }
        System.out.println(pairs);
        return pairs.size();
    }

    public static void main(String[] args) {
        List<Integer> parcels = List.of(1, 3, 2, 3);
        System.out.println(getResult(parcels, 6));
    }
}
