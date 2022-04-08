package com.company.laba7.Example35_02;

public class Example35_02 {
    public static void main(String[] args) {
        SuperClassExample35_02 str = new SuperClassExample35_02("Проверка");
        SubClassExample35_02 str1 = new SubClassExample35_02("Прове",5);
        System.out.println(str.stringLength());
        System.out.println(str1.stringLength());
    }
}
