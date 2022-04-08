package com.company.laba7.Example35_05;

public class MainExample35_05 {
    public static void main(String[] args) {
        SuperClassExample35_05 sup = new SuperClassExample35_05("ty");
        Sub1ClassExample35_05 sup1 = new Sub1ClassExample35_05("gh",5);
        Sub2ClassExample35_05 sup2 = new Sub2ClassExample35_05("bn",'8');
        System.out.println(sup.toString());
        System.out.println(sup1.toString());
        System.out.println(sup2.toString());
    }
}
