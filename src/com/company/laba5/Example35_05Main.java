package com.company.laba5;

import java.util.Scanner;

public class Example35_05Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число ");
        int numbers = scanner.nextInt();
        Example35_05 example35_05 = new Example35_05(numbers);
        System.out.println(example35_05.getNumber1());
    }
}
