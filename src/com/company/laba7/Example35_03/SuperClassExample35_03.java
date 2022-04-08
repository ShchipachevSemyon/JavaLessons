package com.company.laba7.Example35_03;

public class SuperClassExample35_03 {
    public int num;

    SuperClassExample35_03(int num) {
        this.num = num;
    }

    public int changeTheNumber(int num) {
        this.num = num;
        return this.num;
    }

    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue = "Class name: " + this.getClass().getSimpleName() + "\n" + " num = " + this.num;
        return ClassNameAndFieldValue;
    }
}
