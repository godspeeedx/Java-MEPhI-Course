package ru.mephi.java.chapter01.lab03.Examples.exmpl1;

public class Russian implements Digit {
    @Override
    public String getName(int number) {
        String name = null;
        if (number == 0) {
            name = "Ноль";
        } else if (number == 1) {
            name = "Один";
        } else if (number == 2) {
            name = "Два";
        } else if (number == 3) {
            name = "Три";
        } else if (number == 4) {
            name = "Четыре";
        } else if (number == 5) {
            name = "Пять";
        } else if (number == 6) {
            name = "Шесть";
        } else if (number == 7) {
            name = "Семь";
        } else if (number == 8) {
            name = "Восемь";
        } else if (number == 9) {
            name = "Девять";
        }
        return name;
    }
}

