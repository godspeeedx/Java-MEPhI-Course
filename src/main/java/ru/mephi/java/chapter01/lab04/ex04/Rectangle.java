package ru.mephi.java.chapter01.lab04.ex04;

import ru.mephi.java.chapter01.lab04.ex02.Point;

public class Rectangle extends Shape implements Cloneable {

    private double height;
    private double width;

    public Rectangle(Point point, double height, double width) {
        super(point);
        this.height = height;
        this.width = width;
    }

    @Override
    public Point getCenter() {
        return new Point((this.point.getX() + width) / 2, (this.point.getY() + height) / 2);
    }

    @Override
    protected Rectangle clone() {
        return new Rectangle(new Point(point.getX(), point.getY()), height, width);
    }

}
