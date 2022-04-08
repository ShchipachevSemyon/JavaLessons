package com.company.laba7.Example35_04;

public class Sub2ClassExample35_04 extends SubClassExample35_04 {
    public int number;

    Sub2ClassExample35_04(char char1, String string, int number) {
        super(char1, string);
        this.number = number;
    }

    public void copy(char char1, String string, int number) {
        copy(char1, string);
        this.number = number;
    }

    public String getString() {
        return string;
    }
}
