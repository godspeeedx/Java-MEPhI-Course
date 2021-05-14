package ru.mephi.java.chapter01.lab03.ex09;

public class RunnableTaskClass implements Runnable {

    private String message = "default";
    private int count = 1;

    public RunnableTaskClass(String message, int count) {
        this.message = message;
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i < this.count; i++) {
            System.out.println(this.message);
        }
    }
}
