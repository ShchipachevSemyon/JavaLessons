package com.company.tasks1;

import java.io.PrintWriter;
import java.util.*;

public class Example15 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int m = in.nextInt();
        int n = in.nextInt();

        if (m * n % 2 == 0) {
            out.println("[:=[first]");
            out.flush();
        } else {
            out.println("[second]=:]");
            out.flush();
        }
    }
}