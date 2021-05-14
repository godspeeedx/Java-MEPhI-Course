package ru.mephi.java.chapter01.lab03.ex05;

public interface IntSequence {
    default boolean hasNext() {
        return true;
    }

    int next();

    static IntSequence constant(int constant) {
        return new IntSequence() {
            @Override
            public int next() {
                return constant;
            }
        };
    }

}
