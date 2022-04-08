package com.company.laba6;

public class Example35_04 {
    static int doubleFactorial(int num) {
        int result;
        if (num % 2 == 0) {
            if (num == 2) return 2;
            result = doubleFactorial(num - 2) * num;
            return result;
        } else {
            if (num == 1) return 1;
            result = doubleFactorial(num - 2) * num;
            return result;
        }
    }
}

