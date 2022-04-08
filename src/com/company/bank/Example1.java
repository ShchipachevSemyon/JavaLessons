package com.company.bank;

import java.util.Scanner;
public class Example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int n = scanner.nextInt();
        if (A <= B) System.out.println("NO");
        else if ((A-B)%2==0 &&((A-B)>=n)) System.out.println("YES");
        else System.out.println("NO");
    }
}
