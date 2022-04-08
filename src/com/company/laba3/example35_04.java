package com.company.laba3;

import java.util.Scanner;

public class example35_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int number1 = scanner.nextInt();
        System.out.println("Введите второе число");
        int number2 = scanner.nextInt();
        if (number1 > number2) {
            System.out.println(number2);
            for (int i = number2; i < number1; i++) {
                number2 = number2 + 1;
                System.out.println(number2);
            }
        } else if (number2 > number1) {
            System.out.println(number1);
            for (int i = number1; i < number2; i++) {
                number1 = number1 + 1;
                System.out.println(number1);
            }
        } else if (number1 == number2) {
            System.out.println(number1);
            System.out.println(number2);
        }
    }
}
