//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ru.mephi.java.chapter01.lab02.Extra07.FileSystem.Functions;

import Structure.struct.FileSystem;
import Structure.struct.iMonitor;

public class BaseCommand {
    protected iMonitor monitor;
    protected FileSystem fileSystem;

    public BaseCommand(iMonitor im, FileSystem fileSystem) {
        this.monitor = im;
        this.fileSystem = fileSystem;
    }

    public BaseCommand() {
        this.monitor = null;
        this.fileSystem = null;
    }
}
