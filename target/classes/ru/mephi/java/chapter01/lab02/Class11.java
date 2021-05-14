package ru.mephi.java.chapter01.lab02.ex11;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Class11 {
   public static void main(String[] args) {
      LocalDate date = LocalDate.now().withDayOfMonth(1);
      int month;
      if (args.length >= 2) {
         month = Integer.parseInt(args[0]);
         int year = Integer.parseInt(args[1]);
         date = LocalDate.of(year, month, 1);
      } else {
         month = date.getMonthValue();
      }

      System.out.println(" Mon Tue Wed Thu Fri Sat Sun");
      DayOfWeek weekday = date.getDayOfWeek();
      int value = weekday.getValue();

      for(int i = 1; i < value; ++i) {
         System.out.print(" ");
      }

      while(date.getMonthValue() == month) {
         System.out.printf("%4d", date.getDayOfMonth());
         date = date.plusDays(1L);
         if (date.getDayOfWeek().getValue() == 1) {
            System.out.println();
         }
      }

      if (date.getDayOfWeek().getValue() != 1) {
         System.out.println();
      }

   }
}
