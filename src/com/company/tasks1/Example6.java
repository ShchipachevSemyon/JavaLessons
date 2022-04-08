package com.company.tasks1;

import java.io.PrintWriter;
import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int b = in.nextInt();
        if ((a % 2 == 0) || (b % 2 == 1)) {
            out.println("yes");
            out.flush();
        } else {
            out.println("no");
            out.flush();
        }
    }
}

