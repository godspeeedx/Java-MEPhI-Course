package ru.mephi.java.chapter01.lab03.Examples.exmpl2;

import java.util.ArrayList;
import java.util.Collections;

public class TestExmpl1 {
    public static void main(String[] args) {

        ArrayList<Digit> digits = new ArrayList();


        //digits.add(new Digit("one", Integer.MIN_VALUE));
        //digits.add(new Digit("two", Integer.MAX_VALUE));
        digits.add(new Digit("three", 3));
        digits.add(new Digit("four", 4));
        digits.add(new Digit("five", 5));

        //Collections.sort(digits);
        System.out.println(digits);
    }

}
