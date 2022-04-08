package com.company.laba6;

import java.util.Arrays;
import java.util.Scanner;

public class Example35_03Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел, которые будут обрабатываться");
        int quantity = scanner.nextInt();
        int array[] = new int[quantity];
        System.out.println("Введите числа которые будут обрабатываться");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Массив состоит из:\n" + Arrays.toString(array));
        new Example35_03();
        Example35_03.getValues(array);
    }
}

