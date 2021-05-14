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

public class CreateFile extends BaseCommand implements iCommand {
    protected String fileName;
    protected int fileLength;

    public CreateFile(iMonitor im, FileSystem fileSystem) {
        super(im, fileSystem);
    }

    public static int createFile(FileSystem fs, String filename, int length) {
        if (!MethodsForFunctions.checkFileExist(fs, filename)) {
            int i = 0;

            while(true) {
                int j;
                if (i >= fs.segments.size()) {
                    if (fs.segments.size() == 0) {
                        fs.segments.add(new Segment(fs.maxDataNum));
                        ((Segment)fs.segments.get(0)).datas.add(new Data(filename, length));
                        ++((Segment)fs.segments.get(0)).currentDataNum;
                        Segment.lastBlockNumber += length;
                        return 0;
                    }

                    i = ((Segment)fs.segments.get(fs.segments.size() - 1)).datas.size() - 1;
                    j = fs.segments.size() - 1;
                    if (((Segment)fs.segments.get(j)).datas.size() != fs.maxDataNum) {
                        if (FileSystem.systemSize - Segment.lastBlockNumber > length) {
                            ((Segment)fs.segments.get(j)).datas.add(new Data(filename, length));
                            ++((Segment)fs.segments.get(j)).currentDataNum;
                            Segment.lastBlockNumber += length;
                            return 0;
                        }

                        return -1;
                    }

                    if (fs.segments.size() < fs.maxSegmentNum) {
                        fs.segments.add(new Segment(fs.maxDataNum));
                        if (FileSystem.systemSize - Segment.lastBlockNumber > length) {
                            ((Segment)fs.segments.get(j + 1)).datas.add(new Data(filename, length));
                            ++((Segment)fs.segments.get(j + 1)).currentDataNum;
                            Segment.lastBlockNumber += length;
                            return 0;
                        }

                        return -1;
                    }
                    break;
                }

                for(j = 0; j < ((Segment)fs.segments.get(i)).datas.size(); ++j) {
                    if (!((Data)((Segment)fs.segments.get(i)).datas.get(j)).type) {
                        if (length == ((Data)((Segment)fs.segments.get(i)).datas.get(j)).size) {
                            ((Data)((Segment)fs.segments.get(i)).datas.get(j)).type = true;
                            ++((Segment)fs.segments.get(i)).currentDataNum;
                            ((Data)((Segment)fs.segments.get(i)).datas.get(j)).name = filename;
                            return 0;
                        }

                        if (length < ((Data)((Segment)fs.segments.get(i)).datas.get(j)).size) {
                            int difference;
                            if (j != fs.maxDataNum - 1 && ((Segment)fs.segments.get(i)).datas.size() - j == 1 || j == fs.maxDataNum - 1 && fs.segments.size() - i == 1) {
                                difference = ((Data)((Segment)fs.segments.get(i)).datas.get(j)).size - length;
                                Segment.lastBlockNumber -= difference;
                                ++((Segment)fs.segments.get(i)).currentDataNum;
                                ((Data)((Segment)fs.segments.get(i)).datas.get(j)).type = true;
                                ((Data)((Segment)fs.segments.get(i)).datas.get(j)).name = filename;
                                return 0;
                            }

                            if (j + 1 < ((Segment)fs.segments.get(i)).datas.size() && !((Data)((Segment)fs.segments.get(i)).datas.get(j + 1)).type) {
                                difference = ((Data)((Segment)fs.segments.get(i)).datas.get(j)).size - length;
                                ((Data)((Segment)fs.segments.get(i)).datas.get(j)).type = true;
                                ((Data)((Segment)fs.segments.get(i)).datas.get(j)).name = filename;
                                ((Data)((Segment)fs.segments.get(i)).datas.get(j)).size = length;
                                ++((Segment)fs.segments.get(i)).currentDataNum;
                                Data var10000 = (Data)((Segment)fs.segments.get(i)).datas.get(j + 1);
                                var10000.size += difference;
                                return 0;
                            }
                        } else if (i + 1 == fs.segments.size() && j + 1 == ((Segment)fs.segments.get(i)).datas.size() && FileSystem.systemSize - Segment.lastBlockNumber - ((Data)((Segment)fs.segments.get(i)).datas.get(j)).size > length) {
                            Segment.lastBlockNumber -= ((Data)((Segment)fs.segments.get(i)).datas.get(j)).size;
                            Segment.lastBlockNumber += length;
                            ((Data)((Segment)fs.segments.get(i)).datas.get(j)).type = true;
                            ((Data)((Segment)fs.segments.get(i)).datas.get(j)).name = filename;
                            ++((Segment)fs.segments.get(i)).currentDataNum;
                            ((Data)((Segment)fs.segments.get(i)).datas.get(j)).size = length;
                            return 0;
                        }
                    }
                }

                ++i;
            }
        }

        return 1;
    }

    public void execute(FileSystem fs) {
        this.readParameters();
        int isFileCreate = createFile(fs, this.fileName, this.fileLength);
        if (isFileCreate == 0) {
            this.monitor.writeMessage("Файл успешно создан");
        } else if (isFileCreate == -1) {
            this.monitor.writeMessage("Недостаточно свободного места");
        } else if (isFileCreate == 1) {
            this.monitor.writeMessage("Файл уже существует");
        }

    }

    public void readParameters() {
        this.fileName = this.monitor.readString("Введите имя файла");
        this.fileLength = this.monitor.readFileSize("Введите длину файла");
    }
}
