package ru.mephi.java.chapter01.lab02.ex10;

// Предоставьте в классе RandomNumbers два статических метода типа random Element, получающих произвольный
// элемент из обычного или списочного массива целочисленных значений. (Если обычный или списочный массив пуст,
// должен быть возвращен нуль.) Почему эти методы нельзя сделать методами экземпляра (инстанс методами) типа t [ ] или ArrayList<Integer>?

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Class10 {
    public static class RandomNumbers {
        public static int randomElement(int[] data) {
            Random generator = new Random();
            if (data.length == 0) {
                return 0;
            }
            int position = generator.nextInt(data.length);
            return data[position];
        }

        public static int randomElement(ArrayList<Integer> data) {
            Random generator = new Random();
            if (data.isEmpty()) {
                return 0;
            }
            int position = generator.nextInt(data.size());
            return data.get(position);
        }

    }

    public static void main(String[] args) {
        System.out.println("Insert integer numbers:");
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        int[] array = new int[1];
        int i = 0;
        while (in.hasNextInt()) {
            System.out.println("And another one:");
            array = Arrays.copyOf(array, i + 1);
            array[i] = in.nextInt();
            arrayList.add(array[i]);
            i++;
        }

        System.out.println("Random number from int[] - " + RandomNumbers.randomElement(array));
        System.out.println("Random number from ArrayList<Integer> - " + RandomNumbers.randomElement(arrayList));

    }
}
