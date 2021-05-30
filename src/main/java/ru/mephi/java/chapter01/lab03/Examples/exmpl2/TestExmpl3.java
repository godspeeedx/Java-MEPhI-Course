package ru.mephi.java.chapter01.lab03.Examples.exmpl2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestExmpl3 {
    public static void main(String[] args) {

        ArrayList<Digit> digits = new ArrayList<>();

        Digit test1 = new Digit("seven", 7);
        Digit test2 = new Digit("nine", 9);
        Digit test3 = new Digit("twenty seven", 27);

        digits.add(test3);
        digits.add(test2);
        digits.add(test1);

        sort(digits,1);
        System.out.println(digits);
        sort(digits,2);
        System.out.println(digits);


        Collections.sort(digits, Comparator.comparingInt(Digit::getDigit));
        System.out.println(digits);
        Collections.sort(digits, Comparator.comparing(Digit::getDigitName, (s, t) -> s.length() - t.length()));
        System.out.println(digits);


    }

    public static void sort(ArrayList<Digit> digits, int fl) {
        for (int i = digits.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                int x;
                if (fl == 1) {
                    x = compare1(digits.get(j), digits.get(j + 1));
                } else {
                    x = compare2(digits.get(j), digits.get(j + 1));
                }
                if (x > 0) {
                    Digit buf = digits.get(j);
                    digits.set(j, digits.get(j + 1));
                    digits.set(j + 1, buf);
                }
            }
        }
    }

    public static int compare1(Digit first, Digit second){
        if (first.getDigit() > second.getDigit()) {
            return 1;
        } else {
            if (first.getDigit() < second.getDigit()) {
                return -1;
            } else {
                return 0;
            }
        }
    }

    public static int compare2(Digit first, Digit second){
        if (first.getDigitName().length() > second.getDigitName().length()) {
            return 1;
        } else {
            if (first.getDigitName().length() < second.getDigitName().length()) {
                return -1;
            } else {
                return 0;
            }
        }
    }

}
