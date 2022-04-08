package com.company.laba1;

import java.util.Scanner;

public class example10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input day of the week: ");
        String day = s.nextLine();
        System.out.println("Input month");
        String month = s.nextLine();
        System.out.println("Input number");
        int number = s.nextInt();
        System.out.println(day + " " + number + " " + month );
        s.close();
    }
}
