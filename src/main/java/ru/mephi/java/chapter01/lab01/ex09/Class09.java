package ru.mephi.java.chapter01.lab01.ex09;

// В разделе 1.5.3 был приведен пример сравнения двух символьных строк s и t
// при вызове метода s. equals (t), но не с помощью операции s != t.
// Придумайте другой пример, в котором не применяется метод substring ().

public class Class09 {
    public static void main(String[] args) {

        String s = new String("samestringasfasfa");
        String t = new String("samestringfadfa");



        System.out.printf("s.equals(t) должно быть true - %b\n", s.equals(t));
        System.out.printf("s == t должно быть false - %b\n", s == t);

        System.out.println("\nЗадание выполнено!");
    }
}
