package ru.mephi.java.chapter01.lab02.ex10;

// Предоставьте в классе RandomNumbers два статических метода типа random Element, получающих произвольный
// элемент из обычного или списочного массива целочисленных значений. (Если обычный или списочный массив пуст,
// должен быть возвращен нуль.) Почему эти методы нельзя сделать методами экземпляра (инстанс методами) типа t [ ] или ArrayList<Integer>?

import java.util.ArrayList;
import java.util.Random;

public class RandomNumbers {

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
