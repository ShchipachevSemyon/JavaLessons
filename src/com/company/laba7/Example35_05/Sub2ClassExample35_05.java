package com.company.laba7.Example35_05;

public class Sub2ClassExample35_05 extends SuperClassExample35_05 {
    protected char char1;

    Sub2ClassExample35_05(String string, char char1) {
        super(string);
        this.char1 = char1;
    }

    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue = "Class name: " + this.getClass().getSimpleName() + "\n" + "string = " + this.string +
                "\n" + "char = " + this.char1;
        return ClassNameAndFieldValue;
    }
}
