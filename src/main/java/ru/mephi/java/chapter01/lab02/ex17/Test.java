package ru.mephi.java.chapter01.lab02.ex17;

public class Test {
    public static void main(String[] args) {
        Class17.Queue queue = new Class17.Queue();
        queue.add("First");
        queue.add("Second");
        queue.add("Third");
        queue.add("Fourth");
        queue.add("Fifth");
        queue.add("Sixth");
        while (queue.iterator().hasNext()) {
            System.out.println(queue.iterator().next());
            queue.remove();
        }
    }
}
