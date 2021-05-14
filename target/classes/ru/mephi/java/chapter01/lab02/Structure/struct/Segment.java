package ru.mephi.java.chapter01.lab02.Extra07.Structure.struct;

import java.util.ArrayList;

public class Segment {
   public static int lastBlockNumber = 1;
   public int firstBlockNumber;
   public ArrayList datas;
   public int currentDataNum;

   public Segment(int maxDataNum) {
      this.firstBlockNumber = lastBlockNumber;
      this.datas = new ArrayList(maxDataNum);
      this.currentDataNum = 0;
   }
}
