package ru.mephi.java.chapter01.lab02.Extra07.Structure.struct;

import java.util.ArrayList;

public class FileSystem {
   public String systemName;
   public static int systemSize;
   public int maxSegmentNum;
   public ArrayList segments;
   public int maxDataNum;

   public FileSystem(String systemName, int systemSize, int maxSegmentNum, int maxDataNum) {
      this.systemName = systemName;
      FileSystem.systemSize = systemSize;
      this.maxSegmentNum = maxSegmentNum;
      this.segments = new ArrayList();
      this.maxDataNum = maxDataNum;
   }

   public void copy(FileSystem buf) {
      this.systemName = buf.systemName;
      this.maxSegmentNum = buf.maxSegmentNum;
      this.maxDataNum = buf.maxDataNum;
      this.segments = buf.segments;
   }

   public String toString() {
      return "FileSystem{systemName='" + this.systemName + "', systemSize=" + systemSize + ", maxSegmentNum=" + this.maxSegmentNum + ", maxDataNum=" + this.maxDataNum + "}";
   }
}
