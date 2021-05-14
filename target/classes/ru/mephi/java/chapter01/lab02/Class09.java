package ru.mephi.java.chapter01.lab02.ex09;

public class Class09 {
   public static class Car {
      private final double consumptionRate;
      private double fuel;
      private double distance;

      public Car(double consumptionRate, double fuel) {
         this.distance = 0.0D;
         this.consumptionRate = consumptionRate;
         this.fuel = fuel;
      }

      public Car(double consumptionRate) {
         this(consumptionRate, 10.0D);
      }

      public double getFuel() {
         return this.fuel;
      }

      public double getDistance() {
         return this.distance;
      }

      public void drive(double distance) {
         double fuelNeeded = distance / this.consumptionRate;
         if (fuelNeeded > this.fuel) {
            System.out.println("Not enough fuel. You need " + fuelNeeded + " fuel to drive " + distance + ", but you only have " + this.fuel);
         } else {
            this.distance += distance;
            this.fuel -= fuelNeeded;
         }

      }

      public void refuel(double fuel) {
         this.fuel += fuel;
      }
   }
}
