package ru.mephi.java.chapter01.lab02.ex10;

import java.util.ArrayList;
import java.util.Random;

public class RandomNumbers {
   public static int randomElement(int[] data) {
      Random generator = new Random();
      if (data.length == 0) {
         return 0;
      } else {
         int position = generator.nextInt(data.length);
         return data[position];
      }
   }

   public static int randomElement(ArrayList data) {
      Random generator = new Random();
      if (data.isEmpty()) {
         return 0;
      } else {
         int position = generator.nextInt(data.size());
         return (Integer)data.get(position);
      }
   }
}
