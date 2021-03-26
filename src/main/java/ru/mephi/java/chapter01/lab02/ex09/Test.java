package ru.mephi.java.chapter01.lab02.ex09;

public class Test {
    public static void main(String[] args) {
        Class09.Car golf = new Class09.Car(10);
        golf.drive(110);
        golf.refuel(5);
        System.out.println("Fuel level is " + golf.getFuel());
        System.out.println("Distance traveled is " + golf.getDistance());
    }
}
