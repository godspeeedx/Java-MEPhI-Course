package ru.mephi.java.chapter01.lab04.Extra.Extra07;

public class Class01 {
    private int a;
    private String b;
    public Class01 next;

    public Class01(int a, String b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return this.a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public Class01 getNext() {
        return this.next;
    }

    public void setNext(Class01 next) {
        this.next = next;
    }
}
