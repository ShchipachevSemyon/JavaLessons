package com.company.laba1;

import java.util.Scanner;

public class example14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age ");
        int year = scanner.nextInt();
        System.out.println("Your year of birth: " + (2021-year));
        scanner.close();
    }
}