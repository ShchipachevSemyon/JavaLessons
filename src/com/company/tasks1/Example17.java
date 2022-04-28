package com.company.tasks1;

import java.io.PrintWriter;
import java.util.*;

public class Example17 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int array[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = in.nextInt();
            }
        }
        for (int k = 0; k < n * 2; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (j + i == k) System.out.print(array[j][i] + " ");
                }
            }
        }
    }
}
