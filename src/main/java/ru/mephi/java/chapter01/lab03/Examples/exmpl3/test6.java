package ru.mephi.java.chapter01.lab03.Examples.exmpl3;


import java.util.ArrayList;
import java.util.Map;

public class test6 {
    public static void main(String[] args) {


        ArrayList<String> strings = new ArrayList<>();
        init(strings);
        IMyIterator<String> it = IMyIterator.fromIterator(strings.iterator());
        IMyIterator<String> itP = IMyIterator.fromIterator(strings.iterator());

        while (itP.hasNext()) {
            System.out.print(itP.next() + ", ");
        }
        System.out.println();

        Map map = it
                    .filter(x -> x.length()==3)
                    .collectToMap(String::length);
        while (it.hasNext()) {
            System.out.print(it.next());
        }

        System.out.println(map);

    }

    public static void init(ArrayList<String> str) {
        str.add("Tom");
        str.add("car");
        str.add("Emma");
        str.add("John");
        str.add("long string");
        str.add("mouse");
        str.add("water");
        str.add("film");
        str.add("longest string");
        str.add("Garry");
        str.add("rock");
        str.add("Ben");
        str.add("longest string in the world");
        str.add("school");
        str.add("Ellie");
        str.add("Bella");
        str.add("Jacob");
        str.add("top");
        str.add("list");
        str.add("clock");
        str.add("longer then longest string in the world");
        str.add("Henry");
        str.add("pistol");
        str.add("Henry");
    }
}
