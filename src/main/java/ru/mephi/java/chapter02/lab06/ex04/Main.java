package ru.mephi.java.chapter02.lab06.ex04;

public class Main {
    public static void main(String[] args) {
        Table<Integer, String> table = new Table<>();
        table.add(1, "Arina");
        table.add(2, "Olesya");
        table.add(3, "Sasha");
        table.add(4, "Grisha");
        table.add(5, "Natasha");
        table.add(6, "Tanya");
        table.add(7, "Dima");
        table.add(8, "Nastya");
        table.add(9, "Ilya");
        System.out.println(table);
        System.out.println(table.get(2));
        System.out.println(table.get(5));
        table.set(7,"Empty");
        System.out.println(table.get(7));
        table.remove(7);
        System.out.println(table);
    }

}
