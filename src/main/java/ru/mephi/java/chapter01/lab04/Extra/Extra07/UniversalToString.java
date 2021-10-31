package ru.mephi.java.chapter01.lab04.Extra.Extra07;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.HashMap;

public class UniversalToString {
    private HashMap<Object, String> hashMap = new HashMap<>();

    public String universalToString(Object object) throws IllegalAccessException {
        hashMap.clear();
        hashMap.put(object, "");
        return myToString(object, hashMap, 0);
    }

    private String myToString(Object object, HashMap<Object, String> hashMap, int count) throws IllegalAccessException {

        if (object == null) {
            return "null";
        }

        Class<?> cl = object.getClass();
        if (cl == String.class) {
            return (String) object;
        }

        if (cl.isArray()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("[");
            for (int i = 0; i < Array.getLength(object); i++) {
                Object obj = Array.get(object, i);
                stringBuilder.append(myToString(obj, hashMap, count));
                if (i != Array.getLength(object) - 1) {
                    stringBuilder.append(",");
                } else {
                    stringBuilder.append("]");
                }
            }
            return stringBuilder.toString();
        }

        if (object instanceof Collection<?>) {
            return myToString(((Collection<?>) object).toArray(), hashMap, count);
        }

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        hashMap.replace(object, ("Element ¹" + (++count) + " - "));
        stringBuilder.append(hashMap.get(object));
        stringBuilder.append(cl.getSimpleName());
        stringBuilder.append("[");
        do {

            Field[] fields = cl.getDeclaredFields();
            AccessibleObject.setAccessible(fields, true);
            for (Field f : fields) {
                if (!stringBuilder.toString().endsWith("[")) {
                    stringBuilder.append(", ");
                }
                stringBuilder.append(f.getName()).append(" = ");
                Class<?> cl2 = f.getType();
                Object obj = f.get(object);
                if (cl2.isPrimitive()) {
                    stringBuilder.append(obj);
                } else {
                    if (hashMap.containsKey(obj) && !hashMap.get(obj).equals("")) {
                        stringBuilder.append(hashMap.get(obj)).append("End of a cycle!");

                    } else {
                        if (obj != null) {
                            String number = "";
                            hashMap.put(obj, number);
                        }
                        stringBuilder.append(myToString(obj, hashMap, count));
                    }
                }
            }
            stringBuilder.append("]");
            cl = cl.getSuperclass();
            String number = "Element ¹";
            number += count;
            number += " - ";
            hashMap.put(object, number);
            if (cl == Object.class) {
                return stringBuilder.toString();
            }
        } while (cl != null);
        return stringBuilder.toString();
    }
}