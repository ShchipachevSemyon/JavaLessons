package com.company.laba1;

import java.util.Scanner;

public class example9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input name: ");
        String name = s.nextLine();
        System.out.println("Input age");
        int age = s.nextInt();
        System.out.println("Name: "+name + ", Age: " +age);
        s.close();
    }
}
