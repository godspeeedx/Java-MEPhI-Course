package ru.mephi.java.chapter01.lab03.Examples.exmpl2;

import java.util.Comparator;

public class NumberComparator implements Comparator<Digit> {
    @Override
    public int compare(Digit o1, Digit o2) {
        if (o1.getDigit() > o2.getDigit())
            return 1;
        else if (o1.getDigit() == o2.getDigit())
            return 0;
        else
            return -1;
    }
}
