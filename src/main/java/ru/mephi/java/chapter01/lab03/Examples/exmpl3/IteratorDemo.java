package ru.mephi.java.chapter01.lab03.Examples.exmpl3;


import java.util.ArrayList;
import java.util.Map;

public class IteratorDemo {
    public static void main(String[] args) {


        ArrayList<String> strings = new ArrayList<>();
        //ArrayList<Integer> ints = new ArrayList<>();
        initiate1(strings);
        //initiate2(ints);
        IMyIterator<String> it = IMyIterator.fromIterator(strings.iterator());
        IMyIterator<String> it2 = IMyIterator.fromIterator(strings.iterator());

        //IMyIterator<Integer> it3 = IMyIterator.fromIterator((ints.iterator()));

        //System.out.println(strings);

        while (it2.hasNext()) {
            System.out.print(it2.next() + ",\n");
        }
        System.out.println();

        Map map = it
                .filter(x -> (x.length() == 3 || x.length() == 5))
                .filter(x -> x.charAt(0) == 'T')
                .collectToMap(String::length);
        while (it.hasNext()) {
           System.out.print(it.next());
        }

        System.out.println(map);

    }

    /*private static void initiate2(ArrayList<Integer> ints) {
        for (int i = 1; i<=10;i++){
            ints.add(i);
        }

    }*/

    public static void initiate1(ArrayList<String> str) {
        str.add("One");
        str.add("Two");
        str.add("Three");
        str.add("Four");
        str.add("Something long");
        str.add("Five");
        str.add("Six");
        str.add("Seven");
        str.add("Something really long");
        str.add("Eight");
        str.add("Nine");
        str.add("Ten");
    }
}
