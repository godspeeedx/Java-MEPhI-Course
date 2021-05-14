//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ru.mephi.java.chapter01.lab02.Extra07.FileSystem.struct;

import java.util.ArrayList;

public class Segment {
    public static int lastBlockNumber = 1;
    public int firstBlockNumber;
    public ArrayList<Data> datas;
    public int currentDataNum;

    public Segment(int maxDataNum) {
        this.firstBlockNumber = lastBlockNumber;
        this.datas = new ArrayList(maxDataNum);
        this.currentDataNum = 0;
    }
}
