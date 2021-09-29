package ru.mephi.java.chapter01.lab04.Extra.Extra04;

import java.util.Objects;

public class MyClass {
    private double x;
    private double y;
    private double z;
    private String label;

    public MyClass(double x, double y, double z, String label) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.label = label;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    @Override
    public String toString() {
        return getClass().getName() + "[X = " + this.x + ", Y = " + this.y + ", Z = " + this.z + ", Label is " + this.label + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }

        if (this.hashCode() != obj.hashCode()) {
            return false;
        }

        if (this.getClass() != obj.getClass()) {
            return false;
        }
        MyClass point = (MyClass) obj;
        return x == point.getX() && y == point.getY() && z == point.z && label == point.label;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z, label);
    }
}
