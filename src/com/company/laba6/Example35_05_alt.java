package com.company.laba6;

public class Example35_05_alt {
    static int squaresOfNumbers(int num) {
        int result;
        if (num == 1) return 1;
        result = squaresOfNumbers(num - 1) + num * num;
        return result;
    }
}

