package ru.mephi.java.chapter01.lab02.ex04;


public class Test {
    public static void main(String[] args) {

        int i = 7;
        int j = 17;
        System.out.println("Start - " + i + " and " + j + ".");
        IntHolder.intSwap(i,j);
        System.out.println("After intSwap - " + i + " and " + j + ".");

        IntHolder a = new IntHolder(7);
        IntHolder b = new IntHolder(17);
        System.out.println("\nStart - " + a.getValue() + " and " + b.getValue() + ".");
        IntHolder.intHolderSwap(a,b);
        System.out.println("After intHolderSwap - " + a.getValue() + " and " + b.getValue() + ".");
    }
}
