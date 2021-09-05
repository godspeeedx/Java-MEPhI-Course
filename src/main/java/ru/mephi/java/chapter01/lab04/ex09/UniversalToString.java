package ru.mephi.java.chapter01.lab04.ex09;

import java.lang.reflect.Field;

public class UniversalToString {

    public static String toString(Object other) {
        StringBuilder sb = new StringBuilder();
        Class cl = other.getClass();
        for (Field f : cl.getDeclaredFields()) {
            sb.append(f.getName());
            sb.append(":");
            try {
                sb.append(f.get(other));
            } catch (IllegalAccessException e) {
                sb.append("Not accessable");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
