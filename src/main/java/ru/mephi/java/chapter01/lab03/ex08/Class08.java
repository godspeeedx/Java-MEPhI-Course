package ru.mephi.java.chapter01.lab03.ex08;

public class Class08 {
    public static void main(String[] args) {
        Runnable greet1 = new Greeter(7, "Ladies");
        Runnable greet2 = new Greeter(5, "Gentlemen");
        Thread greetThread1 = new Thread(greet1);
        Thread greetThread2 = new Thread(greet2);

        greetThread1.start();
        greetThread2.start();

    }
}
