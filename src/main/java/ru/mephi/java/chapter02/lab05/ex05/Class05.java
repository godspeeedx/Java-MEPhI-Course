package ru.mephi.java.chapter02.lab05.ex05;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Class05 {

    public void method(String filenameFrom, String filenameTo) throws Exception {
        Scanner sc = null;
        File file;
        PrintWriter printWriterOut = null;
        Exception ex = null;
        try {
            file = new File(filenameFrom);
            sc = new Scanner(file);
            printWriterOut = new PrintWriter(filenameTo);
            while (sc.hasNext()) {
                printWriterOut.println(sc.next().toLowerCase());
            }
        } catch (Exception e) {
            ex = e;
        } finally {
            try {
                if (sc != null) {
                    sc.close();
                }
            } catch (RuntimeException e) {
                if (ex != null) {
                    ex.addSuppressed(e);
                } else {
                    ex = e;
                }
            }
            try {
                if (printWriterOut != null) {
                    printWriterOut.close();
                }
            } catch (RuntimeException e) {
                if (ex != null) {
                    ex.addSuppressed(e);
                } else {
                    ex = e;
                }
            }
        }
        if (ex != null) {
            throw ex;
        }
    }
}
