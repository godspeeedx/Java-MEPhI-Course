package ru.mephi.java.chapter01.lab03.Examples.exmpl1;

public class German implements Digit {

    @Override
    public String getName(int number) {
        String name = null;
        if (number == 0) {
            name = "Null";
        } else if (number == 1) {
            name = "Eins";
        } else if (number == 2) {
            name = "Zwei";
        } else if (number == 3) {
            name = "Drei";
        } else if (number == 4) {
            name = "Vier";
        } else if (number == 5) {
            name = "Funf";
        } else if (number == 6) {
            name = "Sechs";
        } else if (number == 7) {
            name = "Sieden";
        } else if (number == 8) {
            name = "Acht";
        } else if (number == 9) {
            name = "Neun";
        }
        return name;
    }
}
