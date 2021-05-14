package ru.mephi.java.chapter01.lab03.ex05;

public class Class05 {
    public static void main(String[] args) {
        IntSequence seq = IntSequence.constant(1);
        test(seq);
    }

    public static void test(IntSequence seq) {
        int i = 0;
        while (seq.hasNext() && i++ < 10) {
            System.out.printf("%s ", seq.next());
        }
    }
}
