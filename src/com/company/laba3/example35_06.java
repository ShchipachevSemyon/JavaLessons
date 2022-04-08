package com.company.laba3;

import java.util.Scanner;

public class example35_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива ");
        int number = scanner.nextInt();
        if (number > 0) {
            int[] nums = new int[number];
            int a = 0;
            for (int i = 0; i < 100000; i++) {
                if (i % 5 == 2) {
                    nums[a] = i;
                    System.out.println(nums[a]);
                    a++;
                    if (a == number) {
                        break;
                    }
                    }
                }
            }else {
            System.out.println("Введите число больше 0");
        }
    }
}