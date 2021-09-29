package ru.mephi.java.chapter01.lab04.Extra.Extra01;

public abstract class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public abstract void override();

}
