package ru.mephi.java.chapter01.lab02.Extra05;

// Реализуйте в классе Queue неограниченную очередь символьных строк.
// Предоставьте метод add () для ввода элемента в хвост очереди и метод remove () для удаления элемента из головы очереди.
// Организуйте хранение элементов в виде массива.

import java.util.ArrayList;

public class Queue {

    ArrayList<String> nodes = new ArrayList<>();

    public void add(String data) {
        if (nodes.size() == 0) {
            nodes.add(data);
        } else {
            nodes.add("Buffer");
            for (int i = nodes.size() - 1; i > 0; i--) {
                nodes.set(i, nodes.get(i - 1));
            }
            nodes.set(0, data);
        }
    }

    public String remove() {
        if (nodes.size() == 0) {
            return null;
        } else {
            return nodes.remove(nodes.size() - 1);
        }
    }

}
