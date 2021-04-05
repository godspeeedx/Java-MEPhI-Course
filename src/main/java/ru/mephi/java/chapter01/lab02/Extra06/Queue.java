package ru.mephi.java.chapter01.lab02.Extra06;

import java.util.ArrayList;

public class Queue {

    private int head;
    private ArrayList<String> nodes = new ArrayList<>();

    public boolean checkMemory() {
        return head > nodes.size() / 2;
    }

    public ArrayList<String> rearrange() {
        ArrayList<String> newNodes = new ArrayList<>(size());
        for (int i = head; i < size(); i++) {
            newNodes.add(nodes.get(i));
        }
        return newNodes;
    }

    public void add(String data) {
        if (checkMemory()) {
            nodes = rearrange();
        }
        nodes.add(data);
    }

    public String remove() {
        if (checkMemory()) {
            nodes = rearrange();
        }
        if (size() == 0) {
            return null;
        } else {
            String buf = nodes.get(head);
            nodes.set(head, null);
            head++;
            return buf;
        }
    }

    public int size() {
        return (nodes.size() - head);
    }
}
