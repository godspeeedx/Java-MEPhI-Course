package ru.mephi.java.chapter01.lab02.ex15;

import java.util.ArrayList;
import java.util.Iterator;

public class Invoice {
   private final ArrayList items = new ArrayList();

   public void addItem(String description, int quantity, double unitPrice) {
      Invoice.Item newItem = new Invoice.Item();
      newItem.description = description;
      newItem.quantity = quantity;
      newItem.unitPrice = unitPrice;
      this.items.add(newItem);
   }

   public void print() {
      double total = 0.0D;

      Invoice.Item item;
      for(Iterator var3 = this.items.iterator(); var3.hasNext(); total += item.price()) {
         item = (Invoice.Item)var3.next();
         System.out.println(item);
      }

      System.out.println("Total - $" + total);
   }

   private static class Item {
      String description;
      int quantity;
      double unitPrice;

      double price() {
         return (double)this.quantity * this.unitPrice;
      }

      public String toString() {
         return this.quantity + " x " + this.description + " at $" + this.unitPrice + " each";
      }
   }
}
