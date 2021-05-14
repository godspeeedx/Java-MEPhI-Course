package ru.mephi.java.chapter01.lab03.ex04;

public interface IntSequence {
    boolean hasNext();

    int next();

    static IntSequence of(int... objects) {
        class ReturnedIntSequence implements IntSequence {
            private int currInt = 0;

            @Override
            public boolean hasNext() {
                return this.currInt != objects.length;
            }

            @Override
            public int next() {
                if (this.hasNext()) {
                    return objects[currInt++];
                } else {
                    return 0;
                }
            }
        }
        return new ReturnedIntSequence();
    }
}
