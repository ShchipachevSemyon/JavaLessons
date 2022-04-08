package com.company.tasks1;

import java.io.PrintWriter;
import java.util.Scanner;
public class Example12_dodelat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int a =in.nextInt();
        String arrays[] = new String[a];
        for (int i=0;i<a;i++){
            arrays[i]=in.next();
            char arrays1 [] = new char[arrays[i].length()];
            for (int j = 0;j<arrays[i].length();j++){
                arrays1[j]=arrays[i].charAt(j);
            }

        }

    }
}
