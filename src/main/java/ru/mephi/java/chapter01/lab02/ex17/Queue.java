package ru.mephi.java.chapter01.lab02.ex17;

//Предоставьте итератор — объект, извлекающий по порядку элементы очереди из предыдущего упражнения.
// Сделайте класс Iterator вложенным и определите в нем методы next () и hasNext ().
// Определите в классе Queue метод iterator (), возвращающий ссылку на объект Queue .Iterator.
// Должен ли внутренний класс Iterator быть статическим?


public class Queue {

    private Node head;
    private Node tail;

    private class Node {
        private final String data;
        Node next;

        public Node(String data) {
            this.data = data;
        }

        public String getData() {
            return this.data;
        }
    }

    public class Iterator {
        private Node current = head;

        public boolean hasNext() {
            return current != null;
        }

        public String next() {
            String result = hasNext() ? current.getData() : null;
            this.current = hasNext() ? this.current.next : null;
            return result;
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

    public Iterator iterator() {
        return new Iterator();
    }
}
