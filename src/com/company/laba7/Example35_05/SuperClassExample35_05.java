package com.company.laba7.Example35_05;

public class SuperClassExample35_05 {
    protected String string;

    SuperClassExample35_05(String string) {
        this.string = string;
    }

    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue = "Class name: " + this.getClass().getSimpleName() + "\n" + "string = " + this.string;
        return ClassNameAndFieldValue;
    }
}
