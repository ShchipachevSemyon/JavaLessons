package com.company.tasks2;

import java.io.PrintWriter;
import java.util.Scanner;

public class ASimpleExpression {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (b * c < b + c) {
            int d = a - b - c;
            out.println(d);
            out.flush();
        } else {
            int d = a - b * c;
            out.println(d);
            out.flush();
        }
    }
}
