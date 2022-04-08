package com.company.laba7.Example35_03;

public class MainExample35_03 {
    public static void main(String[] args) {
        SuperClassExample35_03 sup = new SuperClassExample35_03(3);
        SubClassExample35_03 sup1 = new SubClassExample35_03(3,'5');
        Sub2ClassExample35_03 sup2 = new Sub2ClassExample35_03(3,'5',"fff");
        System.out.println(sup.toString());
        System.out.println(sup1.toString());
        System.out.println(sup2.toString());
    }
}
