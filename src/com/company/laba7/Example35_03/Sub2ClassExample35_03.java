package com.company.laba7.Example35_03;

public class Sub2ClassExample35_03 extends SubClassExample35_03 {
    public String st1;

    Sub2ClassExample35_03(int num, char ch1, String st1) {
        super(num, ch1);
        this.st1 = st1;
    }

    public String changeTheNumberCharAndString(int num, char ch1, String st1) {
        changeTheNumberAndChar(num, ch1);
        this.st1 = st1;
        return st1;
    }

    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue = "Class name: " + this.getClass().getSimpleName() + "\n" + " num = " + this.num +
                ", ch = " + this.ch1 + ", srt = " + this.st1;
        return ClassNameAndFieldValue;
    }
}
