package com.company.laba5;

public class Example35_06 {

    private int max;
    private int min;
    public int getMax() {
        return max;
    }
    public Example35_06(int max, int min) {
        if (min > max) {
            this.max = min;
        } else {
            this.max = max;
        }
        if (min > max) {
            this.min = max;
        } else {
            this.min = min;
        }
    }
    public int getMin() {
        return min;
    }
}

