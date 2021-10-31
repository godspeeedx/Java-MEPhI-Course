package ru.mephi.java.chapter02.lab05.Extra.Extra1;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        try {
            setBirthday("01.01.20005");
        } catch (InvalidBirthdayException ex) {
            System.err.println("Кривая дата, уходи");
            ex.printStackTrace();
        }

        try {
            suppressedExample("magickPath");
        } catch (IOException ex) {
            ex.getSuppressed();
        }
    }

    public static void setBirthday(String birthDate) throws InvalidBirthdayException {
        DateFormat formatter = new SimpleDateFormat();
        try {
            Date birthday = formatter.parse(birthDate);
        } catch (ParseException ex) {
            throw new InvalidBirthdayException("Date of birth is invalid", ex);
        }
    }

    public static void suppressedExample(String filePath) throws IOException {
        Throwable firstException = null;
        FileInputStream fileIn = null;
        try {
            fileIn = new FileInputStream(filePath);
        } catch (IOException e) {
            firstException = e;
        } finally {
            try {
                fileIn.close();
            } catch (NullPointerException npe) {
                if (firstException != null) {
                    firstException.addSuppressed(npe);
                }
                firstException.printStackTrace();
            }
        }
    }
}
