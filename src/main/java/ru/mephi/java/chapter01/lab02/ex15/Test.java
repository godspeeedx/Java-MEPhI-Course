package ru.mephi.java.chapter01.lab02.ex15;

public class Test {
    public static void main(String[] args) {
        Invoice invoice = new Invoice();
        invoice.addItem("Karamelka ", 3, 24.95);
        invoice.addItem("Marmeladka", 2, 49.95);
        invoice.print();
    }
}
