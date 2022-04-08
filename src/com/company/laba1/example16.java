package com.company.laba1;

import java.util.Scanner;
public class example16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        int number1 = number - 1;
        int number2 = number + 1;
        int number3 = (number1 + number + number2)*(number1 + number + number2);
        System.out.println(number1 + " " +number + " " + number2 + " " + number3);
        scanner.close();
    }
}
