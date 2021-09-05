package ru.mephi.java.chapter01.lab04.ex02;

public class Class02 {
    public static void main(String[] args) {

        Point p1 = new Point(7, 9);
        System.out.println(p1);

        Point p2 = new Point(7, 9); //работает
        System.out.println(p2.equals(p1));
        System.out.println(p2.hashCode() + " vs " + p1.hashCode());

        Point p3 = p1; //работает
        System.out.println(p3.equals(p1));
        System.out.println(p3.hashCode() + " vs " + p1.hashCode());

        Point p4 = new Point(11, 12);
        System.out.println(p1.equals(p4));
        System.out.println(p1.hashCode() + " vs " + p4.hashCode());

        System.out.println(p1.equals(null));

        System.out.println(p1.equals(new Point(7, 9)));//работает

    }
}
