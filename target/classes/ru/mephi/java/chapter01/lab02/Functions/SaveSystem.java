package ru.mephi.java.chapter01.lab02.Extra07.Functions;

import Structure.struct.FileSystem;
import Structure.struct.iCommand;
import Structure.struct.iMonitor;

public class SaveSystem extends BaseCommand implements iCommand {
   public SaveSystem(iMonitor im, FileSystem fileSystem) {
      super(im, fileSystem);
   }

   public void execute(FileSystem fs) {
   }

   public void readParameters() {
   }
}
