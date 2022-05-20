package com.company.tasks1;

import java.io.PrintWriter;
import java.util.Scanner;

public class A_Plus_B_Problem {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int b = in.nextInt();
        int x = a + b;

        out.println(x);
        out.flush();
    }
}
