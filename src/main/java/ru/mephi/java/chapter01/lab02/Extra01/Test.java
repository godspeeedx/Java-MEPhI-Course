package ru.mephi.java.chapter01.lab02.Extra01;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        NewCal newCal = new NewCal();

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the day the week starts:");
        String weekStart = in.next();
        System.out.println("Enter the month:");
        int month = in.nextInt();
        System.out.println("Enter the year:");
        int year = in.nextInt();

        newCal.printAnyDayCal(weekStart,month,year);

    }
}
