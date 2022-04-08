package com.company.bank;

import java.util.Scanner;
public class Example3 {
    public static void main(String[] args) {
        long x =0;
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        long [] arrays = new long[(int) n];
        for (int i = 0;i<arrays.length;i++){
            arrays[i]= Long.parseLong(scanner.next());
            for (long j=0;j<arrays.length;j++){
                if(x*x -arrays[i]<=0)x++;
            }
        }System.out.println(x);
    }
}
