package com.company.tasks1;

import java.io.PrintWriter;
import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = a*(b+1);
        out.println(c);
        out.flush();
    }
}

