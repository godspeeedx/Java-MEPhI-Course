package ru.mephi.java.chapter01.lab04.ex04;

import ru.mephi.java.chapter01.lab04.ex02.Point;

public abstract class Shape implements Cloneable {

    protected Point point;

    public Shape(Point point) {
        this.point = point;
    }

    public void moveBy(double dx, double dy) {
        point.setX(point.getX() + dx);
        point.setY(point.getY() + dy);
    }

    public abstract Point getCenter();
}
