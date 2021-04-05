package ru.mephi.java.chapter01.lab02.Extra01;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class NewCal {

    private static int printDates(String weekStart) {

        String[] week = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        int i = 0;
        while (!week[i].equals(weekStart)) {
            i++;
        }
        System.out.print(" ");
        for (int k = i; k < 7; k++) {
            System.out.print(week[k] + " ");
        }
        for (int j = 0; j < i; j++) {
            System.out.print(week[j] + " ");
        }
        System.out.println();
        return i + 1;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the day the week starts:");
        String weekStart = in.next();
        System.out.println("Enter the month:");
        int month = in.nextInt();
        System.out.println("Enter the year:");
        int year = in.nextInt();
        LocalDate date = LocalDate.of(year, month, 1);

        int weekStartValue = printDates(weekStart);

        DayOfWeek weekday = date.getDayOfWeek();

        int actualStartValue = weekday.getValue(); // 1 = Monday, ... 7 = Sunday
        if (weekStartValue > actualStartValue) {
            for (int i = 0; i < (7 - weekStartValue + actualStartValue); i++)
                System.out.print("    ");
        } else if (weekStartValue < actualStartValue) {
            for (int i = 0; i < actualStartValue - weekStartValue; i++)
                System.out.print("    ");
        }
        while (date.getMonthValue() == month) {
            System.out.printf("%4d", date.getDayOfMonth());
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == weekStartValue)
                System.out.println();
        }
        System.out.println();
    }

}
