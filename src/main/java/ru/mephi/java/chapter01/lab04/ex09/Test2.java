package ru.mephi.java.chapter01.lab04.ex09;

public class Test2 {

    private final String a;
    private final String b;
    String c;

    public Test2(String a, String b, String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return UniversalToString.toString(this);
    }
}
