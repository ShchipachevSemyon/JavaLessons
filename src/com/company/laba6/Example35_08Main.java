package com.company.laba6;

import java.util.Scanner;

public class Example35_08Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        System.out.println("Введите значения, которые будут помещаться в массив");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Арифметическое среднее значение в этом массиве равно: " + Example35_08.returnAverage(arr));
    }
}
