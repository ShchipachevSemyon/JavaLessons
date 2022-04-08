package com.company.laba6;

import java.util.Arrays;

public class Example35_09 {
    static char[] switchElem(char arr[]) {
        char temp;
        for (int i = 0, j = arr.length - 1; i != arr.length / 2; i++, j--) {
            System.out.printf("Элемент " + arr[i] + " заменём элементом " + arr[j]);
            System.out.println();
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println("Массив после замены: " + Arrays.toString(arr));
        return arr;
    }
}
