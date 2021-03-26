package ru.mephi.java.ch02.task16;

// Реализуйте в классе Queue неограниченную очередь символьных строк.
// Предоставьте метод add () для ввода элемента в хвост очереди и метод remove () для удаления элемента из головы очереди.
// Организуйте хранение элементов в виде связного списка узлов, создав вложенный класс Node.
// Должен ли этот класс быть статическим?

public class Queue {
    public static class Node {
        private String data = "";
        public Node next = null;

        public Node(String data) {
            this.data = data;
        }
        public String getData() {
            return data;
        }
    }

    public Node head=null, tail=null;

    public void add(String data) {
        if (tail == null) {
            head = new Node(data);
            tail = head;
        }
        else {
            tail.next = new Node(data);
            tail = tail.next;
        }
    }
    public String remove() {
        if (head == null)
            return null;

        Node removedNode = head;
        head = head.next;
        return removedNode.getData();
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        for (int i=0; i<4; i++)
            queue.add("" + i);

        for (int i=0; i<5; i++)
            System.out.println(queue.remove());
    }
}
