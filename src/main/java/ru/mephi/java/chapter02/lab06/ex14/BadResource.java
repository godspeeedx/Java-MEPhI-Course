package ru.mephi.java.chapter02.lab06.ex14;

public class BadResource implements AutoCloseable {
    @Override
    public void close() throws Exception {
        throw new Exception("Smth bad happened");
    }
}
