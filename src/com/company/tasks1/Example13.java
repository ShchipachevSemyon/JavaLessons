package com.company.tasks1;

import java.io.PrintWriter;
import java.util.*;

public class Example13 {
    public static void main(String[] args) {
        int people = 2;

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int guest = in.nextInt();
        List<String> guests = new ArrayList<>(guest);
        people+=guest;

        for (int i = 0; i < guest; i++) {
            guests.add(in.next());
        }
        for (String s : guests) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i)=='+'){
                    people++;
                }
            }
        }
        if (people==13){
            people++;
        }

        out.println(people*100);
        out.flush();
    }
}
