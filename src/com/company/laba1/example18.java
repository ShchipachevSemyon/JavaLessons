package com.company.laba1;

import static java.lang.Math.log;

public class example18 {
    static double a = 10.0, b = 4.0, c;

    public static double hyp() {
        return c = Math.sqrt(a * a + b * b);
    }

    public static void main(String[] args) {
        System.out.println("katet а=" + a);
        System.out.println("katet b=" + b);
        System.out.println("hypotenuse с=" + hyp());
        System.out.println(Math.exp(b*log(a)));
    }
}

