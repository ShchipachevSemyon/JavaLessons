package com.company.tasks2;

import java.io.PrintWriter;
import java.util.*;

public class Flags {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        long numberOfWays = 2;
        if (n == 1) {
            System.out.println(2);
        } else {
            for (long i = 0, j = 1; j < n; i = numberOfWays - i, j++) {
                numberOfWays += i;
            }
            out.println(numberOfWays);
            out.flush();
        }
    }
}
