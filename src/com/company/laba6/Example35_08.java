package com.company.laba6;

public class Example35_08 {
    static int returnAverage(int arr[]) {
        int result = 0;
        for (int x : arr) {
            result += x;
        }
        result = result / arr.length;
        return result;
    }
}
