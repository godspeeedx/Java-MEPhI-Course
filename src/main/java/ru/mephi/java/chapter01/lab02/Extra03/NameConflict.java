package ru.mephi.java.chapter01.lab02.Extra03;

//Разрешение конфликта имен

import ru.mephi.java.chapter01.lab02.ex16.Queue;

public class NameConflict {

    public static void main(String[] args) {
        Queue q1 = new Queue();
        ru.mephi.java.chapter01.lab02.ex17.Queue q2 = new ru.mephi.java.chapter01.lab02.ex17.Queue();

        q1.add("First");
        q2.add("First");


    }
}
