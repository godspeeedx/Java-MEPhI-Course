package ru.mephi.java.ch02.task17;

//Предоставьте итератор — объект, извлекающий по порядку элементы очереди из предыдущего упражнения.
// Сделайте класс Iterator вложенным и определите в нем методы next () и hasNext ().
// Определите в классе Queue метод iterator (), возвращающий ссылку на объект Queue .Iterator.
// Должен ли внутренний класс Iterator быть статическим?

public class Queue {
    //Из 16ого
    private static class Node {
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
    //Из 16ого

    public Iterator iterator() {
        return new Iterator(head);
    }
    public static class Iterator {
        private Node current;

        public Iterator (Node current){ this.current=current; }
        public String getCurrentData() {
            return current.getData();
        }
        public boolean hasNext() {
            return current != null;
        }
        public String next() {
            if (current != null){
                String dataBuf=getCurrentData();
                current = current.next;
                return dataBuf;
            }
            return null;
        }
    }

}

public class Test {
    public static void main(String[] args) {
        Queue queue = new Queue();
        for (int i=0; i<6; i++)
            queue.add("" + i);

        Queue.Iterator pointer = queue.iterator();
        while (pointer.hasNext())
            System.out.println(pointer.next());

        for (int i=0; i<8; i++)
            System.out.println(queue.remove());

    }
}
