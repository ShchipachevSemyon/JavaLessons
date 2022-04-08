package com.company.laba6;

public class Example35_03 {
    static void getValues(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.printf("Наименьшее значение массива равно:" + arr[0] + ", наибольшее значение равно:" + arr[arr.length - 1] + ", среднее значение этого массива равно:" + (arr[arr.length / 2]));
    }
}

