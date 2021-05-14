package ru.mephi.java.chapter01.lab02.Extra07.Structure.struct;

public class Data {
   public boolean type = true;
   public String name;
   public int size;

   public Data(String name, int size) {
      this.name = name;
      this.size = size;
   }

   public boolean isType() {
      return this.type;
   }

   public String getName() {
      return this.name;
   }

   public int getSize() {
      return this.size;
   }

   public String toString() {
      return "Data{type=" + this.type + ", name='" + this.name + "', size=" + this.size + "}";
   }

   public void setType(boolean type) {
      this.type = type;
   }

   public void setName(String name) {
      this.name = name;
   }

   public void setSize(int size) {
      this.size = size;
   }

   public void addSize(int size) {
      this.size += size;
   }
}
