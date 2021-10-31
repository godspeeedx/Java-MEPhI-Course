package ru.mephi.java.chapter02.lab05.ex08;

import java.util.concurrent.locks.ReentrantLock;

public class Class08 extends ReentrantLock implements AutoCloseable {
    @Override
    public void close() {
        this.unlock();
    }
}
