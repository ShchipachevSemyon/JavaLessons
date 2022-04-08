package com.company.laba5;

public class Example35_02 {


    public char ch1;
    public char ch2;

    public void setCh1(char ch1) {
        this.ch1 = ch1;
    }
    public void setCh2(char ch2) {
        this.ch2 = ch2;
    }
    void compare() {

        if (ch1 > ch2) {
            for (char i = ch2; i < ch1; i++) {
                System.out.println(ch2);
                ch2++;
            }
            System.out.println(ch1);
        } else if (ch1 < ch2) {
            for (char i = ch1; i < ch2; i++) {
                System.out.println(ch1);
                ch1++;
            }
            System.out.println(ch2);
        } else {
            System.out.println(this.ch1);
            System.out.print(this.ch2);
        }
    }
}





