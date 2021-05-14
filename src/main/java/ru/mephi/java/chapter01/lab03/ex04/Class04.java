package ru.mephi.java.chapter01.lab03.ex04;

import java.util.ArrayList;

public class Class04 {
    public static void main(String[] args) {
        int[] array = {7, 8, 9, 10};
        IntSequence seq = IntSequence.of(array);
        while (seq.hasNext()){
            System.out.printf("%s ", seq.next());
        }
    }
}
