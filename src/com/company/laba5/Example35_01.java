package com.company.laba5;

public class Example35_01 {

    private char ch1;

    public void setCh1(char ch1) {
        this.ch1 = ch1;
    }
    public int getCodeSymbol() {
        return this.ch1;
    }
    public void printCode() {
        System.out.println("code = " + ((int) this.ch1) + " value = " + this.ch1);
    }
}
