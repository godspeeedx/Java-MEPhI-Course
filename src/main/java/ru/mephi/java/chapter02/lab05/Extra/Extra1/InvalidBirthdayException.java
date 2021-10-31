package ru.mephi.java.chapter02.lab05.Extra.Extra1;

import java.io.Serial;

public class InvalidBirthdayException extends Exception {
    @Serial
    private static final long serialVersionUID = 2342686055658047285L;

    public InvalidBirthdayException(String message, Throwable cause) {
        super(message, cause);
    }

}