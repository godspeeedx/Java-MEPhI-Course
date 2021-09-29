package ru.mephi.java.chapter01.lab04.Extra.Extra0506;

public enum MyOwn {

    WHAT(1),
    DO(2),
    YOU(3),
    WANT(4),
    FROM(5),
    ME(6);

    private final int number;

    MyOwn(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }
}
