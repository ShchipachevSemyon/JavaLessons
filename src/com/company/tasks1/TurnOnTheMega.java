package com.company.tasks1;

import java.io.PrintWriter;
import java.util.Scanner;

public class TurnOnTheMega {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int k = in.nextInt();
        int n = in.nextInt();
        int[] a = new int[n];
        int b = 0;
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            b += a[i];
            b -= k;
            if (b < 0) {
                b = 0;
            }
        }
        out.println(b);
        out.flush();
    }
}
