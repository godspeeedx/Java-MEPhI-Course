package ru.mephi.java.chapter01.lab02.ex11;

// Перепишите класс Са1, чтобы использовать в нем статический импорт классов
// System и LocalDate.

import java.time.DayOfWeek;
import java.time.LocalDate;

import static java.time.LocalDate.*;
import static java.lang.System.*;

public class Class11 {
    public static void main(String[] args) {
        LocalDate date = now().withDayOfMonth(1); // instead of LocalDate.now().wit...
        int month;
        if (args.length >= 2) {
            month = Integer.parseInt(args[0]);
            int year = Integer.parseInt(args[1]);
            date = of(year, month, 1); // instead of LocalDate.of()
        } else {
            month = date.getMonthValue();
        }
        //instead of System.out.println()...
        out.println(" Mon Tue Wed Thu Fri Sat Sun");
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue(); // 1 = Monday, ... 7 = Sunday
        for (int i = 1; i < value; i++)
            out.print(" ");
        while (date.getMonthValue() == month) {
            out.printf("%4d", date.getDayOfMonth());
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1)
                out.println();
        }
        if (date.getDayOfWeek().getValue() != 1)
            out.println();
    }
}
