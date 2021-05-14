package ru.mephi.java.chapter01.lab02.Extra07.Functions;

import Structure.struct.Data;
import Structure.struct.FileSystem;
import Structure.struct.Segment;

public class MethodsForFunctions {
   public static boolean checkFileExist(FileSystem fs, String fileName) {
      boolean findName = false;

      for(int i = 0; i < fs.segments.size(); ++i) {
         for(int j = 0; j < ((Segment)fs.segments.get(i)).datas.size(); ++j) {
            if (((Data)((Segment)fs.segments.get(i)).datas.get(j)).type && ((Data)((Segment)fs.segments.get(i)).datas.get(j)).getName().equals(fileName)) {
               findName = true;
               return findName;
            }
         }
      }

      return findName;
   }
}
