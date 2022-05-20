package com.company.tasks1;

import java.io.PrintWriter;
import java.util.Scanner;

public class TwoBandits {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int b = in.nextInt();
        int x = a + b - 1;
        int l = x - a;
        int g = x - b;

        out.println(l);
        out.println(g);
        out.flush();
    }
}



