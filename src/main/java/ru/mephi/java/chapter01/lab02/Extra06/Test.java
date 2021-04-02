package ru.mephi.java.chapter01.lab02.Extra06;

public class Test {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add("First");
        queue.add("Second");
        queue.add("Third");
        System.out.println("Removing the head of the queue - " + queue.remove() + "\n");
        System.out.println("Current queue size - " + queue.size());
    }
}
