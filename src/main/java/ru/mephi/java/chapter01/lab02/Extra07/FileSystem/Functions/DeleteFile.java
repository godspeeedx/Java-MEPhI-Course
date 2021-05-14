//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ru.mephi.java.chapter01.lab02.Extra07.FileSystem.Functions;

import Structure.struct.Data;
import Structure.struct.FileSystem;
import Structure.struct.Segment;
import Structure.struct.iCommand;
import Structure.struct.iMonitor;

public class DeleteFile extends BaseCommand implements iCommand {
    protected String fileName;

    public DeleteFile(iMonitor im, FileSystem fileSystem) {
        super(im, fileSystem);
    }

    public static boolean deleteFile(FileSystem fs, String fileName) {
        boolean findName = false;

        for(int i = 0; i < fs.segments.size(); ++i) {
            for(int j = 0; j < ((Segment)fs.segments.get(i)).datas.size(); ++j) {
                if (((Data)((Segment)fs.segments.get(i)).datas.get(j)).getName().equals(fileName)) {
                    ((Data)((Segment)fs.segments.get(i)).datas.get(j)).type = false;
                    findName = true;
                    return findName;
                }
            }
        }

        return findName;
    }

    public void execute(FileSystem fs) {
        this.readParameters();
        if (deleteFile(fs, this.fileName)) {
            this.monitor.writeMessage("‘айл удалЄн");
        } else {
            this.monitor.writeMessage("‘айл не был найден");
        }

    }

    public void readParameters() {
        this.fileName = this.monitor.readString("¬ведите им€ файла");
    }
}
