package com.company.laba7.Example35_02;

public class SubClassExample35_02 extends SuperClassExample35_02 {
    private String string2;
    public int num;

    SubClassExample35_02() {
    }

    SubClassExample35_02(String string1) {
        super(string1);
    }

    SubClassExample35_02(int num) {
        this.num = num;
    }

    SubClassExample35_02(String string2, int num) {
        this.string2 = string2;
        this.num = num;
    }

    public int stringLength(){
        return string2.length();
    }

}
