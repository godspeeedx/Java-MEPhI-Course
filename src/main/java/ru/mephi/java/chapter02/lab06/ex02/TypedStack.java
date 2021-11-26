package ru.mephi.java.chapter02.lab06.ex02;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.EmptyStackException;

public class TypedStack<E> {
    private static final long serialVersionUID = 23000038282821L;
    private E[] stack;
    private int initialCapacity = 10;
    private int stackSize;

    @SuppressWarnings("unchecked")
    public TypedStack() {
        stack = (E[]) new Object[initialCapacity];
        stackSize = 0;
    }

    @SuppressWarnings("unchecked")
    public TypedStack(int initialCapacity) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("Initial capacity must be positive!");
        }
        this.initialCapacity = initialCapacity;
        stack = (E[]) new Object[initialCapacity];
        stackSize = 0;
    }

    @SuppressWarnings("unchecked")
    public E push(E element) {
        int len;
        if (stack.length == stackSize) {
            len = stack.length * 3 / 2;
            E[] newStack = (E[]) TypedStack.newArray(element.getClass(), len);
            System.arraycopy(stack, 0, newStack, 0, stackSize);
            newStack[stackSize] = element;
            stack = newStack;
        } else {
            stack[stackSize] = element;
        }
        stackSize++;
        return element;
    }

    public E pop() {
        E popElement = peek();
        remove();
        return popElement;
    }

    public E remove() {
        if (isEmpty()) {
            System.err.println("Can't remove the element from an empty stack!");
            throw new EmptyStackException();
        }
        E removedElement = stack[stackSize - 1];
        stack[stackSize-- - 1] = null;
        return removedElement;
    }

    public E peek() {
        if (stack.length == 0) {
            System.err.println("Can't peek the element from an empty stack!");
            throw new EmptyStackException();
        }
        return stack[stackSize - 1];
    }

    public boolean isEmpty() {
        return stackSize == 0;
    }

    @SuppressWarnings("unchecked")
    private static <T> T[] newArray(Class<T> type, int len) {
        return (T[]) Array.newInstance(type, len);
    }

    @Override
    public String toString() {
        return "TypedStack{" +
                "stack=" + Arrays.toString(stack) +
                ", initialCapacity=" + initialCapacity +
                ", stackSize=" + stackSize +
                '}';
    }
}
