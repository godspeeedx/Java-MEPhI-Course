package ru.mephi.java.chapter01.lab03.Examples.exmpl2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestExmpl2 {

    public static void main(String[] args) {
        ArrayList<Digit> digits = new ArrayList();
        ArrayList<String> strings = new ArrayList();
        ArrayList<Integer> ints = new ArrayList();

        strings.add("one");
        strings.add("two");
        strings.add("three");
        strings.add("four");
        strings.add("five");

        ints.add(5);
        ints.add(4);
        ints.add(3);
        ints.add(2);
        ints.add(1);

        Digit test1 = new Digit("seven", 7);
        Digit test2 = new Digit("nine", 9);
        Digit test3 = new Digit("twenty seven", 27);

        digits.add(new Digit("one", 1));
        digits.add(new Digit("two", 2));
        digits.add(new Digit("three", 3));
        digits.add(new Digit("four", 4));
        digits.add(new Digit("five", 5));

        Comparator nameComparator = new NameComparator();
        Comparator numberComparator = new NumberComparator();

        int diff1 = nameComparator.compare(test1, test2);
        int diff2 = nameComparator.compare(test1, test3);

        int diff3 = numberComparator.compare(test1, test2);
        int diff4 = numberComparator.compare(test1, test3);
        System.out.println(diff1);
        System.out.println(diff2);
        System.out.println(diff3);
        System.out.println(diff4);

        Collections.sort(digits, nameComparator);
        System.out.println(digits);
        Collections.sort(digits, numberComparator);
        System.out.println(digits);

    }
}
