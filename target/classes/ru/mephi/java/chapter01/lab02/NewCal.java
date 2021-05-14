package ru.mephi.java.chapter01.lab02.Extra01;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class NewCal {
   private int printDates(String weekStart) {
      String[] week = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

      int i;
      for(i = 0; !week[i].equals(weekStart); ++i) {
      }

      System.out.print(" ");

      int j;
      for(j = i; j < 7; ++j) {
         System.out.print(week[j] + " ");
      }

      for(j = 0; j < i; ++j) {
         System.out.print(week[j] + " ");
      }

      System.out.println();
      return i + 1;
   }

   public void printAnyDayCal(String weekStart, int month, int year) {
      LocalDate date = LocalDate.of(year, month, 1);
      int weekStartValue = this.printDates(weekStart);
      DayOfWeek weekday = date.getDayOfWeek();
      int actualStartValue = weekday.getValue();
      int i;
      if (weekStartValue > actualStartValue) {
         for(i = 0; i < 7 - weekStartValue + actualStartValue; ++i) {
            System.out.print("    ");
         }
      } else if (weekStartValue < actualStartValue) {
         for(i = 0; i < actualStartValue - weekStartValue; ++i) {
            System.out.print("    ");
         }
      }

      while(date.getMonthValue() == month) {
         System.out.printf("%4d", date.getDayOfMonth());
         date = date.plusDays(1L);
         if (date.getDayOfWeek().getValue() == weekStartValue) {
            System.out.println();
         }
      }

      System.out.println();
   }
}
