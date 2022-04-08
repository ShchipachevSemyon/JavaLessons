package com.company.laba8.Example35_01;

public class Example35_01_01 {
    public static void m(int x) {
        System.out.println("x = " + x);
        if ((2 * x + 1) < 20) {
            m(2 * x + 1);
        }
    }

    public static void main(String[] args) {
        m(1);
    }
}
