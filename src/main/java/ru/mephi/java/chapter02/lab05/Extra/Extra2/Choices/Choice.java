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
                if (st.length() > 15 || (st.matches("[a-zA-Z]"))) {
                    exception = new FileFormatException("Проверьте правильность написания ФИО, не должно встречаться лишних символов и цифр, максимальная длина одного элемента - 15");
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
        if (!(email.matches("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}\\b"))) {
            if (exception != null) {
                exception.addSuppressed(new FileFormatException("Некорректный формат почты"));
            } else {
                exception = new FileFormatException("Некорректный формат почты");
            }
        }

        String phone = arrayList.get(3).replaceAll("\\s", "");
        if (phone.length() != 11 || (phone.matches("[78][0-9]]"))) {
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