package ru.mephi.java.chapter01.lab04.Extra.Extra03;

import ru.mephi.java.chapter01.lab04.Extra.Extra01.ExtendedPoint;

public class Test {
    public static void main(String[] args) {

        int[] ints = new int[]{1, 2};
        boolean[] booleans = new boolean[]{true, false};
        byte[] bytes = new byte[]{1, 2};
        short[] shorts = new short[]{1, 2};
        long[] longs = new long[]{1, 2};
        float[] floats = new float[]{1, 2};
        double[] doubles = new double[]{1, 2};
        ExtendedPoint[] extendedPoints = {new ExtendedPoint(1, 2), new ExtendedPoint(2, 1)};

        System.out.println(ints);
        System.out.println(booleans);
        System.out.println(bytes);
        System.out.println(shorts);
        System.out.println(longs);
        System.out.println(floats);
        System.out.println(doubles);
        System.out.println(extendedPoints);
    }
}
