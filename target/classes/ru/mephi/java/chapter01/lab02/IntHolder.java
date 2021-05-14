package ru.mephi.java.chapter01.lab02.ex04;

public class IntHolder {
   private int value;

   public IntHolder(int value) {
      this.value = value;
   }

   public void setValue(int value) {
      this.value = value;
   }

   public int getValue() {
      return this.value;
   }

   public static void intSwap(int a, int b) {
   }

   public static void intHolderSwap(IntHolder a, IntHolder b) {
      int temp = a.getValue();
      a.setValue(b.getValue());
      b.setValue(temp);
   }
}
