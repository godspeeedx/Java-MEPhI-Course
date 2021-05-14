package ru.mephi.java.chapter01.lab02.Extra07.Functions;

import Structure.struct.FileSystem;
import Structure.struct.iCommand;
import Structure.struct.iMonitor;

public class CreateSystem extends BaseCommand implements iCommand {
   protected String systemName;
   protected int systemSize;
   protected int maxSegmentNum;
   protected int maxDataNum;

   public CreateSystem(iMonitor im, FileSystem fileSystem) {
      super(im, fileSystem);
   }

   public void execute(FileSystem fs) {
      this.readParameters();
      FileSystem buf = new FileSystem(this.systemName, this.systemSize, this.maxSegmentNum, this.maxDataNum);
      fs.copy(buf);
      this.monitor.writeMessage("Готово!");
   }

   public void readParameters() {
      this.systemName = this.monitor.readString("Введите название системы:");
      this.systemSize = this.monitor.readSystemSize("Введите размер диска:");
      this.maxSegmentNum = this.monitor.readMaxSegmentNum("Введите максимальное число сегментов:");
      this.maxDataNum = this.monitor.readMaxDataNum("Введите максимальное число записей в каждом сегменте:");
   }
}
