package com.veontomo;

public class Main {

    private static int i;
    private static float f;
    private static char c;
    private static boolean b;
    private static byte b2;
    public static void main(String[] args) {
        System.out.println("int: " + String.valueOf(i));
        System.out.println("float: " + String.valueOf(f));
        System.out.println("char: '" + String.valueOf(c) + "'");
        System.out.println("two chars: '" +  String.valueOf(c) + String.valueOf(c) + "'");
        System.out.println("boolean: " + String.valueOf(b) );
        System.out.println("byte: " + String.valueOf(b2) );

        int i = 1;
        Integer i2 = i;
    }


}
