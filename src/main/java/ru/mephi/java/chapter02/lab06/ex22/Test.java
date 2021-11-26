package ru.mephi.java.chapter02.lab06.ex22;

import java.util.concurrent.Callable;

public class Test {
    public static void main(String[] args) {

    }

    public static <V, T> V doWork (Callable<V> c, T ex) throws Throwable {
        try {
            return c.call();
        } catch (Throwable realEx) {
            throw new Throwable();
        }
    }
}
