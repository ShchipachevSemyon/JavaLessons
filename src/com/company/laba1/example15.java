package com.company.laba1;

import java.util.Scanner;
public class example15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int number1 = scanner.nextInt();
        System.out.println("Enter the second number");
        int number2 = scanner.nextInt();
        System.out.println("The result of addition "+(number1+number2));
        scanner.close();
    }
}