package ru.mephi.java.chapter01.lab02.ex04;

// Почему в Java нельзя реализовать метод, меняющий местами содержимое двух переменных типа int?
// Вместо этого напишите метод, меняющий местами содержимое двух объектов типа IntHolder.
// (Описание этого малоизвестного класса можно найти в документации на прикладной программный интерфейс Java API.)
// Можно ли поменять местами содержимое двух объектов типа Integer?

public class IntHolder {
    private int value;

    public IntHolder(int value) {
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public static void intSwap(int a, int b) {
        int temp = a;
        b = a;
        a = temp;
    }

    public static void intHolderSwap(IntHolder a, IntHolder b) {
        int temp = a.getValue();
        a.setValue(b.getValue());
        b.setValue(temp);
    }

}
