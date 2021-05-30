package ru.mephi.java.chapter01.lab03.Examples.exmpl2;

public class Digit implements Comparable<Digit>, IntTest{
    private String digitName;
    private int digit;


    public Digit(String digitName, int digit) {
        this.digitName = digitName;
        this.digit = digit;
    }

    public String getDigitName() {
        return digitName;
    }



    public int getDigit() {
        return digit;
    }

    @Override
    public String toString() {
        return "Digit{" +
                "digitName='" + digitName + '\'' +
                ", digit=" + digit +
                '}';
    }

    @Override
    public int compareTo(Digit o) {
        return getDigit() - o.getDigit();
    }

    @Override
    public void test() {

    }
}
