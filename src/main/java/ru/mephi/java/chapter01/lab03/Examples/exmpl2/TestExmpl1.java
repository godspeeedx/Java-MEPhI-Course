package ru.mephi.java.chapter01.lab03.Examples.exmpl2;

import java.util.ArrayList;
import java.util.Collections;

public class TestExmpl1 {
    public static void main(String[] args) {

        ArrayList<Digit> digits = new ArrayList();

        //System.out.println(Integer.MIN_VALUE);
        //System.out.println(Integer.MAX_VALUE);

        digits.add(new Digit("minvalue", Integer.MIN_VALUE));
        digits.add(new Digit("maxvalue", Integer.MAX_VALUE));
        //digits.add(new Digit("five", 5));
        //digits.add(new Digit("three", 3));
        //digits.add(new Digit("four", 4));

        Collections.sort(digits);
        System.out.println(digits);


        int first = Integer.compare(0,2);
        int second = Integer.compare(0,20);

        System.out.println(first);
        System.out.println(second);

    }
        /*
        a-b = 2;
        a-c = 20;

        c-b = -18
        c = b-18;
         */
}
