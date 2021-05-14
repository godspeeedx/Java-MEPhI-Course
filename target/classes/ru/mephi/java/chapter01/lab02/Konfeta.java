package ru.mephi.java.chapter01.lab02.ex08;

public class Konfeta {
   private String color;
   private boolean edible;
   private int amount;

   public Konfeta(String color, boolean edible, int amount) {
      this.color = color;
      this.edible = edible;
      this.amount = amount;
   }

   public String toString() {
      return "Konfeta{color='" + this.color + "', edible=" + this.edible + ", amount=" + this.amount + "}";
   }

   public static void main(String[] args) {
   }
}
