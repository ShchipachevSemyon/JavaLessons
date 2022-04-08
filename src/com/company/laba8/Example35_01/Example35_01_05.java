package com.company.laba8.Example35_01;

public class Example35_01_05 {
    public static int f(int n) {
        if (n == 0) {
            System.out.println("Внутри f(0)");
            return 0;
        } else if (n == 1) {
            System.out.println("Внутри f(1)");
            return 1;
        } else {
            System.out.println("Внутри f(" + n + ")");
            return f(n - 2) + f(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(f(39));
    }
}
