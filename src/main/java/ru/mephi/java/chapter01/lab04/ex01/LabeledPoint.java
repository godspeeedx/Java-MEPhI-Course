package ru.mephi.java.chapter01.lab04.ex01;

public class LabeledPoint extends Point {

    private String label;

    public LabeledPoint(String label, double x, double y) {
        super(x, y);
        this.label = label;
    }

    public LabeledPoint(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }


}
