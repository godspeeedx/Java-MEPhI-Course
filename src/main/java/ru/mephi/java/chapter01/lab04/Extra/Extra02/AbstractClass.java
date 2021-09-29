package ru.mephi.java.chapter01.lab04.Extra.Extra02;

public abstract class AbstractClass {

    private double x;
    private double y;

    public AbstractClass(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void override() {
        System.out.println("I'm overide");
    }

    public int simpleMath() {
        System.out.println("2+2 is 4");
        return 4;
    }
}
