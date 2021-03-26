package ru.mephi.java.ch02.task03;

// Может ли модифицирующий метод вообще возвращать что-нибудь, кроме типа void?
// Можно ли создать метод доступа с возвращаемым типом void, т.е. ничего фактически не возвращающий?
// Приведите по возможности примеры таких методов.


import java.util.Scanner;
public class Apple {
    private boolean rotten;
    private int amount;

    public Apple() {
        rotten = false;
        amount = 3;
    }
    public void setRottenness(boolean rotten) { // Модифиц
        this.rotten = rotten;
    }
    public int eat(int amount) { //Модиф, возвращающий int.
        this.amount -= amount;
        return amount;
    }
    public boolean getRottenness() { //Доступ
        return rotten;
    }
    public void printRottenness(){ //Доступ, который не изменяет объект и ничего не возвращает.
        System.out.println(rotten);
    }

    public static void main(String[] args) {
        System.out.println("Let me give you some apples");
        Apple you = new Apple();
        System.out.println("Now you have " + you.amount + " apples");
        System.out.println("Let's eat one");
        you.eat(1);
        System.out.println("You ate one, and now you have " + you.amount + " apples");
        System.out.println("Are you sure that it was okey to eat this apples? Am I true that there are rotten?");
        System.out.println("You are " + you.getRottenness());
        you.setRottenness(true);
        System.out.println("And how about now? Am I true? \n You are");
        you.printRottenness();
    }

}
