package com.company.laba1;

import java.util.Scanner;
public class example12 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the year of birth");
       int year = scanner.nextInt();
       System.out.println("Your age "+ (2021 - year));
        scanner.close();
    }
}
