//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ru.mephi.java.chapter01.lab02.Extra07.FileSystem.Functions;

import Structure.struct.FileSystem;
import Structure.struct.iCommand;
import Structure.struct.iMonitor;

public class ChangeFileSize extends BaseCommand implements iCommand {
    protected String fileName;
    protected int fileLength;

    public ChangeFileSize(iMonitor im, FileSystem fileSystem) {
        super(im, fileSystem);
    }

    public void execute(FileSystem fs) {
        this.readParameters();
        if (DeleteFile.deleteFile(fs, this.fileName)) {
            int isFileCreate = CreateFile.createFile(fs, this.fileName, this.fileLength);
            if (isFileCreate == 0) {
                this.monitor.writeMessage("Файл успешно создан");
            } else if (isFileCreate == -1) {
                this.monitor.writeMessage("Недостаточно свободного места");
            } else if (isFileCreate == 1) {
                this.monitor.writeMessage("Файл уже существует");
            }
        } else {
            this.monitor.writeMessage("Файл не был найден");
        }

    }

    public void readParameters() {
        this.fileName = this.monitor.readString("Введите имя файла");
        this.fileLength = this.monitor.readFileSize("Введите длину файла");
    }
}
