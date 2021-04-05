package ru.mephi.java.chapter01.lab02.ex10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
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
