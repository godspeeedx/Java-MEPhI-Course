package ru.mephi.java.chapter01.lab04.ex10;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Class10 {

    public static void printMethods(Class<?> cl) {
        while (cl != null) {
            for (Method m : cl.getDeclaredMethods()) {
                System.out.println(Modifier.toString(m.getModifiers()) + " "
                                + m.getReturnType().getCanonicalName() + " "
                                + m.getName()
                                + Arrays.toString(m.getParameters()));
            }
            cl = cl.getSuperclass();
        }
    }


    public static void main(String[] args) {
        printMethods(int[].class);
    }
}
