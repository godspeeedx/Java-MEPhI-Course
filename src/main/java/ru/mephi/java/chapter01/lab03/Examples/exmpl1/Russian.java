package ru.mephi.java.chapter01.lab03.Examples.exmpl1;

public class Russian implements Digit {
    @Override
    public String getName(int number) {
        String name = null;
        if (number == 0) {
            name = "����";
        } else if (number == 1) {
            name = "����";
        } else if (number == 2) {
            name = "���";
        } else if (number == 3) {
            name = "���";
        } else if (number == 4) {
            name = "������";
        } else if (number == 5) {
            name = "����";
        } else if (number == 6) {
            name = "�����";
        } else if (number == 7) {
            name = "����";
        } else if (number == 8) {
            name = "������";
        } else if (number == 9) {
            name = "������";
        }
        return name;
    }
}

