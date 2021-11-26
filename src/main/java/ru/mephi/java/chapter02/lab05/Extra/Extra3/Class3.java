package ru.mephi.java.chapter02.lab05.Extra.Extra3;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Class3 {
    public static void main(String[] args) {
        int f1 = 1;
        int f2 = 2;
        int f3 = 3;
        int f4 = 4;

        try {
            System.out.println(ExceptionMethod(f1, f2, f3, f4));
        } catch (MyException e) {
            e.printStackTrace();
        }
        ArrayList<Double> res = new ArrayList<>();
        Error er = ErrorsMethod(f1, f2, f3, f4, res);
        if (er == Error.OK) {
            System.out.println(res);
        } else System.out.println(er);
    }

    public static double ExceptionMethod(int f1, int f2, int f3, int f4) throws MyException {
        Double one = WithExceptions.toDouble(f1);
        Double two = WithExceptions.toDouble(f2);
        Double three = WithExceptions.toDouble(f3);
        Double four = WithExceptions.toDouble(f4);
        return one * two * three * four;
    }

    public static Error ErrorsMethod(int f1, int f2, int f3, int f4, ArrayList<Double> res) {
        ArrayList<Double> one = new ArrayList<>();
        ArrayList<Double> two = new ArrayList<>();
        ArrayList<Double> three = new ArrayList<>();
        ArrayList<Double> four = new ArrayList<>();

        if (WithErrors.toDouble(f1, one) == Error.OK) {
            if (WithErrors.toDouble(f2, two) == Error.OK) {
                if (WithErrors.toDouble(f3, three) == Error.OK) {
                    if (WithErrors.toDouble(f4, four) == Error.OK) {
                        res.add(one.get(0) * two.get(0) * three.get(0) * four.get(0));
                        return Error.OK;
                    }
                    return WithErrors.toDouble(f4, four);
                }
                return WithErrors.toDouble(f3, three);
            }
            return WithErrors.toDouble(f2, two);
        }
        return WithErrors.toDouble(f1, one);
    }

}
