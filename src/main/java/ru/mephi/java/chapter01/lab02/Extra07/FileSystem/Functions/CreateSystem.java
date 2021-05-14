//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ru.mephi.java.chapter01.lab02.Extra07.FileSystem.Functions;

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
        this.monitor.writeMessage("������!");
    }

    public void readParameters() {
        this.systemName = this.monitor.readString("������� �������� �������:");
        this.systemSize = this.monitor.readSystemSize("������� ������ �����:");
        this.maxSegmentNum = this.monitor.readMaxSegmentNum("������� ������������ ����� ���������:");
        this.maxDataNum = this.monitor.readMaxDataNum("������� ������������ ����� ������� � ������ ��������:");
    }
}
