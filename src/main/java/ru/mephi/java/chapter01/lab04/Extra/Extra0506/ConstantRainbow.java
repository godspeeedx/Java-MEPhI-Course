package ru.mephi.java.chapter01.lab04.Extra.Extra0506;

public class ConstantRainbow {

    public static final int RED = 1;
    public static final int ORANGE = 2;
    public static final int YELLOW = 3;
    public static final int GREEN = 4;
    public static final int BLUE = 5;
    public static final int INDIGO = 6;
    public static final int VIOLET = 7;

    public static final int MYTESTCONST = 1;
    public static final int MYOTHERTESTCONST = 2;

    public static String methodsForRainbow(int what) {
        return "What is the point of this = " + what;
    }

    public static void main(String[] args) {
        System.out.println("Count with consts");
        int i = (RED + ORANGE + YELLOW) / INDIGO;
        System.out.println(i);
        System.out.println("Compare different constants");
        System.out.println(GREEN == MYTESTCONST);
        System.out.println("No string view for consts");
        System.out.println(BLUE);
        System.out.println("Not safe");
        System.out.println(methodsForRainbow(MYOTHERTESTCONST));
    }
}
