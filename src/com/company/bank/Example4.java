package com.company.bank;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        if (n % 32 == 0 && m % 32 == 0) System.out.println(256);
        else if (n % 16 == 0 && m % 16 == 0) System.out.println(16);
        else if (n % 8 == 0 && m % 8 == 0) System.out.println(4);
        else if (n % 4 == 0 && m % 4 == 0) System.out.println(2);
        else System.out.println(0);
    }
}
