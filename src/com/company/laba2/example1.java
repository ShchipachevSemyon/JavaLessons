package com.company.laba2;

import java.util.Scanner;

public class example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        if (number % 3 == 0)
        {
            System.out.println("The number is divided by three");
        }
        else{
            System.out.println("The number is not divisible by three");
        }
    }
}
