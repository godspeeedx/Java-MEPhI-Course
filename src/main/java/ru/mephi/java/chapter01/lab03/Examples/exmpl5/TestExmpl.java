package ru.mephi.java.chapter01.lab03.Examples.exmpl5;

import ru.mephi.java.chapter01.lab03.Examples.exmpl2.Digit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public class TestExmpl {

    public static void main(String[] args) {
        ArrayList<Digit> digits = new ArrayList();
        Digit[] digs = new Digit[5];
        digits.add(new Digit("two", 2));
        digs[0] = new Digit("two", 2);
        digits.add(new Digit("three", 3));
        digs[1] = new Digit("three", 3);
        digits.add(new Digit("four", 4));
        digs[2] = new Digit("four", 4);
        digits.add(new Digit("five", 5));
        digs[3] = new Digit("five", 5);
        digits.add(new Digit("one", 1));
        digs[4] = new Digit("one", 1);

        //Arrays.sort(digs);
        //System.out.println(digs);

        //�����::���������������
        Collections.sort(digits, Digit::compareTo);
        //Collections.sort(digits, Digit::test);
        System.out.println(digits);
        //�����::�����������
        digits.removeIf(Objects::nonNull);
        System.out.println(digits);
        //������::��������
        digits.add(new Digit("six", 6));
        digits.add(new Digit("seven", 7));
        digits.forEach(System.out::println);

    }
}
