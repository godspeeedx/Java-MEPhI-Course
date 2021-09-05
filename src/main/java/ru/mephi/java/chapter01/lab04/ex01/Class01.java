package ru.mephi.java.chapter01.lab04.ex01;

public class Class01 {

    public static void main(String[] args) {

        Point p1 = new Point(7.7, 9.9);
        LabeledPoint lp1 = new LabeledPoint("Labeled point #1");
        LabeledPoint lp2 = new LabeledPoint("Labeled point #2", 7, 9);

        System.out.println(p1.getX());

        p1 = lp2;

        System.out.println("After changes " + p1.getX());

        Point p2 = lp2; //p2.getLabel не сработает
        System.out.println(p2.getX() + " " + p2.getY());
        System.out.println(lp2.getX() + " " + lp2.getY());
        System.out.println(lp1.getLabel());
    }
}
