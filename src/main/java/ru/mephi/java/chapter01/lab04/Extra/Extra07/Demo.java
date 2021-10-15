package ru.mephi.java.chapter01.lab04.Extra.Extra07;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) throws IllegalAccessException {
        Class01 t1 = new Class01(10, "jhuih");
        Class01 t2 = new Class01(20, "jhuih");
        Class01 t3 = new Class01(30, "xdrgc");
        Class02 t4 = new Class02(true);
        t1.setNext(t2);
        t2.setNext(t3);
        t3.setNext(t2);
        t4.setNext(t1);
        String[] arr = {"one", "two", "three"};
        ArrayList<String> s = new ArrayList<>();
        s.add("four");
        s.add("five");
        UniversalToString universalToString = new UniversalToString();
        System.out.println(universalToString.universalToString(t1));
        System.out.println(universalToString.universalToString(t4));
        System.out.println(universalToString.universalToString(arr));
        System.out.println(universalToString.universalToString(s));
    }
}