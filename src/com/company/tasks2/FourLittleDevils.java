package com.company.tasks2;

import java.util.*;

public class FourLittleDevils {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        if ((n*(n+1)/2) % 2 == 0) {
            System.out.println("black");
        }
        else {
            System.out.println("grimy");
        }
    }
}
