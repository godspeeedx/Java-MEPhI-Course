package ru.mephi.java.chapter01.lab04.Extra.Extra01;

public class ExtendedPoint extends Point {

    public double z;

    public ExtendedPoint(double x, double y) {
        super(x, y);
    }

    public void override() {
        System.out.println("I'm done!");
    }

}
