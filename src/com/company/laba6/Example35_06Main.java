package com.company.laba6;

import java.util.Arrays;
import java.util.Scanner;

public class Example35_06Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        System.out.println("Введите значения массива");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Введите число, которое определит, сколько чисел выберутся из массива");
        int pickVal = scanner.nextInt();
        System.out.println("Копия массива выглядит: " + Arrays.toString(Example35_06.returnArr(arr, pickVal)));
    }
}
