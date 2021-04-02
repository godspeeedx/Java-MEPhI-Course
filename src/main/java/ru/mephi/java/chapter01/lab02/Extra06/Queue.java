package ru.mephi.java.chapter01.lab02.Extra06;

import java.util.ArrayList;

public class Queue {

    int head;
    ArrayList<String> nodes = new ArrayList<>();

    public void add(String data) {
        nodes.add(data);
    }

    public String remove() {
        if (nodes.size() == 0) {
            return null;
        } else {
            String buf = nodes.get(head);
            nodes.set(head,null);
            head++;
            return buf;
        }
    }

    public int size(){
        return (nodes.size()- head);
    }
}
