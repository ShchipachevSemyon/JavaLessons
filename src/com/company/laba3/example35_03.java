package com.company.laba3;

import java.util.Scanner;

public class example35_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество нужных чисел Фибоначчи");
        int number = scanner.nextInt();
        int[] nums = new int[number];
        nums[0] = 1;
        nums[1] = 1;
        for (int i = 2; i < number; i++) {
            nums[i] = nums[i - 1] + nums[i - 2];
        }
        System.out.println("Количесвто чисел Фибоначчи "+number);
        for (int i = 0; i < number; i++) {
                System.out.println( nums[i]);
            }
        }
    }
