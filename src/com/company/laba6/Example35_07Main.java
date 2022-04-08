package com.company.laba6;

import java.util.Arrays;
import java.util.Scanner;

public class Example35_07Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = scanner.nextInt();
        char arr[] = new char[size];
        System.out.println("Введите значения, которые будут помещаться в массив");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.next().charAt(0);
        }
        System.out.println("\nЧисловое представление массива: " + Arrays.toString(Example35_07.returnCode(arr)));
    }
}
