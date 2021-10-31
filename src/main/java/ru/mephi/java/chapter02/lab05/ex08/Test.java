package ru.mephi.java.chapter02.lab05.ex08;

import java.util.concurrent.locks.ReentrantLock;

public class Test {

    public static void main(String[] args) {
        // Вариант 1
        try (AutoCloseable autoCloseable = helperToReentrantLock(new ReentrantLock())) {
            // some code
        } catch (Exception ex) {
            System.err.println("Thrown exception" + ex.getMessage());
        }

        // Вариант 2
        try (AutoCloseable locker = lock()) {
            // ...
        } catch (Exception ex) {
            System.err.println(ex.getLocalizedMessage());
        }
    }

    public static AutoCloseable helperToReentrantLock(ReentrantLock reentrantLock) {
        reentrantLock.lock();
        return reentrantLock::unlock;
    }

    public static AutoCloseable lock() {
        Class08 locker = new Class08();
        locker.lock();
        return locker;
    }

}
