package ru.mephi.java.ch02.task02;

//Проанализируйте метод nextlnt () из класса Scanner. Является ли он методом доступа или модифицирующим методом и почему?
// А что можно сказать о методе nextlnt () из класса Random?

import java.util.Random;
        import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        System.out.println(i);
        System.out.println("in.nextInt является методом доступа, так как не изменяет объект, для которого он вызывается.");
        System.out.println("Scans the next token of the input as an int.\n");
        Random generator = new Random();
        int j = generator.nextInt(i);
        System.out.println(j);
        System.out.println("generator.nextInt является модифицирующим методом, так как изменяет последовательность случайных чисел, убирая из неё считанное число");
        System.out.println("Returns the next pseudorandom, uniformly distributed int value from this random number generator's sequence. \n The general contract of nextInt is that one int value is pseudorandomly generated and returned.");
    }
}
