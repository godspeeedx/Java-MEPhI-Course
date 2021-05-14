package ru.mephi.java.chapter01.lab02.Extra07.Structure.struct;

public interface iMonitor {
   void writeMessage(String var1);

   String readString(String var1);

   int readFileSize(String var1);

   int readSystemSize(String var1);

   int readMaxSegmentNum(String var1);

   int readMaxDataNum(String var1);
}
