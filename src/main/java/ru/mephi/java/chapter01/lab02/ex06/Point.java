package ru.mephi.java.chapter01.lab02.ex06;

// Повторите предыдущее упражнение, но на этот раз сделайте методы trans late () и scale () модифицирующими.

public class Point {

    double x;
    double y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public Point translate(double x, double y) {
        this.x += x;
        this.y += y;
        return this;
    }

    public Point scale(double factor) {
        this.x *= factor;
        this.y *= factor;
        return this;
    }

    public static void main(String[] args) {
        Point p = new Point(3, 4).translate(1, 3).scale(0.5);
        System.out.println("\nPoint is located at " + p.getX() + " at the X axis and " + p.getY() + " at the Y axis");
    }
}