package com.company.tasks2;

import java.util.Scanner;

public class DonaldIsThePostman {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int number = 0;
        if (n == 0) {
            System.out.println(1);
        } else if (n > 0) {
            for (int i = 1; i <= n; i++) {
                number += i;
            }
            System.out.println(number);
        } else {
            for (int i = 1; i >= n; i--) {
                number += i;
            }
            System.out.println(number);
        }
    }
}

