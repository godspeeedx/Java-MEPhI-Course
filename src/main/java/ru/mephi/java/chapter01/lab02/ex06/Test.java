package ru.mephi.java.chapter01.lab02.ex06;

public class Test {
    public static void main(String[] args) {
        Point p = new Point(3, 4).translate(1, 3).scale(0.5);
        System.out.println("\nPoint is located at " + p.getX() + " at the X axis and " + p.getY() + " at the Y axis");
    }
}
