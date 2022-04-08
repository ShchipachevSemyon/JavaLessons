package com.company.laba6;

import java.util.Scanner;

public class Example35_04Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число, чтобы рассчитать его двойной факториал 'n!!'");
        int number = scanner.nextInt();
        System.out.println("Двойной факториал числа равен: " + Example35_04.doubleFactorial(number));
    }
}
