package ru.mephi.java.chapter01.lab03.Examples.exmpl3;

public interface IntSequence {
    int next();
    default boolean hasNext(){
        return true;
    }
}
