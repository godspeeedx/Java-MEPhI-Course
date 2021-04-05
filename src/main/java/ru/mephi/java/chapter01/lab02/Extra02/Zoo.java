package ru.mephi.java.chapter01.lab02.Extra02;

// Разница в коде static inner class и nested class

public class Zoo {

    private String name = "Moscow Zoo";
    private static int showcase = 0;

    public String getName() {
        return name;
    }

    private class Elephant {
        public String whereAmI() {
            return getName();
        }

        public void print() {
            System.out.println(name + showcase);
        }
    }

    private static class Snake {

        public void print() {
            System.out.println(showcase);
        }
    }

    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Elephant slon = zoo.new Elephant();
        Snake python = new Snake();
        slon.print();
        python.print();
    }
}
