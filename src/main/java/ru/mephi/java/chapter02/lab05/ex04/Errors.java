package ru.mephi.java.chapter02.lab05.ex04;

public enum Errors {
    OK(1),
    FILE_NOT_FOUND(2),
    INCORRECT_FORMAT(3);

    public final int code;

    Errors(int code) {
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