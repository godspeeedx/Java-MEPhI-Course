package ru.mephi.java.chapter02.lab06.ex24;

public class Test {
    public static void main(String[] args) {
        Class<?> clazz = null;
        clazz.getInterfaces();
        clazz.getSuperclass();
        clazz.getComponentType();
        clazz.isSynthetic();
        clazz.isSynthetic();
        clazz.getFields();
        clazz.getModifiers();
        clazz.getTypeName();
        // ...
        //* Без приведения переменной типа Class<?> я не могу вызвать метод newInstance()
        // и методы cast () при попытке записать результат этих методов в переменную типа
        //  кроме Object, поскольку они возвращают непосредственно тип T
    }
}
