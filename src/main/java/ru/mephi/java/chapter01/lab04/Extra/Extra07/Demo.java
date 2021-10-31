package ru.mephi.java.chapter01.lab04.Extra.Extra07;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) throws IllegalAccessException {
        Class01 t1 = new Class01(10, "one");
        Class01 t2 = new Class01(20, "two");
        Class02 t4 = new Class02(true, 77, "supercheck");
        t1.setNext(t2);
        t4.setNext(t1);

        UniversalToString universalToString = new UniversalToString();
        System.out.println(universalToString.universalToString(t4));
    }
}