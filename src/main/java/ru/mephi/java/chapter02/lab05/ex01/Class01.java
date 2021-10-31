package ru.mephi.java.chapter02.lab05.ex01;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Class01 {
    static Logger LOGGER = Logger.getLogger(Class01.class.getName());
    static String resourcesFilePath = "src" + File.separator
            + "main" + File.separator
            + "resources" + File.separator;

    public static void main(String[] args) throws IOException {

        String filePath = resourcesFilePath + "lab5.txt";
        System.out.println(readValues(filePath));
    }

    public static ArrayList<Double> readValues(String filename) {
        if (filename == null || filename.isEmpty()) {
            throw new IllegalArgumentException("Invalid file's name");
        }
        ArrayList<Double> doubleArrayList = new ArrayList<>();
        LOGGER.info("Start reading from file " + filename);
        try {
            for (String line : Files.readAllLines(Paths.get(filename))) {
                try {
                    doubleArrayList.add(Double.parseDouble(line));
                } catch (NullPointerException | NumberFormatException ex) {
                    LOGGER.log(Level.SEVERE,
                            "Line " + line + " isn't a float-pointing number", ex);
                    System.exit(1);
                }
            }
        } catch (IOException e) {
            e.getCause();
            LOGGER.log(Level.SEVERE, "I/O exception while reading doubles from " + e.getMessage(),  e.getCause());
            LOGGER.info("nothing was read");
        }
        LOGGER.info("End of reading from file" + filename);
        return doubleArrayList;
    }

    public static String getResourcesFilePath() {
        return resourcesFilePath;
    }

}