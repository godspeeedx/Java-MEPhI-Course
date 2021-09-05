package ru.mephi.java.chapter01.lab03.Examples.exmpl3;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

public interface IMyIterator<T> {
    T next();

    boolean hasNext();

    default IMyIterator<T> filter(Predicate<T> pred) {
        IMyIterator<T> iter = this;

        return new IMyIterator<T>() {
            T nextObject;
            boolean nextObjectSet = false;

            @Override
            public T next() {
                if (!nextObjectSet) {
                    if (!setNextObject()) {
                        throw new NoSuchElementException();
                    }
                }
                nextObjectSet = false;
                return nextObject;
            }

            @Override
            public boolean hasNext() {
                if (nextObjectSet) {
                    return true;
                } else {
                    return setNextObject();
                }
            }

            private boolean setNextObject() {
                while (iter.hasNext()) {
                    T object = iter.next();
                    if (pred.test(object)) {
                        nextObject = object;
                        nextObjectSet = true;
                        return true;
                    }
                }
                return false;
            }
        };
    }



    static <T> IMyIterator<T> fromIterator(Iterator<T> iter) {
        return new IMyIterator<T>() {

            @Override
            public T next() {
                return iter.next();
            }

            @Override
            public boolean hasNext() {
                return iter.hasNext();
            }
        };
    }


    default   <K> Map<K, List<T>> collectToMap(Function<T, K> function) {
        Map<K, List<T>> map = new HashMap<>();
        while (hasNext()) {
            T object = next();
            K key = function.apply(object);
            if (!map.containsKey(key)) {
                List<T> newlist = new ArrayList<>();
                newlist.add(object);
                map.put(key, newlist);
            } else {
                List<T> list = map.get(key);
                list.add(object);
            }
        }
        return map;
    }
}
