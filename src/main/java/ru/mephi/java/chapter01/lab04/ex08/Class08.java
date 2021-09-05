package ru.mephi.java.chapter01.lab04.ex08;

public class Class08 {

    public static void main(String[] args) {
        //Массивы - классы, интерфейсы примитивы и void нет

        System.out.println("----------------- Arrays (String[]) -----------------");
        System.out.println("getCanonicalName(): " + String[].class.getCanonicalName() + "\n"
                + "getName():\t\t\t" + String[].class.getName() + "\n"
                + "getSimpleName():\t" + String[].class.getSimpleName() + "\n"
                + "getTypeName():  \t" + String[].class.getTypeName() + "\n"
                + "toString():\t\t\t" + String[].class.toString() + "\n"
                + "toGenericString():  " + String[].class.toGenericString());
        System.out.println();

        System.out.println("----------------- Primitives (int) -----------------");
        System.out.println("getCanonicalName(): " + Integer.class.getCanonicalName() + "\n"
                + "getName():\t\t\t" + Integer.class.getName() + "\n"
                + "getSimpleName():\t" + Integer.class.getSimpleName() + "\n"
                + "getTypeName():  \t" + Integer.class.getTypeName() + "\n"
                + "toString():\t\t\t" + Integer.class.toString() + "\n"
                + "toGenericString():  " + Integer.class.toGenericString());
        System.out.println();

        System.out.println("----------------- Users class -----------------");
        System.out.println("getCanonicalName(): " + MyClass.class.getCanonicalName() + "\n"
                + "getName():\t\t\t" + MyClass.class.getName() + "\n"
                + "getSimpleName():\t" + MyClass.class.getSimpleName() + "\n"
                + "getTypeName():  \t" + MyClass.class.getTypeName() + "\n"
                + "toString():\t\t\t" + MyClass.class.toString() + "\n"
                + "toGenericString():  " + MyClass.class.toGenericString());
        System.out.println();

        System.out.println("----------------- Nested class -----------------");
        System.out.println("getCanonicalName(): " + MyClass.NestedClass.class.getCanonicalName() + "\n"
                + "getName():\t\t\t" + MyClass.NestedClass.class.getName() + "\n"
                + "getSimpleName():\t" + MyClass.NestedClass.class.getSimpleName() + "\n"
                + "getTypeName():  \t" + MyClass.NestedClass.class.getTypeName() + "\n"
                + "toString():\t\t\t" + MyClass.NestedClass.class.toString() + "\n"
                + "toGenericString():  " + MyClass.NestedClass.class.toGenericString());

    }
}
