package com.company.laba5;

import java.util.Scanner;

public class Example35_06Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число ");
        int number1 = scanner.nextInt();
        System.out.println("Введите второе число ");
        int number2 = scanner.nextInt();
        Example35_06 example35_06 = new Example35_06(number1, number2);
        System.out.println("Меньшее число " + example35_06.getMin() + ", большее число " + example35_06.getMax());
    }
}
