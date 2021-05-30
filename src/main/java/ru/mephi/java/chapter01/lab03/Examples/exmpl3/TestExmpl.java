package ru.mephi.java.chapter01.lab03.Examples.exmpl3;

import java.util.Random;

public class TestExmpl {
    public static void main(String[] args) {
        Random gen = new Random();
        IntSequence test = new IntSequence() {
            int count = 5;

            @Override
            public int next() {
                return gen.nextInt(7);
            }

            @Override
            public boolean hasNext() {
                if (count != 0) {
                    count--;
                    return true;
                } else {
                    return false;
                }
            }
        };

        System.out.println("For class");
        for (int i = 0; i < 8; i++) {
            boolean check = test.hasNext();
            System.out.println(check);
            if (check) {
                System.out.println(test.next());
            }
        }

        IntSequence testlambda = () -> gen.nextInt(7);
        System.out.println("For lambda");
        for (int i = 0; i < 8; i++) {
            boolean check = testlambda.hasNext();
            System.out.println(check);
            if (check) {
                System.out.println(testlambda.next());
            }
        }

    }
}
