package ru.mephi.java.chapter02.lab05.Extra.Extra2.Choices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Stroka implements Choice {
    @Override
    public ArrayList<String> read() {
        System.out.println("¬ведите строку, разные данные через зап€тую");
        Scanner sc = new Scanner(System.in);
        String sum = sc.nextLine();
        String[] pieces = sum.trim().split(",");
        ArrayList<String> s = new ArrayList<>();
        Collections.addAll(s, pieces);
        return s;
    }
}
