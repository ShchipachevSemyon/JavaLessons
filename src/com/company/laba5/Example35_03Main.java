package com.company.laba5;

public class Example35_03Main {

    public static void main(String[] args) {
        Example35_03 ns1 = new Example35_03();
        Example35_03 ns2 = new Example35_03(2);
        Example35_03 ns3 = new Example35_03(3, 6);
        System.out.println(ns1.getNumbers1());
        System.out.println(ns2.getNumbers1());
        System.out.println(ns3.getNumbers1() + " " + ns3.getNumbers2());
    }
}
