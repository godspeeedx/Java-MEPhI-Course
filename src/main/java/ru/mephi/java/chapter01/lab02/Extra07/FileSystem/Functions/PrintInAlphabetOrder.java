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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrintInAlphabetOrder extends BaseCommand implements iCommand {
    public PrintInAlphabetOrder(iMonitor im, FileSystem fileSystem) {
        super(im, fileSystem);
    }

    public static String toString(FileSystem fs) {
        if (fs.segments.size() == 0) {
            return "Файловая система пуста";
        } else {
            ArrayList<Data> arrayList = new ArrayList();

            int i;
            for(i = 0; i < fs.segments.size(); ++i) {
                for(i = 0; i < ((Segment)fs.segments.get(i)).datas.size(); ++i) {
                    if (((Data)((Segment)fs.segments.get(i)).datas.get(i)).type) {
                        String name = ((Data)((Segment)fs.segments.get(i)).datas.get(i)).name;
                        int length = ((Data)((Segment)fs.segments.get(i)).datas.get(i)).size;
                        arrayList.add(new Data(name, length));
                    }
                }
            }

            if (arrayList.size() == 0) {
                return "Файловая система пуста";
            } else {
                String files = "";
                Collections.sort(arrayList, Comparator.comparing(Data::getName));

                for(i = 0; i < arrayList.size(); ++i) {
                    files = files + ((Data)arrayList.get(i)).name + " " + ((Data)arrayList.get(i)).size + "\n";
                }

                return files;
            }
        }
    }

    public void execute(FileSystem fs) {
        this.monitor.writeMessage(toString(fs));
    }

    public void readParameters() {
    }
}
