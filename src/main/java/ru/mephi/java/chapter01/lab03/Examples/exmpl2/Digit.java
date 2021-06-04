package ru.mephi.java.chapter01.lab03.Examples.exmpl2;

public class Digit implements Comparable<Digit> {
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

    public void anothertest(){
        System.out.println("tr");
    }

    public int length2(String stroka){
        return stroka.length();
    }

    public static void privet(){
        System.out.println("privet");
    }

    public int anotherCompare(Digit o){
        if (getDigit() > o.getDigit())
            return 1;
        else if (getDigit() == o.getDigit())
            return 0;
        else
            return -1;
    }

    @Override
    public int compareTo(Digit o) {
        if (getDigit() > o.getDigit())
            return 1;
        else if (getDigit() == o.getDigit())
            return 0;
        else
            return -1;
    }

}

