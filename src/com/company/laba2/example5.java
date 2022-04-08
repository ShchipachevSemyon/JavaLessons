package com.company.laba2;

import java.util.Scanner;
public class example5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("This number includes " + (Math.round(number / 1000)) +" thousand");
    }
}
