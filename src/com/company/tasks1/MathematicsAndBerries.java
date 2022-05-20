package com.company.tasks1;

import java.io.PrintWriter;
import java.util.Scanner;

public class MathematicsAndBerries {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int b = in.nextInt();
        int a1 = in.nextInt();
        int b1 = in.nextInt();
        int a2 = in.nextInt();
        int b2 = in.nextInt();
        int c = a - a2;
        int c1 = b - b1;
        out.println(c + " " + c1);
        out.flush();
    }
}
