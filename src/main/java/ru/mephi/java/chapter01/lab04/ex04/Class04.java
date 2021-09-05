package ru.mephi.java.chapter01.lab04.ex04;

import ru.mephi.java.chapter01.lab04.ex02.Point;

public class Class04 {

    public static void main(String[] args) {

        Point p = new Point(0, 0);
        Point pp = new Point(10, 10);

        //Shape shape = new Shape(Point p); wrong

        Shape circle = new Circle(p, 5);
        Shape rectangle = new Rectangle(p, 7, 9);
        Shape line = new Line(p, pp);
        Shape[] shapes = new Shape[3];
        shapes[0] = circle;
        shapes[1] = rectangle;
        shapes[2] = line;
        for (Shape s : shapes) {
            System.out.println(s.getCenter());
        }

        //-----------------ex05-----------------------

        Circle c1 = new Circle(new Point(10, 10), 10);
        Rectangle r1 = new Rectangle(new Point(1, 1), 7, 9);
        Line l1 = new Line(new Point(6, 6), new Point(8, 8));

        Circle clonedCircle = c1.clone();
        Rectangle clonedRectangle = r1.clone();
        Line clonedLine = l1.clone();

        System.out.println("\n" + c1.equals(clonedCircle) + " " + r1.equals(clonedRectangle) + " " + l1.equals(clonedLine));

    }

}
