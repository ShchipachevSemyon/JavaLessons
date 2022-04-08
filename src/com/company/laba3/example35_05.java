package com.company.laba3;

import java.util.Scanner;

public class example35_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сколько чисел надо сложить ");
        int number = scanner.nextInt();
        int[] nums = new int[number];
        int a = 0;
        int sum = 0;

        for (int i=0;i<100000;i++) {
            if (i%5 == 2 || i%3 == 1){
            nums[a] = i;
                sum = sum + nums[a];
            a++;
            if(a==number){
                break;
            }
            }
        }
        System.out.println(sum);
        }
}

