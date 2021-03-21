package ru.mephi.java.chapter01.lab02.ex03;

// Может ли модифицирующий метод вообще возвращать что-нибудь, кроме типа void?
// Можно ли создать метод доступа с возвращаемым типом void, т.е. ничего фактически не возвращающий?
// Приведите по возможности примеры таких методов.


import java.util.Scanner;
public class Konfeta {

    private String color;
    private boolean edible;
    private int amount;

    public Konfeta() {
        color = "Green";
        edible = true;
        amount = 1;
    }

    public void setColor(String color) { // Мутатор
        this.color = color;
    }

    public int eat(int amount) { //Мутатор, возвращающий int.
        this.amount -= amount;
        return amount;
    }

    public boolean getEdible() { //Аксессор
        return this.edible;
    }

    public void useless(){ //Аксессор, который не изменяет объект и ничего не возвращает.
        int useless = 2+2;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Choose the color of the candy!");
        String color = in.next();

        Konfeta marmeladka = new Konfeta();

        marmeladka.useless();

        marmeladka.setColor(color);
        System.out.println("Your marmeladka is " + marmeladka.color);
        if (marmeladka.getEdible())
            System.out.println("You can eat it.");
        else
            System.out.println("You better not eat it!");

        System.out.println("How much do you want to eat?");
        int hunger = in.nextInt();
        int eaten = marmeladka.eat(hunger);
        System.out.println("You have eaten " + eaten + " piece." + " There is " + marmeladka.amount + " pieces left.");


    }

}

