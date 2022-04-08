package com.company.laba7.Example35_03;

public class SubClassExample35_03 extends SuperClassExample35_03 {

    public char ch1;

    SubClassExample35_03(int num, char ch1) {
        super(num);
        this.ch1 = ch1;
    }

    public char changeTheNumberAndChar(int num, char ch1) {
        changeTheNumber(num);
        this.ch1 = ch1;
        return ch1;
    }

    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue = "Class name: " + this.getClass().getSimpleName() + "\n" + " num = " + this.num + ", ch = " + this.ch1;
        return ClassNameAndFieldValue;
    }
}

