package ru.mephi.java.chapter01.lab02.ex16;

public class Test {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add("First");
        queue.add("Second");
        queue.add("Third");
        System.out.println(queue.remove());
    }
}
