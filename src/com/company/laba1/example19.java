package com.company.laba1;

public class example19 {
    static double a = 8.0, b = 2.0, c;

    public static double hyp() {
        return c = Math.sqrt(a * a + b * b);
    }

    public static void main(String[] args) {
        System.out.println("katet а=" + a);
        System.out.println("katet b=" + b);
        System.out.println("hypotenuse с=" + hyp());
    }
}