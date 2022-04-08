package com.company.bank;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        long m = scanner.nextInt();
        long j = 0;
        if (n == m) j++;
        else if (n > m) {
            for (long i = n; i >= m; ) {
                i = i - m;
                j++;
                if (m > i) {
                    for (long f = m; f >= i; ) {
                        f = f - i;
                        j++;
                    }
                } else if (m == i) {
                    j++;
                    break;
                }
            }
        } else {
            for (long i = m; i >= n; ) {
                i = i - n;
                j++;
                if (n > i) {
                    for (long f = n; f >= i; ) {
                        f = f - i;
                        j++;
                    }
                } else if (n == i) {
                    j++;
                    break;
                }
            }
        }
        System.out.println(j);
    }
}
