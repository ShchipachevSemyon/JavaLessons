package com.company.laba6;

import java.util.Scanner;

public class Example35_05Main_alt {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите натуральное число");
        int number = scanner.nextInt();
        System.out.printf("Сумма квадратов чисел от 1 до " + number + " равно: \n" + Example35_05_alt.squaresOfNumbers(number));
    }
}

