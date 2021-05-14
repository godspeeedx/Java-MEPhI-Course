package ru.mephi.java.chapter01.lab02.Extra02;

import java.util.Objects;

public class Zoo {
   private String name = "Moscow Zoo";
   private static int showcase = 0;

   public String getName() {
      return this.name;
   }

   public static void main(String[] args) {
      Zoo zoo = new Zoo();
      Objects.requireNonNull(zoo);
      Zoo.Elephant slon = zoo.new Elephant();
      Zoo.Snake python = new Zoo.Snake();
      slon.print();
      python.print();
   }

   private class Elephant {
      public String whereAmI() {
         return Zoo.this.getName();
      }

      public void print() {
         System.out.println(Zoo.this.name + Zoo.showcase);
      }
   }

   private static class Snake {
      public void print() {
         System.out.println(Zoo.showcase);
      }
   }
}
