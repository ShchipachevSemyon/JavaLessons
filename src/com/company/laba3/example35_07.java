package com.company.laba3;

import java.util.Scanner;

public class example35_07 {
    public static void main(String[] args) {

        String[] strings = new String[]{"a", "c", "e", "g", "i", "k", "m", "o", "q", "s"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 10");
        int number = scanner.nextInt();
        System.out.println("Массив в прямом порядке");
        for (int i = 0; i < number; i++) {
            System.out.println(strings[i]);
        }
        System.out.println("Массив в обратном порядке");
        for (int i = number-1; i != -1; i--) {
            System.out.println(strings[i]);
        }
    }
}
