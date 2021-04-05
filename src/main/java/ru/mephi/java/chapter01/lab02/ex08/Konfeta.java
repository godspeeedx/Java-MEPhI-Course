package ru.mephi.java.chapter01.lab02.ex08;

// В предыдущих упражнениях для предоставления конструкторов и методов получения из класса Point пришлось писать часто
// повторяющийся код. В большинстве ИСР имеются средства, упрощающие написание повторяющегося шаблонного кода.
// Имеются ли такие средства в применяемой вами ИСР?

public class Konfeta {

    private String color;
    private boolean edible;
    private int amount;

    public Konfeta(String color, boolean edible, int amount) {
        this.color = color;
        this.edible = edible;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Konfeta{" +
                "color='" + color + '\'' +
                ", edible=" + edible +
                ", amount=" + amount +
                '}';
    }

    public static void main(String[] args) {

    }
}
