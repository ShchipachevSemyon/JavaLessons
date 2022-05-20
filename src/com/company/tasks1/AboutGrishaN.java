package com.company.tasks1;

import java.io.PrintWriter;
import java.util.Scanner;

public class AboutGrishaN {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        if (a > 6) {
            out.println("YES");
            out.flush();
        }
        if (a <= 6) {
            out.println("NO");
            out.flush();
        }
    }
}
