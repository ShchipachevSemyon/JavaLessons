package com.company.tasks2;

import java.io.PrintWriter;
import java.util.*;

public class EigenvaluesPsychUp {
    public static void main(String[] args) {

        int f = 0;

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        List<Integer> first = new ArrayList<>(a);

        for (int i = 0; i < a; i++) {
            first.add(in.nextInt());
        }
        int b = in.nextInt();
        List<Integer> second = new ArrayList<>(b);

        for (int i = 0; i < b; i++) {
            second.add(in.nextInt());
        }

        int c = in.nextInt();
        List<Integer> third = new ArrayList<>(c);

        for (int i = 0; i < c; i++) {
            third.add(in.nextInt());
        }

        for (int i = 0; i < a; i++) {
            if(second.contains(first.get(i)) && third.contains(first.get(i))){
                f++;
            }
        }
        out.println(f);
        out.flush();
    }
}
