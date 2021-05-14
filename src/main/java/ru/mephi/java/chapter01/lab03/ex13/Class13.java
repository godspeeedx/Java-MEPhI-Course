package ru.mephi.java.chapter01.lab03.ex13;

public class Class13 {
    public static void main(String[] args) {
        Runnable r = orderRunnable(test());
        r.run();
    }

    public static Runnable orderRunnable(Runnable[] runnableArr) {
        return () -> {
            for (Runnable r : runnableArr) {
                r.run();
            }
        };
    }

    public static Runnable[] test() {
        return new Runnable[]{new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello, my friend!");
            }
        },
                () -> System.out.println("Goodbye, my friend!")
        };
    }
}