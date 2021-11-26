package ru.mephi.java.chapter02.lab05.Extra.Extra3;

import java.util.ArrayList;

public class WithErrors {
    public static Error checkValue(int i){
        if (i>5){
            return Error.MORE_THAN_5;
        }
        return Error.OK;
    }

    public static Error toDouble(int i, ArrayList<Double> doubles){
        Error error = checkValue(i);
        if (error == Error.OK){
            doubles.add((double) i);
        }
        return error;
    }
}
