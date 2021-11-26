package ru.mephi.java.chapter02.lab06.ex01;

public class Test {

    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        System.out.println(integerStack.isEmpty());
        System.out.println(integerStack.push(322));
        System.out.println(integerStack.isEmpty());
        System.out.println(integerStack.pop());
        System.out.println(integerStack.isEmpty());
        System.out.println(integerStack.push(-1547));
        System.out.println(integerStack.push(322));
        System.out.println(integerStack.pop());
        System.out.println(integerStack.isEmpty());
        System.out.println(integerStack.push(323));
        System.out.println(integerStack.push(324));
        System.out.println(integerStack.push(324));
        System.out.println(integerStack.push(326));
        System.out.println(integerStack.push(327));
        System.out.println(integerStack.push(328));
        System.out.println(integerStack.push(329));
        System.out.println(integerStack.push(3210));
        System.out.println(integerStack.push(3211));
        System.out.println(integerStack.push(3212));
        System.out.println(integerStack.pop());
    }

}
