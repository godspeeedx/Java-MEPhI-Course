package ru.mephi.java.chapter02.lab05.Extra.Extra3;

public class WithExceptions {
    public static double toDouble(int i) throws MyException {
        if (i > 5) {
            throw new MyException("Больше 5!");
        }
        return i;
    }
}
