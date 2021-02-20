package ru.mephi.java.chapter01.lab01.ex13;

//Напишите программу, выбирающую и выводящую лотерейную комбинацию из шести отдельных чисел в пределах от 1 до 49.
// Чтобы выбрать шесть отдельных чисел, начните со списочного массива, заполняемого числами от 1 до 49.
// Выберите произвольный индекс и удалите элемент массива. Повторите эти действия шесть раз подряд.
// Выведите полученный результат в отсортированном порядке.

import java.util.Arrays;
import java.util.Random;
import java.util.ArrayList;

public class Class13 {
    public static void main(String[] args) {
        final int maxLotteryNumber = 49;
        ArrayList<Integer> possibleNumbers = new ArrayList<>();
        for (int i = 1; i < maxLotteryNumber + 1; i++) {
            possibleNumbers.add(i);
        }
        Random generator = new Random();
        final int lotteryTicketLength = 6;
        int[] lotteryTicket = new int[lotteryTicketLength];
        for (int i = 0; i < lotteryTicketLength; i++) {
            int randomIndex = generator.nextInt(possibleNumbers.size());
            lotteryTicket[i] = possibleNumbers.get(randomIndex);
            possibleNumbers.remove(randomIndex);
        }
        Arrays.sort(lotteryTicket);
        System.out.println("Полученный лотерейный билет:\n" + Arrays.toString(lotteryTicket));
        System.out.println("\nЗадание выполнено!");

    }
}
