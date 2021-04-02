package ru.mephi.java.chapter01.lab02.Extra04;

// Реализуйте в классе Queue неограниченную очередь символьных строк.
// Предоставьте метод add () для ввода элемента в хвост очереди и метод remove () для удаления элемента из головы очереди.
// Организуйте хранение элементов в виде массива.

import java.util.ArrayList;
import java.util.LinkedList;

public class Queue {
    LinkedList<String> nodes = new LinkedList<>();

    public void add(String data) {
        nodes.add(data);
    }

    public String remove() {
        return nodes.removeFirst();
    }

}
