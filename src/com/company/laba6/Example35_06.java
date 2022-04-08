package com.company.laba6;

public class Example35_06 {
    static int[] returnArr(int array[], int pick) {
        if (pick <= array.length) {
            System.out.println("Введённое число, меньше длины массива ");
            int arrCopy[] = new int[pick];
            for (int i = 0; i < arrCopy.length; i++) {
                arrCopy[i] = array[i];
            }
            return arrCopy;
        } else {
            System.out.println("Введённое число, больше длины массива ");
            int arrCopy[];
            arrCopy = array;
            return arrCopy;
        }
    }
}
