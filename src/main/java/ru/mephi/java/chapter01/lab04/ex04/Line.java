package ru.mephi.java.chapter01.lab04.ex04;

import ru.mephi.java.chapter01.lab04.ex02.Point;

public class Line extends Shape implements Cloneable {
    private Point secondPoint;

    public Line(Point first, Point second) {
        super(first);
        this.secondPoint = second;
    }

    @Override
    public Point getCenter() {
        return new Point((secondPoint.getX() + this.point.getX()) / 2, (secondPoint.getY() + this.point.getY()) / 2);
    }

    @Override
    protected Line clone() {
        return new Line(new Point(point.getX(), point.getY()), new Point(secondPoint.getX(), secondPoint.getY()));
    }

}
