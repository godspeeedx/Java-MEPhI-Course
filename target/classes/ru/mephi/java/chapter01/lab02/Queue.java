package ru.mephi.java.chapter01.lab02.Extra06;

import java.util.ArrayList;

public class Queue {
   private int head;
   private ArrayList nodes = new ArrayList();

   public boolean checkMemory() {
      return this.head > this.nodes.size() / 2;
   }

   public ArrayList rearrange() {
      ArrayList newNodes = new ArrayList(this.size());

      for(int i = this.head; i < this.size(); ++i) {
         newNodes.add((String)this.nodes.get(i));
      }

      return newNodes;
   }

   public void add(String data) {
      if (this.checkMemory()) {
         this.nodes = this.rearrange();
      }

      this.nodes.add(data);
   }

   public String remove() {
      if (this.checkMemory()) {
         this.nodes = this.rearrange();
      }

      if (this.size() == 0) {
         return null;
      } else {
         String buf = (String)this.nodes.get(this.head);
         this.nodes.set(this.head, (Object)null);
         ++this.head;
         return buf;
      }
   }

   public int size() {
      return this.nodes.size() - this.head;
   }
}
