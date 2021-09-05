package ru.mephi.java.chapter01.lab04.ex04;

import ru.mephi.java.chapter01.lab04.ex02.Point;

public class Circle extends Shape implements Cloneable {

    private double rad;

    public Circle(Point center, double rad) {
        super(center);
        this.rad = rad;
    }

    @Override
    public Point getCenter() {
        return this.point;
    }

    @Override
    protected Circle clone() {
        return new Circle(new Point(point.getX(), point.getY()), rad);
    }
}
