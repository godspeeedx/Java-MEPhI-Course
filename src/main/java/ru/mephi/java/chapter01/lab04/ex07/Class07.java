package ru.mephi.java.chapter01.lab04.ex07;

public class Class07 {

    public static void main(String[] args) {

        for (Colors clrs : Colors.values()) {
            System.out.println(clrs);
        }

        Colors color1 = Colors.valueOf("BLACK");
        Colors color2 = Colors.CYAN;
        Object color3 = Colors.class;

        System.out.println("\n" + color1);
        System.out.println(color2);
        System.out.println(color3);

        System.out.println(color2.ordinal());
        System.out.println(color1.getBlue() + " " + color1.getGreen() + " " + color1.getRed());

    }

}
