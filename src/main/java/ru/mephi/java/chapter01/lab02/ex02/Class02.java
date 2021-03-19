package ru.mephi.java.chapter01.lab02.ex02;

//Проанализируйте метод nextlnt () из класса Scanner. Является ли он методом доступа или модифицирующим методом и почему?
// А что можно сказать о методе nextlnt () из класса Random?

import java.util.Random;
import java.util.Scanner;

public class Class02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        System.out.println(i);
        System.out.println("in.nextInt является методом-аксессором, так как не изменяет объект, для которого он вызывается. А возвращает интовый \"токен\" и присваивает его значение переменной");
        Random generator = new Random();
        int j = generator.nextInt(i);
        System.out.println(j);
        System.out.println("generator.nextInt является методом-мутатором, так как изменяет последовательность ГСЧ, убирая из нее число, которое считал (???)");
    }
}
