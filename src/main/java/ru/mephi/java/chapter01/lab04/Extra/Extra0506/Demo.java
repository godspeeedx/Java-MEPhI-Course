package ru.mephi.java.chapter01.lab04.Extra.Extra0506;

public class Demo {
    public static void main(String[] args) {

        //System.out.println(Rainbow.RED == MyOwn.WHAT); --compare different enums
        //int i = (Rainbow.BLUE * MyOwn.YOU) //--count with different enums
        System.out.println("String view for enums");
        System.out.println(MyOwn.ME);
        System.out.println("Iterate over enums");
        for (Rainbow r1 : Rainbow.values()) {
            System.out.println(r1 + "[" + r1.getNumber() + "]");
        }
        System.out.println("Compare");
        System.out.println(Rainbow.INDIGO.compareTo(Rainbow.GREEN));
        System.out.println("Safety");
        //System.out.println(methodsForRainbow(MyOwn.FROM));
        System.out.println(methodsForRainbow(Rainbow.RED));

    }

    public static String methodsForRainbow(Rainbow color) {
        return "This color is " + color.ordinal() + "in the rainbow";
    }
}
