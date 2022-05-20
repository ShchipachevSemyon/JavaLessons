package com.company.tasks1;

import java.io.PrintWriter;
import java.util.Scanner;

public class UralSteaks {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int k = in.nextInt();
        if (k >= n) {
            int a = 2;
            out.println(a);
            out.flush();
        } else {
            if ((n * 2) % k == 0) {
                int a = (n * 2) / k;
                out.println(a);
                out.flush();
            } else {
                int a = (n * 2) / k + 1;
                out.println(a);
                out.flush();
            }
        }
    }
}
