package ru.mephi.java.chapter01.lab04.Extra.Extra0506;


public enum Rainbow {
    RED(1),
    ORANGE(2),
    YELLOW(3),
    GREEN(4),
    BLUE(5),
    INDIGO(6),
    VIOLET(7);

    private final int number;

    Rainbow(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }
}