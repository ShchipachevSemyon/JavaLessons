package com.company.laba7.Example35_04;

public class SubClassExample35_04 extends SuperClassExample35_04{
    public String string;

    SubClassExample35_04(char char1, String string) {
        super(char1);
        this.string = string;
    }

    public void copy(char char1,String string) {
        copy(char1);
        this.string = string;
    }

    public String getString() {
        return string;
    }
}

