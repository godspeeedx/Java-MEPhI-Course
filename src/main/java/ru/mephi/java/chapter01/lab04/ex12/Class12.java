package ru.mephi.java.chapter01.lab04.ex12;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Class12 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        long nano_startTime = System.nanoTime();
        long millis_startTime = System.currentTimeMillis();
        sayHello10000Times();
        long nano_endTime = System.nanoTime();
        long millis_endTime = System.currentTimeMillis();

        long nano_startTime2 = System.nanoTime();
        long millis_startTime2 = System.currentTimeMillis();
        sayHelloWithReflection10000Times();
        long nano_endTime2 = System.nanoTime();
        long millis_endTime2 = System.currentTimeMillis();

        System.out.println("Time taken in nano seconds : " + (nano_endTime - nano_startTime));
        System.out.println("Time taken in milli seconds: " + (millis_endTime - millis_startTime));
        System.out.println("Time taken in nano seconds with reflection: " + (nano_endTime2 - nano_startTime2));
        System.out.println("Time taken in milli seconds with reflection: " + (millis_endTime2 - millis_startTime2));
    }

    public static void sayHello10000Times() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("Hello,people!");
        }
    }

    public static void sayHelloWithReflection10000Times() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        for (int i = 0; i < 10000; i++) {
            Method m = System.out.getClass().getDeclaredMethod("println", String.class);
            m.invoke(System.out, "Hello, people!");
        }
    }
}
