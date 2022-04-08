package com.company.laba7.Example35_05;

public class Sub1ClassExample35_05 extends SuperClassExample35_05 {
    protected int number;

    Sub1ClassExample35_05(String string, int number) {
        super(string);
        this.number = number;
    }

    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue = "Class name: " + this.getClass().getSimpleName() + "\n" + "string = " + this.string +
                "\n" + "number = " + this.number;
        return ClassNameAndFieldValue;
    }
}
