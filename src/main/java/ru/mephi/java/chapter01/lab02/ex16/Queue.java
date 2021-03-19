package ru.mephi.java.chapter01.lab02.ex16;

// Реализуйте в классе Queue неограниченную очередь символьных строк.
// Предоставьте метод add () для ввода элемента в хвост очереди и метод remove () для удаления элемента из головы очереди.
// Организуйте хранение элементов в виде связного списка узлов, создав вложенный класс Node.
// Должен ли этот класс быть статическим?

public class Queue {

    private Node head;
    private Node tail;

    private class Node {
        private final String data;
        Node next;
        Node prev;

        public Node(String data) {
            this.data = data;
        }

        public String getData() {
            return this.data;
        }

    }

    public void add(String data) {
        Node n = new Node(data);
        if (this.head == null) {
            this.head = n;
            this.tail = n;
        } else {
            this.tail.next = n;
            this.tail = n;
        }
    }

    public String remove() {
        if (this.head == null) {
            return null;
        } else {
            Node n = this.head;
            this.head = this.head.next;
            return n.getData();
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add("First");
        queue.add("Second");
        queue.add("Third");
        System.out.println(queue.remove());
    }

}
