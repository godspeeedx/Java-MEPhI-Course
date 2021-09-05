package ru.mephi.java.chapter01.lab04.ex06;

public class Class06 {

    public static void main(String[] args) {

        DiscountedItem item1 = new DiscountedItem("Same", 10, 1);
        Item item2 = new Item("Same", 10);
        DiscountedItem item3 = new DiscountedItem("Same", 10, 9);

        System.out.println(item1.equals(item2));
        System.out.println(item2.equals(item3));
        System.out.println(item1.equals(item3));
    }

}
