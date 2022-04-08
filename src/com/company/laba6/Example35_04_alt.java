package com.company.laba6;

public class Example35_04_alt {
    static int factorial(int n) {
        int result = 1;
        for (int i = n; i >= 0; i = i - 2) {
            if (i == 0 || i == 1) {
                return result;
            } else {
                result *= i;
            }
        }
        return result;
    }
}



