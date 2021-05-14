package ru.mephi.java.chapter01.lab02.Extra07.Functions;

import Structure.struct.Data;
import Structure.struct.FileSystem;
import Structure.struct.Segment;
import Structure.struct.iCommand;
import Structure.struct.iMonitor;

public class Print extends BaseCommand implements iCommand {
   public Print(iMonitor im, FileSystem fileSystem) {
      super(im, fileSystem);
   }

   public static String toString(FileSystem fs) {
      if (fs.segments.size() == 0) {
         return "Файловая система пуста";
      } else {
         boolean isFile = false;
         String string = "";

         for(int i = 0; i < fs.segments.size(); ++i) {
            string = string + "Сегмент " + i + "\n";

            for(int j = 0; j < ((Segment)fs.segments.get(i)).datas.size(); ++j) {
               if (((Data)((Segment)fs.segments.get(i)).datas.get(j)).type) {
                  isFile = true;
                  string = string + ((Data)((Segment)fs.segments.get(i)).datas.get(j)).name + " " + ((Data)((Segment)fs.segments.get(i)).datas.get(j)).size + "\n";
               }
            }
         }

         if (isFile) {
            return string;
         } else {
            return "Файловая система пуста";
         }
      }
   }

   public void execute(FileSystem fs) {
      this.monitor.writeMessage(toString(fs));
   }

   public void readParameters() {
   }
}
