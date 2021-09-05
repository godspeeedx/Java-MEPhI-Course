package ru.mephi.java.chapter01.lab04.ex09;

public class Test1 {
    public final int x;
    public final int y;
    public final int z;

    public Test1(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return UniversalToString.toString(this);
    }
}
