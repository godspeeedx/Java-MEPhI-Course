package ru.mephi.java.chapter01.lab04.ex11;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Class11 {

    public static void print(String message) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Class<?> cl = Class.forName("java.lang.System"); // class not found
        Field out = cl.getDeclaredField("out");// no such field
        Class<?> outClass = out.getType();
        Method println = outClass.getMethod("println", String.class);//no such method
        println.invoke(out.get(null), message);//invocation target exception, illegal access

    }

    public static void main(String[] args) throws NoSuchMethodException, NoSuchFieldException, ClassNotFoundException, IllegalAccessException, InvocationTargetException {
        print("Hello, world!");
    }

}
