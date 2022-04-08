package com.company.laba8.Example35_02;

import java.util.Scanner;

public class Example35_02 {
    public static void code(int n) {
        if (n > 1) {
            if (n % 2 == 1) {
                code(n / 2);
                System.out.print(1);
            } else {
                code(n / 2);
                System.out.print(0);
            }
        } else if (n == 1) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для перевода в двоичную систему");
        int code = scanner.nextInt();
        code(code);
    }
}
