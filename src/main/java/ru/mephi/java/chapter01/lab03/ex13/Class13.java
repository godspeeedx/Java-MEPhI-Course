package ru.mephi.java.chapter01.lab03.ex13;

public class Class13 {
    public static void main(String[] args) {
        Runnable r = orderRunnable( new Runnable[]{
                () -> System.out.println("hello"),
                () -> System.out.println(5+11-9),
                () -> System.out.println("have a nice day")});
        r.run();
    }

    public static Runnable orderRunnable(Runnable[] runnableArr) {
        return () -> {
            for (Runnable a : runnableArr) {
                a.run();
            }
        };
    }

}