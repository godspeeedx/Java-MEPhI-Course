package ru.mephi.java.chapter02.lab05.Extra.Extra2.Choices;

import ru.mephi.java.chapter02.lab05.Extra.Extra2.FileFormatException;

import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.ArrayList;

public interface Choice {

    default void execute() throws Exception {
        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
        ArrayList<String> arrayList = this.read();
        Exception exception = null;
        if (arrayList.size() != 4) {
            throw new FileFormatException("Количество строк не соответствует логике задания");
        }
        if (arrayList.get(0).split(" ").length != 3) {
            exception = new FileFormatException("Проверьте наличие имени, фамилии и отчества - их количество должно быть равно 3");
        } else {
            String[] s = arrayList.get(0).split(" ");
            for (String st : s) {
                if (st.matches("[a-zA-Z+]")) {
                    exception = new FileFormatException("Проверьте правильность написания ФИО, не должно встречаться лишних символов и цифр");
                }
            }
        }
        try {
            df.parse(arrayList.get(1));
        } catch (ParseException e) {
            if (exception != null) {
                exception.addSuppressed(e);
            } else {
                exception = e;
            }
        }
        String email = arrayList.get(2).trim();
        if (!(email.contains(" ")) && !(email.contains("~"))) {
            int countDog = 0;
            int countDot = 0;
            for (int i = 0; i < email.length(); i++) {
                if (email.charAt(i) == '@') {
                    countDog++;
                }
                if (email.charAt(i) == '.') {
                    countDot++;
                }
                if (countDog == 2 || countDot > countDog) {
                    if (exception != null) {
                        exception.addSuppressed(new FileFormatException("Некорректный формат электронного адреса"));
                    } else {
                        exception = new FileFormatException("Некорректный формат электронного адреса");
                    }
                    break;
                }
            }
        } else {
            if (exception != null) {
                exception.addSuppressed(new FileFormatException("В электронном адресе сторонние символы"));
            } else {
                exception = new FileFormatException("В электронном адресе сторонние символы");
            }
        }
        String phone = arrayList.get(3).replaceAll("\\s", "");
        if (phone.length() != 11 || !(phone.matches("[-+]?\\d+"))) {
            if (exception != null) {
                exception.addSuppressed(new FileFormatException("Некорректный формат телефона"));
            } else {
                exception = new FileFormatException("Некорректный формат телефона");
            }
        }
        if (exception != null) {
            throw exception;
        }
    }

    ArrayList<String> read() throws FileNotFoundException;
}