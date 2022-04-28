package com.company.tasks1;

import java.io.PrintWriter;
import java.util.*;

public class Example16 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int j = 0;
        int k = 0;
        int f = 0;

        int n = in.nextInt();
        List<Integer> walls = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            walls.add(in.nextInt());
        }

        for (int i = 0; i < n - 2; i++) {
            j = walls.get(i) + walls.get(i + 1) + walls.get(i + 2);
            if (j > f) {
                f = j;
                k = i + 2;
            }
        }
        out.println(f + " " + k);
        out.flush();
    }
}