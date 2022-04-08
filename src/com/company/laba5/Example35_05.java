package com.company.laba5;

public class Example35_05 {

    private int number1;
    public int getNumber1() {
        if (number1 > 100) {
            number1 = 100;
        }
        return number1;
    }
    public void setNumber1(int number1) {
        this.number1 = number1;
    }
    public Example35_05() {
    }
    public Example35_05(int number1) {
        this.number1 = number1;
    }
}
