package ru.mephi.java.chapter01.lab03.ex09;

public class Class09 {
    public static void main(String[] args) {
        Runnable a = () -> System.out.println("Hello");
        Runnable b = () -> System.out.println(7+9-11);
        Runnable c = () -> System.out.println("Have a nice evening!");
        runTogether(a, b, c);
        runInOrder(a, b, c);

    }

    public static void runInOrder(Runnable... tasks) {
        for (Runnable i : tasks) {
            i.run();
        }
    }

    public static void runTogether(Runnable... tasks) {
        for (Runnable i : tasks) {
            new Thread(i).start();
        }
    }

}
