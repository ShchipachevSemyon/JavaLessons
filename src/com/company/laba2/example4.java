package com.company.laba2;

import java.util.Scanner;
public class example4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        if (5 <= number && number<=10) {
            System.out.println("The number fits the requirements");
            }else {
                System.out.println("The number does not meet the requirements");
            }
        }
    }