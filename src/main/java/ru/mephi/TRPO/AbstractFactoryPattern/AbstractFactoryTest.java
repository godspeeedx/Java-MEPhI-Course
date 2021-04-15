package ru.mephi.TRPO.AbstractFactoryPattern;

public class AbstractFactoryTest {

    public static void main(String[] args) {
        String country = "BEL";
        InteAbsFactory ifactory = null;
        if (country.equals("BEL")) {
            ifactory = new BelBakeryPriceAbsFactory();
        } else if (country.equals("RU")) {
            ifactory = new RuBakeryPriceAbsFactory();
        }

        Donut donut = ifactory.getDonut();
        Cake cake = ifactory.getCake();
        Pancake pancake = ifactory.getPancake();

        System.out.println(donut.getDonutPrice());
        System.out.println(cake.getCakePrice());
        System.out.println(pancake.getPancakePrice());
    }
}
