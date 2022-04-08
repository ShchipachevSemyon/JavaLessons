package com.company.laba3;

import java.util.Scanner;
import java.util.Random;
public class example35_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива ");
        int number = scanner.nextInt();
        int[] nums = new int[number];
        Random random = new Random();
        for (int i =0;i < nums.length;i++){
            nums[i]=random.nextInt(200);

        }
        int minElement = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < minElement) {
                minElement = nums[i];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == minElement) {
                System.out.println("Минимальный элемент массива[" +i+"] = "+nums[i]);
            }
        }

    }
}

