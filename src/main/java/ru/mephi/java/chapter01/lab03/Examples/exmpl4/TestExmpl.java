package ru.mephi.java.chapter01.lab03.Examples.exmpl4;

import java.util.function.Consumer;

public class TestExmpl {
    public static void main(String[] args) {

        //String stroka = "I am probably really nervous right now.";
        int number = 7;
        String another = " The number is ";
        //number = 17;
        Consumer<String> adverb = (adv) -> System.out.println (another + adv + number);
        adverb.accept("definetely ");
        //number = 27;
    }
}
