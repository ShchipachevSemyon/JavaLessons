package com.company.laba1;

import java.util.Scanner;

import static java.lang.Math.pow;

public class example20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = scanner.nextInt();
        System.out.println("Enter the second number");
        int b = scanner.nextInt();
        System.out.println(Math.pow(a, b));
        scanner.close();
    }
}