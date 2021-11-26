package ru.mephi.java.chapter02.lab05.Extra.Extra3;

public enum Error {
    OK(1),
    MORE_THAN_5(2);

    public final int code;

    Error(int code) {
        this.code = code;
    }

    public int getCode() {
        return this.code;
    }

    @Override
    public String toString() {
        return "code = " + this.code;
    }
}
