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
        //* ��� ���������� ���������� ���� Class<?> � �� ���� ������� ����� newInstance()
        // � ������ cast () ��� ������� �������� ��������� ���� ������� � ���������� ����
        //  ����� Object, ��������� ��� ���������� ��������������� ��� T
    }
}
