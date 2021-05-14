package ru.mephi.java.chapter01.lab03.Examples.exmpl1;

public class English implements Digit {
    @Override
    public String getName(int number) {
        String name = null;
        if (number == 0) {
            name = "Zero";
        } else if (number == 1) {
            name = "One";
        } else if (number == 2) {
            name = "Two";
        } else if (number == 3) {
            name = "Three";
        } else if (number == 4) {
            name = "Four";
        } else if (number == 5) {
            name = "Five";
        } else if (number == 6) {
            name = "Six";
        } else if (number == 7) {
            name = "Seven";
        } else if (number == 8) {
            name = "Eight";
        } else if (number == 9) {
            name = "Nine";
        }
        return name;
    }
}
