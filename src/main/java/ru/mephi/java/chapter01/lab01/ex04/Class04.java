package ru.mephi.java.chapter01.lab01.ex04;

// Напишите программу, выводящую наименьшее и наибольшее положительные значения типа double.
// Подсказка: воспользуйтесь методом Math.nextUp () из прикладного программного интерфейса Java API.

public class Class04 {
    public static void main(String[] args) {

        System.out.printf("\nНаименьшее положительное значение типа double - %e\n", Math.nextUp(0.0));
        System.out.printf("Наименьшее положительное значение типа double - %g\n", Math.nextUp(0.0));
        System.out.printf("Наибольшее положительное значение типа double - %e\n", Math.nextDown(1.0/0.0));
        System.out.printf("Наибольшее положительное значение типа double - %g\n", Math.nextDown(1.0/0.0));
        System.out.println("\nЗадание выполнено!");
    }
}
