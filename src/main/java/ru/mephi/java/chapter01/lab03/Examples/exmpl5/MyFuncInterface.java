package ru.mephi.java.chapter01.lab03.Examples.exmpl5;

import ru.mephi.java.chapter01.lab03.Examples.exmpl2.Digit;

@FunctionalInterface
public interface MyFuncInterface {
    String getSomething(Digit from);

    default void doSomethingElse(){
    };

}
