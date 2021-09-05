package ru.mephi.java.chapter01.lab04.ex03.insidePack;

import ru.mephi.java.chapter01.lab04.ex03.LabeledPoint;

public class Test {

    public String label;
    int k;
    double x;

    public Test(String label, int k) {
        LabeledPoint p = new LabeledPoint("WHAT", 7, 9);
        this.k = k;
        this.label = p.getLabel();
        //this.x = p.x;  -- сработает this.x = p.getX();

    }
}
