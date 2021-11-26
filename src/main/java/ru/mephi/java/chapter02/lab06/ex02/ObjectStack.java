package ru.mephi.java.chapter02.lab06.ex02;

import java.util.Arrays;
import java.util.EmptyStackException;

public class ObjectStack {
    private static final long serialVersionUID = 2300038343111821L;
    private Object[] stack;
    private int initialCapacity = 10;
    private int stackSize;

    public ObjectStack() {
        stack = new Object[initialCapacity];
        stackSize = 0;
    }

    public ObjectStack(int initialCapacity) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("Initial capacity must be positive!");
        }
        this.initialCapacity = initialCapacity;
        stack = new Object[initialCapacity];
        stackSize = 0;
    }

    public Object push(Object element) {
        int len;
        if (stack.length == stackSize) {
            len = stack.length * 3 / 2;
            Object[] newStack = new Object[len];
            System.arraycopy(stack, 0, newStack, 0, stackSize);
            newStack[stackSize] = element;
            stack = newStack;
        } else {
            stack[stackSize] = element;
        }
        stackSize++;
        return element;
    }

    public Object pop() {
        Object popElement = peek();
        remove();
        return popElement;
    }

    public Object remove() {
        if (isEmpty()) {
            System.err.println("Can't remove the element from an empty stack!");
            throw new EmptyStackException();
        }
        Object removedElement = stack[stackSize - 1];
        stack[stackSize-- - 1] = null;
        return removedElement;
    }

    public Object peek() {
        if (stack.length == 0) {
            System.err.println("Can't peek the element from an empty stack!");
            throw new EmptyStackException();
        }
        return stack[stackSize - 1];
    }

    public boolean isEmpty() {
        return stackSize == 0;
    }

    @Override
    public String toString() {
        return "ObjectStack{" +
                "stack=" + Arrays.toString(stack) +
                ", initialCapacity=" + initialCapacity +
                ", stackSize=" + stackSize +
                '}';
    }
}
