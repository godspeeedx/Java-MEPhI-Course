package ru.mephi.java.chapter01.lab02.ex06;

public class Point {
   double x;
   double y;

   public Point() {
      this.x = 0.0D;
      this.y = 0.0D;
   }

   public Point(double x, double y) {
      this.x = x;
      this.y = y;
   }

   public double getX() {
      return this.x;
   }

   public double getY() {
      return this.y;
   }

   public Point translate(double x, double y) {
      this.x += x;
      this.y += y;
      return this;
   }

   public Point scale(double factor) {
      this.x *= factor;
      this.y *= factor;
      return this;
   }
}
