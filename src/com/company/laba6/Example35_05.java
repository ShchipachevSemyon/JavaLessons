package com.company.laba6;

public class Example35_05 {
    static int squaresOfNumbers(int num) {
        int result = 0;
        int prevResult;
        for (int i = num; i >= 0; i--) {
            if (i == 0) {
                return result;
            } else {
                prevResult = result;
                result = i * i + prevResult;
            }
        }
        return result;
    }
}
