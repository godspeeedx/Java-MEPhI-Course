package ru.mephi.java.chapter01.lab02.ex03;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Choose the color of the candy!");
        String color = in.next();

        Konfeta marmeladka = new Konfeta();

        marmeladka.printColor();

        marmeladka.setColor(color);
        System.out.println("Your marmeladka is " + marmeladka.getColor());
        if (marmeladka.getEdible())
            System.out.println("You can eat it.");
        else
            System.out.println("You better not eat it!");

        System.out.println("How much do you want to eat?");
        int hunger = in.nextInt();
        System.out.println("You have eaten " + marmeladka.eat(hunger) + " piece." + " There is " + marmeladka.getAmount() + " pieces left.");


    }
}
