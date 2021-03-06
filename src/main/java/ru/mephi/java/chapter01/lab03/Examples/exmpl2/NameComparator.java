package ru.mephi.java.chapter01.lab03.Examples.exmpl2;

import java.util.Comparator;

public class NameComparator implements Comparator<Digit> {
    @Override
    public int compare(Digit o1, Digit o2) {
        return o1.getDigitName().length() - o2.getDigitName().length();
    }
}
