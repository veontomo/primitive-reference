package com.veontomo;

import java.util.Random;

public class DemoApplication {
    private static int n = 1000000000;

    private static Random generator = new Random();

    public static void main(String[] args) {
        double f1 = runForLong();
        System.out.println("Long/long: " + f1);
//        double f2 = runForInteger();
//        System.out.println("Integer/int: " + f2);
        double f3 = runForBoolean();
        System.out.println("Boolean/boolean: " + f3);

    }


    private static double runForBoolean() {
        long t1, t2;
        if (generator.nextBoolean()) {
            t1 = incrementPrimitiveBoolean(n);
            t2 = incrementWrapperBoolean(n);
        } else {
            t2 = incrementWrapperBoolean(n);
            t1 = incrementPrimitiveBoolean(n);
        }
        if (t1 != 0) {
            return ((double) t2) / ((double) t1);
        } else {
            return -1d;
        }
    }

    private static double runForLong() {
        long t1, t2;
        if (generator.nextBoolean()) {
            t1 = incrementPrimitiveLong(n);
            t2 = incrementWrapperLong(n);
        } else {
            t2 = incrementWrapperLong(n);
            t1 = incrementPrimitiveLong(n);
        }
        if (t1 != 0) {
            return ((double) t2) / ((double) t1);
        } else {
            return -1d;
        }
    }

    private static double runForInteger() {
        long t1, t2;
        if (generator.nextBoolean()) {
            t1 = incrementPrimitiveInt(n);
            t2 = incrementWrapperInteger(n);
        } else {
            t2 = incrementWrapperInteger(n);
            t1 = incrementPrimitiveInt(n);
        }
        if (t1 != 0) {
            return ((double) t2) / ((double) t1);
        } else {
            return -1d;
        }
    }

    private static long incrementWrapperLong(int n) {
        Long counter = 0L;
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            counter++;
        }
        long duration = System.currentTimeMillis() - start;
        assert counter == n : "wrong counter value";
        return duration;
    }

    private static long incrementPrimitiveLong(int n) {
        long counter = 0;
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            counter++;
        }
        long duration = System.currentTimeMillis() - start;
        assert counter == n : "wrong counter value";
        return duration;
    }

    private static long incrementPrimitiveInt(int max) {
        int counter = 0;
        long start = System.currentTimeMillis();
        for (int i = 0; i < max; i++) {
            counter++;
        }
        long duration = System.currentTimeMillis() - start;
        assert counter == max : "wrong counter value";
        return duration;
    }

    private static long incrementWrapperInteger(int n) {
        Integer counter = 0;
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            counter++;
        }
        long duration = System.currentTimeMillis() - start;
        assert counter == n : "wrong counter value";
        return duration;
    }

    private static long incrementPrimitiveBoolean(int max) {
        boolean counter = true;
        long start = System.currentTimeMillis();
        for (int i = 0; i < max; i++) {
            counter = !counter;
        }
        long duration = System.currentTimeMillis() - start;
        assert (max % 2 == 0) == counter : "wrong counter value";
        return duration;
    }

    private static long incrementWrapperBoolean(int max) {
        Boolean counter = Boolean.TRUE;
        long start = System.currentTimeMillis();
        for (int i = 0; i < max; i++) {
            counter = !counter;
        }
        long duration = System.currentTimeMillis() - start;
        assert counter.equals(max % 2 == 0) : "wrong counter value";
        return duration;
    }

}
