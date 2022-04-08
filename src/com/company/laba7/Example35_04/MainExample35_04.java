package com.company.laba7.Example35_04;

public class MainExample35_04 {
    public static void main(String[] args) {
        SuperClassExample35_04 sup = new SuperClassExample35_04('p');
        SuperClassExample35_04 sup1 = new SuperClassExample35_04('2');
        System.out.println(sup.getChar1());
        System.out.println(sup1.getChar1());
        sup1.copy(sup.getChar1());
        System.out.println(sup.getChar1());
        System.out.println(sup1.getChar1());
    }
}
